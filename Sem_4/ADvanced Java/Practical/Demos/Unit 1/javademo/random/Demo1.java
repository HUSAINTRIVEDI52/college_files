

import java.io.*;

class Demo1
{
	public static void main(String args[]) throws IOException
	{
			RandomAccessFile raf=new RandomAccessFile("dat2.dat","rw");
			int x[]={11,23,45,67,78};
			for(int i=0;i<x.length;i++)
			{
				raf.writeInt(x[i]);
			}
			
			raf.writeInt(11);
			raf.writeInt(11);
			long dp=raf.getFilePointer();
			raf.writeDouble(11.45);
			raf.writeDouble(11.67);
			raf.writeChar('A');
			raf.writeChar('B');
			raf.seek(0);
			//int x[]={11,23,45,67,78}; 11 11
				
			System.out.println("int no is:" + raf.readInt());
			raf.seek(raf.getFilePointer()+4);
			
			System.out.println("int no is:" + raf.readInt());
			raf.seek(raf.getFilePointer()+4);
			
System.out.println("int no is:" + raf.readInt());

			raf.seek(dp);

			System.out.println("double no is:" + raf.readDouble());
			raf.seek(raf.getFilePointer()+8);
			System.out.println("char is:" + raf.readChar());
			raf.close();
	}

}
