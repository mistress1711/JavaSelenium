import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj swoje imię: ");
        String name = scanner.nextLine();
        System.out.println("Twoje imię to: " + name);*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj swoją liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Kwadrat tej liczby to: " + firstNumber*firstNumber);
    }
}
