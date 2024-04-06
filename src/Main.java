import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Enter your password");
//       String pswd = sc.nextLine();
//        int balance = sc.nextInt();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       HDFCbankAccount b1 = new HDFCbankAccount("Vishal","Rahul@123",3000);


//        System.out.println(b1);
//        System.out.println();
//        System.out.println("Your Account No.is " + b1.getAcNo());
//        System.out.println("Account Holder Name is " + b1.getName());
//        System.out.println("Your IFSC code is " + b1.getIFSCcode());





//        int count = 1;
//        while(b1.fetchBalance(pswd).equals("Incorrect password")) {
//            if (count == 3) {
//                System.out.println("You have reached the maximum number of attempts allowed");
//                return;
//            }
//            System.out.println("Incorrect password. please re-enter your password");
//
//            System.out.println("Remaining attempts" + (3 - count));
//            count++;
//            pswd = sc.nextLine();
//        }
//        System.out.println(b1.fetchBalance(pswd));

        System.out.println(b1.fetchBalance("Rahul@123"));
        System.out.println(b1.addMoney(500));
        System.out.println(b1.withdrawMoney(5000,"Rahul@123"));
        System.out.println(b1.withdrawMoney(500,"Rahul@123"));
        System.out.println(b1.changePswd("Rahul@123","Vishal@123"));
        System.out.println(b1.fetchBalance("Vishal@123"));
        System.out.println(b1.rateOfInterest(2));
    }
}