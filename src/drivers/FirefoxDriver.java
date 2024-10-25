package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Open this browser with Firefox");
    }

    @Override
    public void findGetElementBy() {
    System.out.println("Find elements with Firefox");
    }
}
