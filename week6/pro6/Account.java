import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public Account(){
        dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthlyInterestRate = (annualInterestRate/100)/12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public double withdraw(double amount){
        return balance = balance - amount;
    }
    public double deposit(double amount){
        return balance = balance + amount;
    }
}
