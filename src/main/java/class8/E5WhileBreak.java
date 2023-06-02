package class8;

public class E5WhileBreak {
    public static void main(String[] args) {

     boolean summer=true;
     int temp=85;


     while (summer){
            if (temp<100){
                System.out.println("its good");
         }else {
                System.out.println("Its very hot");
                break;
            }
            temp=temp+10;

     }
     }
    }

