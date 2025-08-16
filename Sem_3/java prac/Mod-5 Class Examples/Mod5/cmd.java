public class cmd {
    public static void main(String[] args) {
        // if(args.length<2)
        // {
        //     System.out.println("Please enter two arguments");
        //     return;
        // }
        int a = Integer.parseInt(args[0]); 
        // Parse the second argument as an integer 
        int b = Integer.parseInt(args[1]);
        int ans=a+b;
        System.out.println("The adiiton is "+ans);
    }
}
