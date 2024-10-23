public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "school number 60");
//        teacher.sayHello();
//        teacher.teachMath();
        teacher.walk();
        teacher.eat();


        Footballer footballer = new Footballer("Mike", 21,"Manchester United");
        footballer.walk();
        footballer.eat();
//        footballer.playFootball();
    }
}
