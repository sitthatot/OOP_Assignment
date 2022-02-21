public class pro2_64010889_week7 {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAnnualInterestRate(1.5);
        account.setBalance(1000);
        account.setId(1122);
        account.setName("George");
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println("Name: "+account.getName());
        System.out.println("Account ID: " + account.getId());
        System.out.println("Annual interest rate: "+ account.getAnnualInterestRate());
        System.out.println("Balance: "+String.format("%.2f",account.getBalance()));
        System.out.format("%1s %42s %13s %14s","Date","Type","Amount","Balance");
        System.out.println();
        for(int i = 0; i<account.getTransactions().size(); i++){
            System.out.format("%2s %15s %15s %15s",account.getTransactions().get(i).getDate(),
                    account.getTransactions().get(i).getType(),
                    String.format("%.2f",account.getTransactions().get(i).getAmount()),
                    String.format("%.2f",account.getTransactions().get(i).getBalance())
                    );
            System.out.println();
        }
    }
}
