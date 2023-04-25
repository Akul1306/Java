class Shape{
    int a,b;
    void setShape(int a, int b){
        this.a = a;
        this.b = b;
    }
    Shape(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main (String args[])
    {
        Shape s1 = new Shape(23,33);
        Shape s2 = new Shape(12,44);
        System.out.println("before scenario");
        System.out.println("address of s1 "+s1.hashCode());
        System.out.println("address of s2 "+s2.hashCode());
        s1=s2;
        System.out.println("after scenario");
        System.out.println("address of s1 "+s1.hashCode());
        System.out.println("address of s2 "+s2.hashCode());
    }
}
