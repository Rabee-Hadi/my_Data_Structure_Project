import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by hp on 13/12/2020.
 */
import java.util.Queue;
public class Booking_management {
    LinkedList<Reception> n=new LinkedList<>();
private static class node<e> {
    LinkedList<Reception> n=new LinkedList<>();
    private customer d;}
    private ArrayList<Reception> therecebction;

    public Booking_management() {
        Reception l=new Reception();
        therecebction = new ArrayList<>();
        therecebction.add(l);
    }
   public void addRecep(String nameRecep, customer cust, int numRecep,Services serv,Rooms numroom) {
        Reception r = new Reception(nameRecep, cust, numRecep,serv,numroom);

         therecebction.add(r); }public void veiw() {
        for (Reception reception:therecebction) ;
        System.out.println(therecebction); }
    public void deletenumRecep(int numRecep) {
        for (int i = 0; i <= therecebction.size(); i++) {
            if (therecebction.get(i).getNumRecep() == numRecep)
                therecebction.remove(i); } }}
