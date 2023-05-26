package class22;

public class FinalDemo {
    final String SNN;
    //final String SNN="kjdksjdkjs" we can assign it here
    //or in the constructor
    FinalDemo(String SNN) {
        this.SNN = SNN;
    }
    void changeSNN(){
        //not allowed as value will be assigned already in construcor
        //SSN="djskdnksklsj";
    }
}
