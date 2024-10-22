public class User {

    public String userName;
    public String password;

    public User(){

    }
    public User(String userName, String password){
        System.out.println("Hello i'm constructor. My name is "+ userName + ". My password is: "+password);
        this.userName = userName;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello, my name is" + userName);
    }
}
