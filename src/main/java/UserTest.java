public class UserTest {

    public static void main(String[] args) {
//        User a = new User();
//        a.username = "Ania";
//        a.password = "abcde";
        User b = new User("Anna", "abcde");
        System.out.println(b.username);
        System.out.println(b.password);
        b.sayHello();

    }
}
