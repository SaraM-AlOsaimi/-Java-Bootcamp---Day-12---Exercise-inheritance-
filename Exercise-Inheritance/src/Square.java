public class Square extends Rectangle{

   // constructors

    Square(){
     super(1.0,1.5);
    }
    Square(double side){
        super(side,side);
    }
    Square(double side, String color , boolean filled){
        super(color, filled, side, side);
    }

    public void setSide(double side){
//   Since width and length are the same
       setWidth(side);
       setLength(side);
    }
    public double getSide(){
        return getWidth();
    }


    public String toString(){
        return "A Square with side=" + getSide()  + ", which is a subclass of " + super.toString();
    }







}
