public class Checking extends Account{
    private double overdraftLimit = 0;

    public Checking(){
        super();
    }

    public Checking(int id , double balance){
        super(id, balance);
    }

    public Checking(int id , double balance, double overdraftLimit){
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
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
