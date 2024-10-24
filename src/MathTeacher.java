public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teachMath(){
        System.out.println("I am teaching math");
    }

    public void walk(){
        System.out.println("I don't waling i'm  running!");
    }

   public void sayHello(){
       System.out.println("Hello my name is " + name);
       System.out.println("I am " + age);
   }
}
