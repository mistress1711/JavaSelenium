public class For {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }

        for (int x=0; x<100; x++){
            if(x%5==0) {
                System.out.println(x);
            }
        }
    }
}
