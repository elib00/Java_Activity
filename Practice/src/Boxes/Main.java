package Boxes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String choice;
        Scanner s = new Scanner(System.in);
        BigBox box = null;
        ArrayList<BigBox> boxes = new ArrayList<>();

        do{
            System.out.print("Enter your choice: ");
            choice = s.nextLine();

            switch (choice){
                case "s":
                    System.out.print("Enter length: ");
                    double length = s.nextDouble();
                    System.out.print("Enter width: ");
                    double width = s.nextDouble();
                    s.nextLine();
                    System.out.print("Enter color: ");
                    String color = s.nextLine();
                    box = new SmallBox(length, width, color);
                    boxes.add(box);
                    break;
            }
        }while(choice.compareTo("x") != 0);

        do{
            System.out.print("How to sort: ");
            choice = s.nextLine();

            switch (choice){
                case "Area":
                    Collections.sort(boxes, new BigBox.AreaComparator());
                    for(BigBox b : boxes){
                        System.out.println(b + ": " + b.getArea());
                    }
                    break;
                case "Perimeter":
                    Collections.sort(boxes, new BigBox.PerimeterComparator());
                    for(BigBox b : boxes){
                        System.out.println(b + ": " + b.getPerimeter());
                    }
                    break;
                case "Color":
                    Collections.sort(boxes);
                    for(BigBox b : boxes){
                        System.out.println(b + ": " + b.getArea());
                    }
                    break;
            }

        }while(choice.compareTo("x") != 0);

    }
}
