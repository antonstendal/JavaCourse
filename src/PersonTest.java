public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();

        teacher.name = "Tom";
        teacher.age = 29;
        teacher.sayHello();
        teacher.teachMath();
        teacher.school = "I work at school number 60";
        teacher.walk();
        teacher.eat();


        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 21;
        footballer.footballClub = "My football club is Manchester United";
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
