public class CarsTest {
    public static void main(String[] args) {

        Cars volvo = new Cars();
        volvo.mark = "Volvo";
        volvo.model = "V50";
        volvo.km = 250000;
        volvo.year = 2009;

        volvo.go();
        volvo.brake();
        volvo.info();

        Cars vw = new Cars();
        vw.mark = "VW";
        vw.model = "Golf";
        vw.km = 361200;
        vw.year = 2001;

        vw.go();
        vw.brake();
        vw.info();

    }
}
