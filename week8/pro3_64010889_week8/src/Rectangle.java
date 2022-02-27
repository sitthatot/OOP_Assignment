public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Rectangle other) {
        if (getArea() > other.getArea())
            return 1; // same x, smaller y
        else if (getArea() < other.getArea())
            return -1; // same x, larger y
        else
            return 0; //same x and same y
    }

    @Override /** Return true if both objects are equal */
    public boolean equals(Object other) {
        return this.compareTo((Rectangle)other) == 0;
    }
}
