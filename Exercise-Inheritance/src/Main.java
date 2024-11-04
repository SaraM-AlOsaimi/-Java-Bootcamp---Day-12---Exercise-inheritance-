//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        System.out.println("Testing Shape Class. <>[O]<>");
        System.out.println("--------");

        System.out.println(shape.toString());

        Shape shape1 = new Shape("Black",false);
        System.out.println(shape1.toString());


        // test getters
        System.out.println("Color :" + shape1.getColor());
        System.out.println("Is filled " + shape1.isFilled());

        // test setters - shape1
        shape1.setColor("Yellow");
        shape1.setFilled(true);
        System.out.println("Testing setters - shape1: " + shape1.toString());

        // test setters - shape
        shape.setColor("Blue");
        shape.setFilled(false);
        System.out.println("Testing setters - shape: " + shape.toString());
        System.out.println("-----------------");
// ------------------------------------------------------------
        System.out.println("Circle class O ");
// constructor 3
        Circle circle = new Circle(1.5 , "Red", false);
        System.out.println(circle.toString());
        System.out.println("Area of a circle with radius "+ circle.getRadius() + " = " + circle.getArea());
        System.out.println("Perimeter of a circle with radius "+ circle.getRadius() + " = " + circle.getPerimeter());

        Circle circle1 = new Circle(1.5);
        System.out.println(circle1.toString());
        System.out.println("Area of a circle with radius "+ circle.getRadius() + " = " + circle1.getArea());
        System.out.println("Perimeter of a circle with radius "+ circle.getRadius() + " = " + circle1.getPerimeter());

        Circle circle2 = new Circle();
        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

//--------------------------------------------------------------
        System.out.println("-----------------");
        System.out.println("Rectangle class []");

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.toString());
        System.out.println("Area: "+ rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4.0,6.0);

        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

       Rectangle rectangle2 = new Rectangle(3.5,4.0,"blue",false);

        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

//-------------------------------------------------------------
        System.out.println("--------------------------");
        System.out.println("Square Class");

        Square square = new Square();
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());


        Square square1 = new Square(4.0);
        System.out.println(square1.toString());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());


        Square square2 = new Square(7.0, "pink", true);
        System.out.println(square2.toString());
        System.out.println("Areaaa: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());

        // test setSide()
        square2.setSide(6.0);
        System.out.println(square2.toString());
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());






    }
}