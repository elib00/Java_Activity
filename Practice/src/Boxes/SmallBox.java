package Boxes;

public class SmallBox extends BigBox{
    public double length;
    public double width;

    public SmallBox(double l, double w, String color){
        super(color);
        length = l;
        width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter() {
         return 2 * (length + width);
    }

    @Override
    public String toString(){
        return super.toString() + " and a SmallBox";
    }

}
