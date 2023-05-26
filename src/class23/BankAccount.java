package class23;

public class BankAccount {
    String firstName;
    private String userName;
    private String password;
    private double accountBalance=120;

    public BankAccount(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    String getfirstName(){
        return firstName;
    }
    public double getAccountBalance(String password){
        if (password.equals(this.password)) {
            return accountBalance;
        }else{
            return 0;
        }

    }
}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Veranda","Password");
        System.out.println(bankAccount.getAccountBalance("Password"));
    }
}
