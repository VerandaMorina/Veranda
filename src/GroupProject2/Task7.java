package GroupProject2;


import GroupProject.Task7;

class A extends Task7 {
    double firstSubject;
    double secondSubject;
    double thirdSubject;
    public A(double firstSubject, double secondSubject, double thirdSubject) {
        this.firstSubject =firstSubject;
        this.secondSubject =secondSubject;
        this.thirdSubject =thirdSubject;
    }


    double getPercentage() {
        double totalMarks = firstSubject + secondSubject + thirdSubject;
        return totalMarks/3;
    }
}

class B extends Task7 {
    double firstSubject;
    double secondSubject;
    double thirdSubject;
    double forthSubject;

    public B(double firstSubject, double secondSubject, double thirdSubject, double forthSubject) {
        this.firstSubject = firstSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
        this.forthSubject = forthSubject;
    }

    double getPercentage() {
        double totalMarks = firstSubject + secondSubject + thirdSubject + forthSubject;
        return totalMarks/4;
    }
}

class MarksTester {
    public static void main(String[] args) {

        A a=new A(28.0,58,68.0);
        B b=new B(75.0,45.0,99.0,36.0);

        System.out.println("Average of 3 marks for student A is "+ a.getPercentage());
        System.out.println("Average of 4 marks for student B is "+ b.getPercentage());
    }

}