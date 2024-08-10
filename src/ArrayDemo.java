public class ArrayDemo {

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};
        int a1[]=new int[30];
        a1[0]=10;

        System.out.println("array is"+arr[1]);
        System.out.println("array is"+a1[0]);


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
