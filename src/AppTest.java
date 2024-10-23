public class AppTest {
    public static void main(String[] args) {
        AppAndroid android = new AppAndroid("Weather", 12);
        android.appInfo();
        android.runAndroidApp();

        AppIphone iphone = new AppIphone("Weather", 12);
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
