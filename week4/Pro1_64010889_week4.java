
public class Pro1_64010889_week4 {
    public static void main(String[] args) {
       
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;
        System.out.println("Symbol: " + stock1.symbol);
        System.out.println("Name: " + stock1.name);
        System.out.println("Previous Closing Price: " + stock1.previousClosingPrice);
        System.out.println("Current Price: " + stock1.currentPrice);
        System.out.println("Price Change: " + stock1.getChangePercent()+"%");
    }
}
class Stock{
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        double result = currentPrice - previousClosingPrice;
        double percent = (result/currentPrice) * 100;
        return percent;
    }
}