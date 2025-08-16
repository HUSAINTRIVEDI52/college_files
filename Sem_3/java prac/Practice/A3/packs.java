import pack.*;
public class packs{
    public static void main(String[] args) {
        P1 p2=new P1("Husain",1234);
        P2 p3=new P2(1000);

        String sname=p2.getname();
        int accn=p2.getaccno();
        System.out.println("The Name of the account holder is "+sname);
        System.out.println("The account number of the "+sname+" is "+accn);
        p3.withdraw(200);
        p3.withdraw(500);
        p3.withdraw(500);
    }
}