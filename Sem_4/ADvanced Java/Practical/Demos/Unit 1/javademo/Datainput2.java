import java.io.*;

class Datainput2
{
	public static void main(String args[]) throws IOException
	{
		File F=new File("a3.dat");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(F));
		dos.writeInt(12);
		dos.writeLong((long)12346777);
		dos.writeFloat(34.67F);
		dos.writeDouble(346.76);
		dos.writeBoolean(true);
		dos.close();

		DataInputStream dis=new DataInputStream(new FileInputStream(F));
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());							   System.out.println(dis.readDouble());
								System.out.println(dis.readBoolean());
		dos.close();

	}

}
		
