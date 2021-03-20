public class  Auto {

    public String marka;
    public String model;
    public int rok_produkcji;
    public int przebieg;

    public void jedz() {
        System.out.println("Jedź!");
    }

    public void hamuj() {
        System.out.println("Hamuj!");
    }

    public void info() {
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok prodkucji " + rok_produkcji);
        System.out.println("Przebieg " + przebieg);

    }
}
