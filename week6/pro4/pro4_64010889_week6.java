import java.util.Scanner;

public class pro4_64010889_week6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = scanner.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();
        ComputeTax computeTax = new ComputeTax();
        System.out.print("Tax is "+computeTax.ComputeTaxNow(status, income));
    }
}
