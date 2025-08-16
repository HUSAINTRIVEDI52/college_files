public class byzero
{
    public static void main(String[] args)
    {
        try{
            int a=10/0;
            int b=100/0;

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
