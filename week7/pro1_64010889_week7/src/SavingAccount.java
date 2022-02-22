public class SavingAccount extends Account{
    private double overdraftLimit = 0;

    public SavingAccount(){
        super();
    }

    public SavingAccount(int id , double balance){
        super(id, balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("Error");
        }
    }
}
