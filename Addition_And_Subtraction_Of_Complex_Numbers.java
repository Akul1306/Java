import java.util.Scanner;
class Complex {
    int real,imaginary;
public Complex(int real,int imaginary)
{
    this.real = real;
    this.imaginary = imaginary;
}
public Complex add(Complex other)
{
return new Complex((this.real + (other.real)),(this.imaginary + (other.imaginary)));
}
public Complex subtract(Complex other) {
    return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number");
        System.out.println("Real part: ");
        int real1 = sc.nextInt();
        System.out.println("Imaginary part: ");
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1,imaginary1);

        System.out.println("Enter second complex number");
        System.out.println("Real part: ");
        int real2 = sc.nextInt();
        System.out.println("Imaginary part: ");
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2,imaginary2);

        System.out.println("Sum: ");
        System.out.println(c1.add(c2));
        System.out.println("Difference: ");
        System.out.println(c1.subtract(c2));
    }
}








