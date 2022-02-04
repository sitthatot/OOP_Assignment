import java.util.Scanner;

public class Pro3_64010889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        if(number > 0 && number < 1000){
            int collect = 0;
            while(number != 0){
                collect += number % 10;//บวกกันของเลขโดด
                number = number/10;//Update ค่า (ตัดตัวเลขท้าย)
            }
            System.out.println("The sum of the digits is " + collect);
        }
        else{
            System.out.println("Please enter number between 0 and 1,000");
        }
    }
}
