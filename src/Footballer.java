public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void eat(){
        super.eat();
        System.out.println("I love pizza but i very like healthy food also!");
    }

    public void playFootball() {

        System.out.println("I am playing football " + footballClub);
    }

}
