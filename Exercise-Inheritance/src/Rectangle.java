public class Rectangle extends Shape{

    private double width;
    private double length;


    // constructors

    Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    Rectangle(double width , double length){
        super();
        this.width=width;
        this.length=length;
    }

    Rectangle(double width , double length , String color , boolean filled){
        super(color , filled);
        this.length=length;
        this.width=width;
    }

    public Rectangle(String color, boolean filled, double side, double side1) {
        super(color , filled);
        this.setWidth(width);
        this.setLength(length);

    }


    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
        public double getArea(){
        return  width * length;
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }

    public String toString(){
        return "A Rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
    }










}
