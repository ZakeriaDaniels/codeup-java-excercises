package shapes;

public class ShapesTest {
    public static void main(String[] args) {


//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        Rectangle box2 = new Square(5);
//
//        System.out.println("box1's area and perimeter: ");
//        System.out.println("area: " + box1.getArea());
//        System.out.println("perimeter:" + box1.getPerimeter());
//
//        System.out.println("----------------------------");
//
//        System.out.println("box2's area and perimeter: ");
//        System.out.println("area: " + box2.getArea());
//        System.out.println("perimeter:" + box2.getPerimeter());
//    }

    Measurable myShape = new Rectangle(4,5);
        System.out.println("myShape's area: " + myShape.getArea());
        System.out.println("myShape's perimeter: " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
