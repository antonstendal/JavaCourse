import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = 4.5;

        double c = a-b; // a conversed on double

        int d = (int)c-(int)b ;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
    }
}
