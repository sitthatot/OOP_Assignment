public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String howToColor() {
        return "Color all four sides\n==================";
    }

    @Override
    public String toString(){
        return howToColor();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
