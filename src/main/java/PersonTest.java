public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Thomas";
        teacher.age = 35;
        teacher.school = "Oxford";
        teacher.teachMath();
        teacher.sayHello();
        teacher.eat();
        teacher.walk();
        teacher.school = "AGH";

//        Footballer footballer = new Footballer();
//        footballer.name = "Robert";
//        footballer.footballClub = "Bayern Monachium";
//        footballer.playFootball();
//        footballer.eat();

    }
}
