public class Circle extends Shape{

    private double radius;


  // constructor 1
    Circle(){
        super(); // to call the no-arg constructor of Shape
       this.radius = 1.0;
    }
// constructor 2
    Circle(double radius){
        super();
      this.radius=radius;
    }
// constructor 3
    Circle( double radius, String color , boolean filled ){
        super(color,filled);
        this.radius=radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }

    public String toString(){
        return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }


}
