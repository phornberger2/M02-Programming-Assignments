import java.util.Scanner;

public class exercise_11_01 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three sides of the triangle
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (enter true or false)? ");
        boolean filled = input.nextBoolean();

        // Create triangle object with user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? " " : " not ")
                + "filled");
    }
}

/*********************************************************
 *                       Triangle                         *
 *--------------------------------------------------------*
 * -side1: double                                         *
 * -side2: double                                         *
 * -side3: double                                         *
 * +Triangle()                                            *
 * +Triangle(side1: double, side2: double, side3: double) *
 * +getSide1(): double                                    *
 * +getSide2(): double                                    *
 * +getSide3(): double                                    *
 * +getArea(): double                                     *
 * +getPerimeter(): double                                *
 * +toString(): String                                    *
 *********************************************************/

// Implement Triangle class
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Construct default Triangle object
    Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    // Construct a triangle with specified side1, side2 and side3
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Return side1
    public double getSide1() {
        return side1;
    }

    // Return side2
    public double getSide2() {
        return side2;
    }

    // Return side3
    public double getSide3() {
        return side3;
    }

    // Return area of this triangle
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Return perimeter of this triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Return a string description for the triangle
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}