import java.util.UUID;

public class HDFCbankAccount implements BankAccountInterface {

    private String name;

    private String AcNo;

    private String password;

    private double balance;

    final double rateOfInterest = 6.15;

    final String IFSCcode = "HDFC210179";

    //Use Alt + Insert to add some predefined functions to your code

    //default constructor by shortcut
    public HDFCbankAccount() {
    }

    //parameterized constructor
    public HDFCbankAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.AcNo = String.valueOf(UUID.randomUUID());
    }


    //Getters and Setters......... Remember there are no setter for 'final' attributes,only getters are there
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcNo() {

        return AcNo;
    }

    public void setAcNo(String acNo) {
        AcNo = acNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }



    @Override
    public String fetchBalance(String pswd) {
        if(pswd.equals(this.password)){
            return "Your balance is: " + this.balance;
        }else{
            return "Incorrect password";
        }
    }

    @Override
    public String addMoney(int amnt) {
        this.balance += amnt;
        return "Balance is added successfully Your current balance is: " + this.balance;
    }

    @Override
    public String withdrawMoney(int amt, String pswd) {
        if(pswd.equals(this.password)){
            if(amt <= this.balance){
                this.balance -= amt;
                return "Balance withdraw successful. Your current balance is: " + this.balance;
            }else{
                return "Insufficient Balance";
            }
        }else{
            return "Please enter the correct password";
        }

    }

    @Override
    public String changePswd(String oldPswd, String newPswd) {
        if(oldPswd.equals(this.password)){
            this.password = newPswd;
            return "Password changed successfully.";
        }else{
            return "Please enter the correct password";
        }

    }

    @Override
    public double rateOfInterest(int year) {

        return (this.balance*rateOfInterest*year)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCbankAccount{" +
                "name='" + name + '\'' +
                ", AcNo='" + AcNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCcode='" + IFSCcode + '\'' +
                '}';
    }
}
