package lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 18);

        Student med = new Student() {
            @Override
            public boolean sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " +name);
                return true;
            }
        };

        sayHello("Elton", med, 21);

        //(param) -> System.out.println("I am not a student. My name is + " +name);
        Student noStudent = (name,age) -> age>18;
        sayHello("Tom", noStudent, 33);
    }

    public static void sayHello(String name, Student student, int age){
        student.sayHello(name, age);
    }
}
