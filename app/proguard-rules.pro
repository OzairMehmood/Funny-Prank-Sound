# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# Preserve the public API of your library
-keep public class * {
    public protected *;
}

# Preserve all annotations
-keepattributes Annotation

# Keep rules from missing_rules.txt
-keep class com.example.missing.Class1 { *; }
-keep class com.example.missing.Class2 { *; }
-keep interface com.example.missing.Interface1 { *; }

# Suppress warnings for specific classes
-dontwarn com.appsflyer.adrevenue.AppsFlyerAdRevenue
-dontwarn com.appsflyer.adrevenue.adnetworks.generic.MediationNetwork
-dontwarn com.bytedance.sdk.openadsdk.api.PAGConstant$PAGDoNotSellType
-dontwarn com.bytedance.sdk.openadsdk.api.PAGConstant$PAGGDPRConsentType
-dontwarn com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener
-dontwarn com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener
-dontwarn com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest
-dontwarn com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize
-dontwarn com.bytedance.sdk.openadsdk.api.init.PAGConfig$Builder
-dontwarn com.bytedance.sdk.openadsdk.api.init.PAGConfig
-dontwarn com.bytedance.sdk.openadsdk.api.init.PAGSdk$PAGInitCallback
-dontwarn com.bytedance.sdk.openadsdk.api.init.PAGSdk
-dontwarn com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
-dontwarn com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener
-dontwarn com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener
-dontwarn com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest
-dontwarn com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
-dontwarn com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener
-dontwarn com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener
-dontwarn com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest
-dontwarn com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
-dontwarn com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
-dontwarn com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener
-dontwarn com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest
-dontwarn com.facebook.infer.annotation.Nullsafe$Mode
-dontwarn com.facebook.infer.annotation.Nullsafe
-dontwarn com.jirbo.adcolony.AdColonyAdapter
-dontwarn com.jirbo.adcolony.AdColonyBundleBuilder
-dontwarn org.joda.convert.FromString
-dontwarn org.joda.convert.ToString
-dontwarn com.appsflyer.AppsFlyerConversionListener
-dontwarn com.appsflyer.AppsFlyerLib
-dontwarn com.appsflyer.adrevenue.AppsFlyerAdRevenue$Builder
-dontwarn com.appsflyer.attribution.AppsFlyerRequestListener
-dontwarn com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.OpenSSLProvider