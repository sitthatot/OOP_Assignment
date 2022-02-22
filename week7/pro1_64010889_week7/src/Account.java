import java.util.Date;
public class Account {
    protected int id = 0;
    protected double balance = 0;
    protected double annualInterestRate;
    protected Date dateCreated;
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public Account(){
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
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
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", balance='" + getBalance() + "'" +
                ", annualInterestRate='" + getAnnualInterestRate() + "'" +
                ", dateCreated='" + getDateCreated() + "'" +
                "}";
    }
}
