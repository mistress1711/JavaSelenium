public class StudentTest {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student student1 = new Student();
        student1.imie = "Jan";
        student1.nazwisko = "Kowalski";
        student1.numerIndeksu = 111111;
        student1.nick = "jankowalski";
        student1.email = "jankowalski@wp.pl";
        String uczelniaJana = Student.nazwaUczelni;

        Student student2 = new Student();
        student2.imie = "Maria";
        student2.nazwisko = "Nowak";
        student2.numerIndeksu = 222222;
        student2.nick = "marianowak";
        student2.email = "marianowak@wp.pl";
        Student.infoUczelnia();

        Student student3 = new Student();
        student3.imie = "Anna";
        student3.nazwisko = "Misiak";
        student3.numerIndeksu = 333333;
        student3.nick = "annamisiak";
        student3.email = "annamisiak@wp.pl";

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

//        for (int i = 0; i < students.length; i++) {
        for (Student person: students) {

            person.przedstawSie();
            person.podajEmail();
            person.podajNrIndeksu();
            person.zalogujSie();
        }


    }
}
