package drivers;

public class WebDriversTest {
    public static void main(String[] args) {

        WebDriver driver = getDriver("fireFox");
        driver.get();
        driver.findGetElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("fireFox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
