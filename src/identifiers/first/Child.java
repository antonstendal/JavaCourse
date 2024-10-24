package identifiers.first;

public class Child extends Parent {

    //klasa potomna w tej samej paczce nie ma dostepu do pol/method private

    public void testIdentifier(){
        System.out.println(first); //public
        System.out.println(second); // default
        System.out.println(third); //protected

        firstMethod();
        secondMethod();
        thirdMethod();

    }
}
