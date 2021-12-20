package identifires.second;

import identifires.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostępu do pol/metod private oraz defoult czyli bez identyfikatora oraz protected

    public void testIdentifiers() {
//      klasa w tej samej paczce nie ma dostępu do pol/metod private
        Parent parent = new Parent();

        System.out.println(parent.first);
        parent.firstMethod();



    }
}
