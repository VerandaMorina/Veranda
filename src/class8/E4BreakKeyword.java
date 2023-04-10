package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {
        //breaks the loop
        //example break at 300

        for (int i = 1; i < 10; i++) {
            if (i<3){
                continue;
            }
            System.out.print(i);
        }




        /*
        int sum=0;
        for (int i = 0; i < 50; i++) {
            sum=sum+1;

            if (sum>=300){
                System.out.println(i);
                break;
            }

        }

         */
    }
}
