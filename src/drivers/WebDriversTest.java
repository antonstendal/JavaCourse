package drivers;

public class  WebDriversTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("firFox");
        driver.get();
        driver.findGetElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("fireFox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name.");
    }
}
