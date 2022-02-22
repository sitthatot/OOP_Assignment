public class pro1_64010889_week7 {

    public static void main(String[] args) {
        Account account = new Account();
        Checking checking = new Checking(5,5000,5000);
        SavingAccount savingAccount = new SavingAccount();
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: "+checking.getOverdraftLimit());
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("Withdraw: 10000.00");
        checking.withdraw(10000);
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("This account was created at "+checking.getDateCreated());
    }
}
