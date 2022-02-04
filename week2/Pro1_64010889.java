import java.util.Scanner;

public class Pro1_64010889 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        byte today = scanner.nextByte();
        if(today >= 0 && today <= 6){
            System.out.print("Enter the number of days elapsed since today: ");
            byte count_after_today = scanner.nextByte(); 
            System.out.println("Today is " + days[today] + " and the future day is " + days[(today + count_after_today)%7]);
        }
        else{
            System.out.println("Please enter number between 0 - 6");
        }
        
    }
}
