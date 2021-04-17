
import java.util.LinkedList;

public class customerlinked {


    customer n=new customer("rabee",678,"kk","uhio","lk",77,65,78);
LinkedList<customer> b=new LinkedList<>();


public void  add(String name, int phone, String email, String address, String gandercus, int agecus, int checkout, int checkin){
    customer h=new customer( name,  phone,  email,  address, gandercus, agecus,  checkout, checkin);
    b.add(h);
}
   public void delete(customer index) {
        b.remove(index);
    }
  public   void update() {
        customer updated = new customer();
        b.remove(1);
        b.add(1,updated);
    }
    public static void main(String[] args) {

    }
}
