package class17;

import class18.TV;

public class LGTV extends TV {
    void printMake(){
        System.out.println(model);
    }
}
class LGTVTester{
    public static void main(String[] args) {
        LGTV lgtv=new LGTV();
        //if its public in class18 we can access t from a different class or packages like we did from class 17
        //if its default we cant access it only if we are in the same package then we can
        //private as well
        //if its protected only the child of TV can access it for example like LGTV is extending TV
        //TV is the parent LGTV is the child but LGTVTester no
        lgtv.model="tv";
        lgtv.printMake();
    }
}
