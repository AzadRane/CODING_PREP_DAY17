class A 
{
    final int x =22;
    final int y;

    A()
    {
        y=33;
    }

    void display()
    {
        final int a= 11;
        final int b;

        b=44;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}


public class FinalKeyWordDemo
{
    public static void main(String args[])
    {
        A ob = new A();
        

        ob.display();
    }
}