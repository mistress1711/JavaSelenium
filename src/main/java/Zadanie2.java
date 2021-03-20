public class Zadanie2 {
    public static void main(String[] args) {
//        for(int x=0; x<100; x++){
//            if(x%3==0){
//                System.out.println("Jestem podzielna przez 3: " + x);
//            }
//        }

    int[] tablica = new int[]{1,3,5,7,0};

    for (int i=0; i<(tablica.length/2);i++) {
        int temp = tablica[i];
        tablica[i] = tablica[tablica.length-1-i];
        tablica[tablica.length-1-i] = temp;

    }

    for (int i=0; i<tablica.length; i++) {
        System.out.println(tablica[i]);
    }

    }
}
