package identifiers.first;

public class Random {

    //klasa w tej samej paczce nie ma dostepu do pol/method private

    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first); // public
        System.out.println(parent.second); // default
        System.out.println(parent.third);// protected

        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
    }
}
