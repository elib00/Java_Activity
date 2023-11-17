package Boxes;

import java.util.Comparator;
public abstract class BigBox implements Comparable<BigBox>{
    String color;
    public abstract double getArea();
    public abstract double getPerimeter();

    public BigBox(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Hi, I am a BigBox and my color is " + color;
    }

    @Override
    public int compareTo(BigBox o) {
        int ans = color.compareTo(o.color);
        double a1 = this.getArea();
        double a2 = o.getArea();

        if(ans == 0){
            if(a1 > a2){
                return 1;
            }else if(a1 < a2){
                return -1;
            }else{
                return 0;
            }
        }

        return ans;
    }

    public static class AreaComparator implements Comparator<BigBox>{
        @Override
        public int compare(BigBox o1, BigBox o2) {
            double a1 = o1.getArea();
            double a2 = o2.getArea();
            if(a1 > a2){
                return 1;
            }else if(a1 < a2){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static class PerimeterComparator implements Comparator<BigBox>{
        @Override
        public int compare(BigBox o1, BigBox o2) {
            double p1 = o1.getArea();
            double p2 = o2.getArea();
            if(p1 > p2){
                return 1;
            }else if(p1 < p2){
                return -1;
            }else{
                return 0;
            }
        }
    }


}
