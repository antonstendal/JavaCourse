public class CarsTest {
    public static void main(String[] args) {

        Cars volvo = new Cars("Volvo","V50",250000, 2009);
        volvo.go();
        volvo.brake();
        volvo.info();

        Cars vw = new Cars("VW","Golf",361200, 2001);
        vw.go();
        vw.brake();
        vw.info();

    }
}
