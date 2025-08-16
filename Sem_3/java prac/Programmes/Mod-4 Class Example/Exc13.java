class MyOwnExceptionClass extends Exception 
{
 
    private int price;
 
    public MyOwnExceptionClass(int price)
	{
        this.price = price; //-120
    }
 
    public String toString()
    {
        return "Price should not be in negative, you have entered" +price;
    }
 
}

public class Exc13
	{
		public static void main(String[] args)throws Exception
		{
			int price = -120;
 
			if(price < 0)
				throw new MyOwnExceptionClass(price);
			else
				System.out.println("Price is :"+price);
	}
}	