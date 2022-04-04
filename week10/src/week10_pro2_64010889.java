import java.util.Scanner;

public class week10_pro2_64010889 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                repeat = false;
                System.out.println("Congratulation!, these value " + side1 + ", " + side2 + ", " +  side3  + " are able to be triangle");
                //System.out.println("Area: " + triangle.getArea());
                //System.out.println("Perimeter: " + triangle.getPerimeter());
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }

       }
    }
}
