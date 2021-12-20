package drivers;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądarke Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przeglądarce Chrome");

    }
}
