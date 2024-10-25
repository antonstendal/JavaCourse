package drivers;

public class WebDriversTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        chromeDriver.get();
        chromeDriver.findGetElementBy();
        firefoxDriver.get();
        firefoxDriver.findGetElementBy();
    }
}
