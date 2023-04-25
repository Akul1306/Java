class Triangle {
    float side1; float side2; float side3;
    Triangle()
    {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    float perimeterOfTriangle()
    {
        float perimeter = side1 + side2 + side3;
        return perimeter;
    }
    double areaOfTriangle() {
        float s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
public class TriangleProperty
{
    public static void main(String args[])
    {
        System.out.println("Akul Srivastava , Roll Number: 22CSU247");
            Triangle t = new Triangle();
        System.out.println("Perimeter of th triangle is: "+t.perimeterOfTriangle()+"units");
        System.out.println("Area of a Triangle is: "+t.areaOfTriangle()+"units square");
    }
}
