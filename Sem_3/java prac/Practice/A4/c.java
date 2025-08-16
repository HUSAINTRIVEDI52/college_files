public class c{
    public static void main(String[] args) {
        try{
        int arr[]={1,2,3};
        // System.out.println(arr[4]);

        int div=10/0;
        System.out.println(div);
        }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Array is out of bounds:"+e.getMessage());
        // }
        // catch(ArithmeticException e){
        //     System.out.println("The arithmetic exception is"+e.getMessage());
        // }
        catch(Exception e)
        {
            System.out.println("An unknown exception occured"+e.getMessage());
        }

    }
}