import java.util.Scanner;
public class Pro4_64010889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator");
        System.out.print("Enter weight in pounds: ");
        float weight = scanner.nextFloat();
        System.out.print("Enter height in Inches: ");
        float height = scanner.nextFloat();
        float bmi = (float)(weight*0.45359237/Math.pow(height*0.0254, 2));
        System.out.printf("BMI is %.4f",bmi);
    }
}
