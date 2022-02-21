import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    protected Date dateCreated;
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public Account(){
        dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
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
        Transaction transaction = new Transaction('W',amount,balance,"");
        transactions.add(transaction);

    }
    public void deposit(double amount){
        balance = balance + amount;
        Transaction transaction = new Transaction('D',amount,balance,"");
        transactions.add(transaction);

    }


}

