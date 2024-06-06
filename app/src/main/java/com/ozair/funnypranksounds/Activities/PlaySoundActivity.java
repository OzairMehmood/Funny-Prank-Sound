import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.ozair.funnypranksounds.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PlaySoundActivity extends AppCompatActivity {
    private static final int REQUEST_PERMISSION_WRITE = 1001;
    private static final String TAG = "PlaySoundActivity";

    ImageView playImage, Downloadbtn;
    TextView tapToPlay, taptopause, toolbartext;
    private MediaPlayer mediaPlayer;
    RelativeLayout playLay;
    LottieAnimationView lottieAnimationView;
    private boolean isPlaying = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sound);
        lottieAnimationView = findViewById(R.id.lotiee);
        playLay = findViewById(R.id.pal_lay);
        toolbartext = findViewById(R.id.tooltext);
        Downloadbtn = findViewById(R.id.downloadimg);
        taptopause = findViewById(R.id.taptopause);
        playImage = findViewById(R.id.playimg);
        tapToPlay = findViewById(R.id.taptoplay);

        int imageFile = getIntent().getIntExtra("imageFile", -1);
        int soundFile = getIntent().getIntExtra("soundFile", -1);
        int nameFile = getIntent().getIntExtra("soundname", 0);
        toolbartext.setText(String.valueOf(nameFile));

        if (imageFile != -1) {
            // Set the image in the ImageView using Glide
            Glide.with(this)
                    .load(imageFile)
                    .into(playImage);
        }

        if (soundFile != -1) {
            playImage.setOnClickListener(v -> {
                if (isPlaying) {
                    stopPlaying();
                    lottieAnimationView.setVisibility(View.GONE);
                } else {
                    startPlaying(soundFile);
                    lottieAnimationView.setVisibility(View.VISIBLE);
                }
                toggleTapToPlayVisibility();
            });
        }

        Downloadbtn.setOnClickListener(v -> {
            if (checkPermission()) {
                startDownload(soundFile);
            } else {
                requestPermission();
            }
        });
    }

    private boolean checkPermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_WRITE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION_WRITE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission granted.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission denied.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startPlaying(int soundFile) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundFile);
        mediaPlayer.start();
        isPlaying = true;
    }

    private void stopPlaying() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        isPlaying = false;
    }

    private void toggleTapToPlayVisibility() {
        if (tapToPlay.getVisibility() == TextView.VISIBLE) {
            tapToPlay.setVisibility(TextView.GONE);
            taptopause.setVisibility(TextView.VISIBLE);
        } else {
            tapToPlay.setVisibility(TextView.VISIBLE);
            taptopause.setVisibility(TextView.GONE);
        }
    }

    private void startDownload(int soundFile) {
        new DownloadFileTask().execute(getString(soundFile));
    }

    private class DownloadFileTask extends AsyncTask<String, Void, Boolean> {

        @Override
        protected Boolean doInBackground(String... strings) {
            String fileUrl = strings[0];
            try {
                URL url = new URL(fileUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                // Input stream to read file - with 8k buffer
                InputStream input = connection.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead;

                // Output stream to write file
                File outputFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "sound.mp3");
                FileOutputStream outputStream = new FileOutputStream(outputFile);

                while ((bytesRead = input.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                // Close streams
                outputStream.flush();
                outputStream.close();
                input.close();
                return true;
            } catch (Exception e) {
                Log.e(TAG, "Error downloading file: " + e.getMessage());
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean result) {
            super.onPostExecute(result);
            if (result) {
                Toast.makeText(PlaySoundActivity.this, "Download complete!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(PlaySoundActivity.this, "Download failed!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
