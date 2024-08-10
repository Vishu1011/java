public class StaticMethodDemo {

    public static void display()
    {
        System.out.println("inside display mehod");
    }
}


class Testing
{
    public static void main(String[] args) {
        StaticMethodDemo.display();
    }
}