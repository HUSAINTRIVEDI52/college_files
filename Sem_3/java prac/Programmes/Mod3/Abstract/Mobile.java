abstract class RAM{
	
	abstract int getMemory();
}
class Samsung extends RAM{
		int getMemory()
		{
			return 12;
		}
}
class Apple extends RAM{
		int getMemory()
		{
			return 6;
		}
}

class MI extends RAM{
		int getMemory()
		{
			return 4;
		}
}

class Mobile{
	public static void main(String[] args)
	{
		RAM m=new MI();
		System.out.println(m.getMemory());
			
	}
	
}