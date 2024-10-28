package drivers;

public class WebDriversSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver fireFox = new FirefoxDriver();
        WebDriver secondFireFox = new FirefoxDriver();
        WebDriver thirdFireFox = new FirefoxDriver();

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Open this browser with Safari");
            }

            @Override
            public void findGetElementBy() {
                System.out.println("Find elements with Safari");

            }
        };
        safari.get();
        safari.findGetElementBy();
    }
}
