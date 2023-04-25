import java.util.*;
class Area {
    double length;
    double breadth;

    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        double z = (length * breadth);
        System.out.println("Area of the rectangle is: "+z);
    }
}
    public class AreaOfRectangle{
        public static void main(String [] args)
        {
            Scanner sc =  new Scanner(System.in);
            System.out.println("Akul Srivastava , Roll Number: 22CSU247");
            System.out.println("Enter length of the rectangle: ");
            double l = sc.nextDouble();
            System.out.println("Enter breadth of the rectangle: ");
            double b = sc.nextDouble();
            Area ar = new Area(l,b);
            ar.displayArea();
        }
    }

