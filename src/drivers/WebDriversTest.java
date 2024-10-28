package drivers;

public class WebDriversTest {
    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i < driverTypes.length; i++){
            System.out.println(driverTypes[i]);
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        DriverType chrome = DriverType.valueOf("CHROME");
        System.out.println(chrome);
        System.out.println(Enum.valueOf(DriverType.class,"FIREFOX"));

        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findGetElementBy();

    }

    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
        return new FirefoxDriver();
    }
}
