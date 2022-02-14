import java.util.Scanner;

public class pro1_64010889_week6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scanner.next();
        System.out.print("What is your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your Height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();
        BMI bmi = new BMI(name,age,weight,feet,inches);
        System.out.println("=======================");
        System.out.println("Your name is: "+bmi.getName());
        System.out.println("Your age is: "+bmi.getAge());
        System.out.println("BMI: "+bmi.BMICalculate());
        System.out.println("Status: "+bmi.BMIStatus());
        //ลองใส่Weight = 121.254
        //H = 66.1417
        //5 feet and 6.1417 inches
    }
}
