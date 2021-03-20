import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj swoją 1 liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj swoją 2 liczbę: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.mult(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int modulo = calculator.mod(firstNumber, secondNumber);

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + modulo);

//        Można też bez tej przedostatniej sekcji a tylko tą dać:
//        System.out.println("Wynik dodawania: " + calculator.add(firstNumber, secondNumber));
//        System.out.println("Wynik odejmowania: " + calculator.sub(firstNumber, secondNumber);
//        System.out.println("Wynik mnożenia: " + calculator.mult(firstNumber, secondNumber));
//        System.out.println("Wynik dzielenia: " + calculator.div(firstNumber, secondNumber));
//        System.out.println("Wynik modulo: " + calculator.mod(firstNumber, secondNumber));

    }
}