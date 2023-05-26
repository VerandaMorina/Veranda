package GroupProject2;

public class Task9 {

    /*
        Create Registration Class in which you would have variables as
        email, userName and password that have an access scope only
        within its own class. After creating an object of the class user should
        be able to call methods and in each method separately pass values
        to set users email, username and password.
       Requirements:
       A. Valid email consider to be only yahoo
       B. Valid userName and password cannot be empty and should be of
       length larger than 6 characters. Also valid password cannot contain
       userName.
         */
    private String email, userName, password;

    public void registerEmail(String email) {
        this.email = email;
        boolean valid = true;
        if (email.contains("@yahoo.com")) {
            System.out.println(valid);
        } else {
            System.out.println("This email does not valid");
        }
    }

    public void registeruserName(String userName) {
        this.userName = userName;
        char[] ch = userName.toCharArray();
        if (ch.length > 6 && !userName.equals("")) {
            System.out.println("Valid Username");
        } else {
            System.out.println("This username is not valid. It must larger than 6 " +
                    "characters and must not empty");
        }
    }

    public void registerPassword(String password) {
        this.password = password;
        char[] pw = password.toCharArray();
        if (password.equals(userName)) {
            System.out.println("Password can not be the same as username. "
                    + "Please change it ");
        } else if (pw.length < 6 && password.equals("")) {
            System.out.println("Password not valid. It must larger than 6");
        } else {
            System.out.println("Valid password");
        }
    }


    public static void main(String[] args) {
        Task9 obj =new Task9() ;
        obj.registerEmail("veranda@yahoo.com");
        Task9 obj1 = new Task9();
        obj1.registeruserName("veranda");
        Task9 obj2 = new Task9();
        obj1.registerPassword("Passw0rd123#.6");

    }
}
