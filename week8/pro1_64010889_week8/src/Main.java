import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter 3 sides of triangle: ");
            System.out.print("side 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("side 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("side 3: ");
            double side3 = scanner.nextDouble();
            if(side1 <= 0 || side2 <= 0 || side3 <= 0){
                System.out.println("Please enter positive sides");
            }
            else if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
                System.out.println("This is not Triangle");
            }
            else{
                System.out.println("Enter your triangle color: ");
                String color = scanner.next();
                System.out.println("Is the triangle filled (true / false)?: ");
                boolean filled = scanner.nextBoolean();

                Triangle triangle = new Triangle(side1,side2,side3,color,filled);
                System.out.println(triangle.toString());
                break;
            }
        }
    }
}
