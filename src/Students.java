public class Students {

    public String name;
    public String secondName;
    public String nickName;
    public String email;
    public String indexNumber;

    public static String nameOfSchool = "School number 60";

    public static void schoolInfo() {
        System.out.println("My school is number " + nameOfSchool);
        secondMethod();
    }

    public static void secondMethod(){
        System.out.println("Hello from second method");
    }

    public void hello() {
        System.out.println("My name is " + name + ". My second name is " + secondName);
    }

    public void logIn() {
        System.out.println("Enter nick name: " + nickName);
    }

    public void enterIndexNumber() {
        System.out.println("My number index: " + indexNumber);
    }

    public void enterEmail() {
        System.out.println("My email is : " + email);
    }
}
