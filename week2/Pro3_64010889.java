import java.util.Scanner;

public class Pro3_64010889 {
    public static void main(String[] args) {
        int[]day_in_month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner scanner = new Scanner(System.in);
        String day_of_week[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if(year > 0){
            System.out.print("Enter month: ");
            int month = scanner.nextInt();
            if(month >= 1 && month<=12){
                if(year % 4 == 0 && year % 100!=0 || year % 400 == 0){
                    day_in_month[2]=29;
                }
                System.out.print("Enter the day of the month: ");
                int day = scanner.nextInt();
                if(day > 0 && day <= day_in_month[month]){
                    if(month == 1 || month == 2){
                        month = month + 12;
                        year = year - 1;
                    }
                    int j_century = year/100;
                    int k_year_in_century = year%100;
                    int h = (day + (26*(month+1))/10 + k_year_in_century + k_year_in_century/4 + j_century/4 + 5*j_century) % 7;
                    System.out.println("Day of the week is " + day_of_week[h]);
                }
                else{
                    System.out.println("Your day is out of range from your month");
                }
            }
            else{
                System.out.println("Please enter month between 1 - 12");
            }    
        }
        else{
              System.out.println("Please enter year in positive number");  
        }

    }
    
}
