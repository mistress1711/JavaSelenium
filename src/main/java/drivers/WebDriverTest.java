package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}
