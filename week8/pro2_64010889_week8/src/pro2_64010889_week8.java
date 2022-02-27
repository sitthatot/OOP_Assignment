public class pro2_64010889_week8 {

    public static void main(String[] args) {
        // Create an array of five GeometricObjects
        GeometricObject[] squares = {new Square(1),new Square(2),new Square(3)
        ,new Square(4), new Square(5)};
        //Display its area and invoke its howToColor method if it is colorable.
        for(int i = 0; i<squares.length; i++){
            System.out.println("Square no."+ (i+1));
            System.out.println("Area: "+squares[i].getArea());
            System.out.println("How to color: " + squares[i].toString());
        }
    }
}
