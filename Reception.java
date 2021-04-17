import java.util.LinkedList;

/**
 * Created by hp on 13/12/2020.
 */
public class Reception {
    private int numRecep;
    public String nameRecep;
    public customer cust;
    private Rooms numroom;
    protected double numnigtht;
    private employee emp;
    public Services ser;
    Rooms b=new Rooms();
    Services s=new Services();
    private  double price;


    public Reception() {
    }

    public Reception( String nameRecep, customer numcust, int numRecep,Services ser,Rooms numroom) {
        this.nameRecep=nameRecep;
        this.cust = numcust;
        this.numRecep=numRecep;
        this.ser=ser;
        this.numroom=numroom;


    }

    public int getNumRecep() {
        return numRecep;
    }

    public void setNumRecep(int numRecep) {
        this.numRecep = numRecep;
    }

    public String getNameRecep() {
        return nameRecep;
    }

    public void setNameRecep(String nameRecep) {
        this.nameRecep = nameRecep;
    }

    public customer getCust() {
        return cust;
    }

    public void setCust(customer cust) {
        this.cust = cust;
    }

    public Services getSer() {
        return ser;
    }

    public Rooms getNumroom() {
        return numroom;
    }

    public void setNumroom(Rooms numroom) {
        this.numroom = numroom;
    }

    public void setSer(Services ser) {
        this.ser = ser;
    }
    public class recep{
        Reception h =new Reception("uii",cust,99989,ser,numroom);
        LinkedList<Reception> l=new LinkedList<>();


     public    void  add(String nameRecep, customer numcust, int numRecep,Services ser,Rooms numroom){
            Reception h=new Reception(nameRecep, numcust,  numRecep, ser,numroom);
            l.add(h);
        }
      public   void delete(Rooms index) {
            l.remove(1);
        }
     public    void update() {
            Reception updated = new Reception();
            l.remove(1);
            l.add(1,updated);
        }
        public void print(){
         l.toString();
        }}
    @Override
    public String toString() {
        return "Reception{" +
                "numRecep=" + numRecep +
                ", nameRecep='" + nameRecep + '\'' +
                ", cust=" + cust +
                ", numroom=" + numroom +
                ", ser=" + ser +
                '}';
    }


}
