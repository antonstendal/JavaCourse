import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {

    public static void main(String[] args) {
        /*int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/

        WebDriver driver = getDriver("fireFox1");
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
