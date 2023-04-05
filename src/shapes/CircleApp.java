package shapes;
import java.util.Scanner;
public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("The circumference of the circle is: %.2f%n", circle.getCircumference());
        System.out.printf("The area of the circle is: %.2f%n", circle.getArea());

        sc.close();
    }
}
