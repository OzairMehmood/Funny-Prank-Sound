package com.ozair.funnypranksounds.Models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> liveData = new MutableLiveData<>();

    public void setLiveData(String value) {
        liveData.setValue(value);
    }

    public LiveData<String> getLiveData() {
        return liveData;
    }
}
