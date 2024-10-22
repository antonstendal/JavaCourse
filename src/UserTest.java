public class UserTest {
    public static void main(String[] args) {

        User user = new User("Mark","1234");

        //User user2 = new User();


        /*user.userName = "Anton";
        user.password = "1234";*/
        System.out.println(user.userName);
        System.out.println(user.password);
        user.sayHello();

    }

}
