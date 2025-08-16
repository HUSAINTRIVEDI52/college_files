import java.io.*;

class RandomFileRead {

    public static void main(String[] args) {
// File files=new file("abc.dat");
        int a;
        long c;
        String st;
        long ap, cp, stp;
        try {

            RandomAccessFile raf = new RandomAccessFile("abc.dat", "rw");

          



            System.out.println("\n File Size is " + raf.length());

            System.out.println("---------------------------");
            ap = raf.getFilePointer();
            a = raf.readInt();
            System.out.println("int a=" + a);

            cp = raf.getFilePointer();
            c = raf.readLong();
            System.out.println("long c=" + c);

            stp = raf.getFilePointer();
            st = raf.readUTF();
            System.out.println("String st=" + st);

            System.out.println("---------------------------");

            raf.seek(cp);
            c = raf.readLong();
            System.out.println("Long d=" + c);
            raf.close();

        } catch (IOException var12) {
            System.out.println("There seems to be some error");

        }
    }

}