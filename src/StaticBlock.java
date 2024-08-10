public class StaticBlock {

    StaticBlock()//3
    {
    System.out.println("inside default constructor");
    }
    static //1
    {
        System.out.println("static block");
    }

    {

        System.out.println("instatnce block");//2
    }

    public void test()//4
    {
    System.out.println("inside test method");
    }

    public static void main(String[] args) {
StaticBlock s=new StaticBlock();
s.test();
    }
}

