public interface BankAccountInterface {
    String fetchBalance(String pswd);

    String addMoney(int amnt);

    String withdrawMoney(int amt,String pswd);

    String changePswd(String oldPswd, String newPswd);

    double rateOfInterest(int year);
}
