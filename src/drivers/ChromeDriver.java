package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Open this browser with Chrome");
    }

    @Override
    public void findGetElementBy() {
        System.out.println("Find elements with Chrome");

    }
}
