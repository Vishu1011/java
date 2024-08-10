public class StudentManagement {

    String name;
    String email;
    int phno;
    String address;
    static String school="pragara";

    public static void display()
    {
        System.out.println(school);
    }

     void display(String name, String email, int phno, String address, String school)
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phno);
        System.out.println(address);
        System.out.println(school);
    }

}

class Test
{
    public static void main(String[] args) {

        StudentManagement.display();

        StudentManagement m1=new StudentManagement();
        m1.display("vidhi","vidhiok@gmail.com", 123 ,"vancouver" ,"langara");

    }
}