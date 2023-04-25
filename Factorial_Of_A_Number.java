import java.util.*;
class Factorial{
    static int factorial(int f)
    {
        if(f == 1 || f == 0)
        {
            return 1;
        }
        else{
            return f*factorial(f-1);
        }
    }
    public static void main(String args [])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int f = s.nextInt();
        System.out.println("Factorial of the number is : "+factorial(f));
    }
}
