import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        if(wiek<18){
            System.out.println("Nie możesz kupic alkoholu");
        }
////        else{
////            System.out.println("Dziękuję za zakupy");
//        }
        else if(wiek>=18){
            System.out.println("Dziękuję za zakupy");
        }
    }
}
