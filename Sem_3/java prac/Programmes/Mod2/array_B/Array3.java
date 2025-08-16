class Array3{
	//return the array from  function
	
	static int[] create()//array
	{
		int[] ar={10,20,30,40};
		int[] even;
		int[] odd;
		//find and create two sub array....odd..even...
		for(int i=0;i<ar.length;i++)
		{
				if(ar[i]%2==0)
				{
					even[i]=ar[i];
				}
				else
				{
					odd[i]=ar[i];
				}
		}
		
		return new create(odd,even);//array
	}
	public static void main(String[] args)
	{
		int[] newarr=create();//array
		
		for(int i=0;i<newarr.length;i++)
		{
				System.out.println(newarr[i]);
		}
		
		Array3 a=new Array3();
		int q[]=a.getArray1();
		int r[]=a.getArray2();
	}
	
}