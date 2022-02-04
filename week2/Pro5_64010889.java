import java.util.Scanner;

public class Pro5_64010889 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number of lines: ");
      int num = scanner.nextInt();
      if(num >= 1 && num <=15){
          for(int i = 1; i<=num;i++){
              for(int j = num-i;j>0;j--){
                  System.out.print("  ");
              }
              for(int k = i;k>=1;k--){
                  System.out.print(k+" ");
              }
              for(int m = 2; m<=i ; m++){
                  System.out.print(m+" ");
              }
              System.out.println();
          }
      }
      else{
          System.out.print("Please enter number between 1 to 15");
      }

    }
  }
