package class12;

public class E2StringDemo {

    public static void main(String[] args) {
        String userName="admin";
        String password="pass123";

        if (userName.length() <8 && password.length()<8){
            System.out.println("Sign up is successful");
        } else{
            System.out.println("Username and Password cant be more than 8 characters");
        }
    }
}
