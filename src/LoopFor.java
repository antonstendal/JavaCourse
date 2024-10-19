public class LoopFor {
    public static void main(String[] args) {
        int num = 100;
//        for (int i = 0; i <= num; i=i+10) {
//            System.out.println(i);
//        }

        for (int i = 0; i<num; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }


    }
}
