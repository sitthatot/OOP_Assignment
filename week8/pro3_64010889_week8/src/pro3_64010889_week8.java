public class pro3_64010889_week8 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1,2,"blue",true);
        Rectangle rectangle2 = new Rectangle(2,1,"yellow",false);
        Rectangle rectangle3 = new Rectangle(10,100,"red",true);
        System.out.println("Rectangle1 Area: "+rectangle1.getArea());
        System.out.println("Rectangle2 Area: "+rectangle2.getArea());
        System.out.println("Rectangle3 Area: "+rectangle3.getArea());

        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle2) ? "" : "not ") +
                "equal to Rectangle2");

        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle3) ? "" : "not ") +
                "equal to Rectangle3");
    }
}
