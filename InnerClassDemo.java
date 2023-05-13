
class Outer
{
    int variable1=10;

    void display()
    {
        System.out.println("I am outer class");
    }

    class Inner
    {
        int variable2=66;

        
        void show()
        {
            System.out.println("I am inner class");
        }
    }

    


}





public class InnerClassDemo {
  
    public static void main(String args[])
    {
        Outer ob = new Outer();
        ob.display();

        Outer.Inner iob = new Outer().new Inner();

        iob.show();
    }
}
