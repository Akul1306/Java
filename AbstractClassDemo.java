abstract class Shape
{
    public void display(){
        System.out.println("In abstract class shape");
    }
}
class Squares extends Shape{
    public void area(float side)
    {
        System.out.println("Area is : "+(side*side));
    }
}
class AbstractClassDemo
{
    public static void main(String args[])
    {
        Squares s = new Squares();
        s.display();
        s.area(4);
    }
}
