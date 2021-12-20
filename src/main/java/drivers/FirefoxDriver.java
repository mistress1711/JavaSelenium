package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarke Firefox");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przeglądarce Firefox");

    }
}
