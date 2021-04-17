import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import javafx.util.converter.*;
/**
 * Created by hp on 13/12/2020.
 */
public class testHotel {
    public static void main(String[] args){

ArrayList<person>persons=new ArrayList<>();
person therecep[]=new person[2];
        person[] thep=new person[2];
        Scanner g=new Scanner(System.in);
        int x=g.nextInt();

        person h=new person("Amar",56667,"ss872","sana");
        employee e=new employee("hadi",7774455,"@.eiml","sana",667,98,90,"four");
        customer c=new customer("rabee",6786789,"97j6h","male","male",88,2020,2012);
        customer c2=new customer("khalil",777962639,"9890","Arhab","male",99,2020,2015);

        Services s=new Services("88","net","local",777);
        Services s2=new Services("877","net","local",7907);
        persons.add(e);
for (person p:persons){
    System.out.println(p);
}

Rooms r=new Rooms("dining",77,"singel","four");
     if (x==1){
         System.out.println(e.toString());
      }
       else if(x==2){
           System.out.println(c.toString());
     }
  Booking_management b=new Booking_management();

     b.addRecep("uii",c2,99989,s2,r);
    b.addRecep("jjg",c,999,s,r);
      b.veiw();
      b.deletenumRecep(999);
      b.veiw();
    }
        }//}
