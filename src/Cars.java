public class Cars {

    public String mark;
    public String model;
    public int year;
    public int km;

    public void go() {
        System.out.println("go!");
    }

    public void brake() {
        System.out.println("brake!");
    }

    public void info() {
        System.out.println("Mark: "+ mark);
        System.out.println("Model: "+ model);
        System.out.println("year: "+ year);
        System.out.println("km: "+ km);
    }

}
