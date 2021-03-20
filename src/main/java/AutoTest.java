public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok_produkcji = 2020;
        mercedes.przebieg = 145000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A4";
        audi.rok_produkcji = 2019;
        audi.przebieg = 34000;

        audi.info();

        Auto x = new Auto();

        x.info();


    }
}
