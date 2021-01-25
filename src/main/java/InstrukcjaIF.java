import org.junit.Test;

public class InstrukcjaIF {
    @Test
    public void exampleIF() {
        int liczba = 100;

        if (liczba > 100) {
            System.out.println("Liczba " + liczba + " jest większa od 100");
            liczba++;
        } else if (0 <= liczba && liczba <= 100) {
            System.out.println("Liczba " + liczba + " jest większa od 0 i mniejsza bądź równa 100");
            if(liczba==100) System.out.println("Liczba jest równa 100!");
            liczba = 100;
        } else {
            System.out.println("Liczba" + liczba + " jest liczbą ujemną.");
        }
        System.out.println("Koniec testu. Liczba jest równa " + liczba);

    }
    @Test
    public void switch1(){
        int liczba2 = 3;

        switch(liczba2){
            case 0:
                System.out.println("Liczba jest równa 0");

            case 1:
                 System.out.println("Liczba jest równa 1");

            case 2:
                System.out.println("Liczba jest równa 2");
            break;
            case 3:
                System.out.println("Liczba jest równa 3");



        }
        

    }
}