public class Students {

    public String name;
    public String secondName;
    public String nickName;
    public String email;
    public String indexNumber;

    public static String nameOfSchool = "School number 60";

    public static int theDateWhenStartLesson = 1;


    public void hello() {
        System.out.println("My name is "+ name + ". My second name is " + secondName);
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
