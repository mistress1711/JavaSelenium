public class Switch {

    public static void main(String[] args) {
        String danie = "Hamburger";

        switch (danie) {
            case "Frytki":
                System.out.println("Płacisz 9zł");
                break;
            case "Hamburger":
                System.out.println("Płacisz 15zł");
                break;
            case "Bigos":
                System.out.println("Płacisz 12zł");
                break;
            default:
                System.out.println("Nie ma takiego dania w karcie.");
        }
    }
}
