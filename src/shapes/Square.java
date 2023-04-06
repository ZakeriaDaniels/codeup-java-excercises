package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }

    public double getPerimeter() {
        double side = this.length;
        return side *4;
    }


    public double getArea() {
        double side = this.width;
        return side * side;
    }


    public void setLength(double side) {
    this.length = side;
    }


    public void setWidth(double side) {
    this.width = side;
    }


//    private double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    // override the getArea method inherited from Rectangle
//
//    public double getArea() {
//        System.out.println("get area from Square: ");
//        return this.side * this.side; // same as side * side, since length == width for a square
//    }
//    private double side;
//    public double getPerimeter() {
//        System.out.println("get perimeter from Square:");
//        return this.side * 4;
//    }
}
