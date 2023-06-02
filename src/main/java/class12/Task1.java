package class12;

public class Task1 {
    public static void main(String[] args) {


        String username ="Veranda";
        String password="Password";
        String confirmPassword="Password";

        if (username.isEmpty() && password.isEmpty()){
            System.out.println("Username and Password can not be empty");
        }
        else if (password.length()<8){
            System.out.println("Password is to short");
        }else if (password.contains(username)){
            System.out.println("Pasword can not contain username");
        }else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}