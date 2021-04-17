import java.util.LinkedList;

/**
 * Created by hp on 13/12/2020.
 */
public class Rooms {
    protected String nameroom ;
    private int numroom;
    protected int singleroom=10000,doubleroom=40000,familyroom=100000,numnigtht;
    public String typeroom;
    protected double nightprice,price;
    protected   String blaceroom;
customer c=new customer();
    public Rooms() {
    }
    //customer c=new customer();

    public Rooms(String nameroom, int numroom, String typeroom, String blaceroom) {
        this.nameroom = nameroom;
        this.numroom = numroom;
        this.typeroom = typeroom;
        this.blaceroom = blaceroom;

    }
    public  void rab(int singleroom,int doubleroom,int familyroom)
    {
        //singleroom=666;
numnigtht=c.getCheckout()-c.getCheckin();
        for (int i=0;i<=3;i++) {
            if (typeroom.equals(singleroom)) {
                price = numnigtht * singleroom;
            } else if (typeroom.equals(doubleroom)) {
                price = numnigtht * doubleroom;
            } else if (typeroom.equals(familyroom)) {
                price = numnigtht * familyroom;
            }
            System.out.println(price);

        }

    }



    public String getNameroom() {
        return nameroom;
    }

    public void setNameroom(String nameroom) {
        this.nameroom = nameroom;
    }

    public int getNumroom() {
        return numroom;
    }

    public void setNumroom(int numroom) {
        this.numroom = numroom;
    }

    public String getTyperoom() {
        return typeroom;
    }

    public void setTyperoom(String typeroom) {
        this.typeroom = typeroom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double nightprice) {
        this.nightprice = nightprice;
    }

    public String getBlaceroom() {
        return blaceroom;
    }

    public void setBlaceroom(String blaceroom) {
        this.blaceroom = blaceroom;
    }
public void hg()
{
    System.out.println(price);
}

    @Override
    public String toString() {
        return "romms{" +
                "nameroom='" + nameroom + '\'' +
                ", numroom=" + numroom +
                ", singleroom=" + singleroom +
                ", doubleroom=" + doubleroom +
                ", familyroom=" + familyroom +
                ", typeroom='" + typeroom + '\'' +
                ", blaceroom='" + blaceroom + '\'' +price+
                '}';
    }
    public class roommlinked{
     Rooms r=new Rooms("dining",77,"singel","four");
        LinkedList<Rooms> l=new LinkedList<>();
      public   void  add(String nameroom ,int numroom,String singleroom,String doubleroom){
            Rooms h=new Rooms( nameroom , numroom, singleroom, doubleroom);
            l.add(h);
        }
    public     void delete(Rooms index) {
            l.remove(1);
        }
     public    void update() {
            Rooms updated = new Rooms();
            l.remove(1);
            l.add(1,updated ); }
    }

}
