public class Footballer extends Person {

    public String footballClub;

    public void playFootball() {
        System.out.println("I am playing football for !" + footballClub);
        walk();
    }
    public void eat(){
        System.out.println("I like healthy food");
    }
}
