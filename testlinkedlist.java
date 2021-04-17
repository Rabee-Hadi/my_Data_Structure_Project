import java.util.LinkedList;
import java.util.Scanner;

public class testlinkedlist {
    public static void main(String[] args) {
        customer b=new customer("rabee",678,"kk","uhio","lk",77,65,78);
        LinkedList<customer> c=new LinkedList<>();
        c.add(b);
        c.add(1,b);
        System.out.println( c.remove(b));
        System.out.println( c.toString());
        System.out.println(c.size());
        System.out.println(c.add(b));
        System.out.println(c.size());

        customer c2=new customer("khalil",777962639,"9890","Arhab","male",99,2020,2015);
        Rooms r=new Rooms("dining",77,"singel","four");
        Services s=new Services("88","net","local",777);
        Reception R=new Reception("uii", c2,99989,s,r);
        LinkedList<Reception> l=new LinkedList<>();
        l.add(R);
        l.add(1,R);
        System.out.println( l.remove(1));
        System.out.println(l.size());
        System.out.println(l.add(R));
        System.out.println(l.size());
        Scanner g=new Scanner(System.in);
        int x=g.nextInt();
        if (x==1){
            l.add(1,R);

        }
    }
}
