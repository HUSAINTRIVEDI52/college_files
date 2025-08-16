abstract class Memory{
	abstract int getRam();
}
class Samsung extends Memory{
	int getRam()
	{
		return 12;
	}
}
class Apple extends Memory{
	int getRam()
	{
		return 8;
	}
}
class MI extends Memory{
	int getRam()
	{
		return 4;
	}
}
class Mobile{ 
	public static void main(String[] args)
	{
		Memory m=new Apple();
		System.out.println("Apple ram : "+m.getRam());
		m=new Samsung();
		System.out.println("Sam ram : "+m.getRam());
	}
}
