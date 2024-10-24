package identifiers.second;

import identifiers.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostepu do pol/method private oraz default czyli bez identyfikatora oraz protected

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first); //public

        parent.firstMethod();

    }
}
