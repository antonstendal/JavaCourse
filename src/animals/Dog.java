package animals;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Gav!");
        sayHello();
        System.out.println("Number of legs+ " + legs);
    }
}