package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    //klasa potomna w innej paczce nie ma dostepu do pol/method private oraz default czyli bez identyfikatora

    public void testIdentifier(){

        System.out.println(first); //public
        System.out.println(third); //protected

        firstMethod();
        thirdMethod();

    }
}
