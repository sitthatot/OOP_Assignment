public class Pro2_64010889_week5 {

    public static void main(String[] args) {
	    RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Polygon 1 perimeter: "+ regularPolygon1.getPerimeter() + " | Area: "+regularPolygon1.getArea());
        System.out.println("Polygon 2 perimeter: "+ regularPolygon2.getPerimeter() + " | Area: "+regularPolygon2.getArea());
        System.out.println("Polygon 3 perimeter: "+ regularPolygon3.getPerimeter() + " | Area: "+regularPolygon3.getArea());

    }
}
