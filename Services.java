/**
 * Created by hp on 13/12/2020.
 */
public class Services {

    private String servid;
    private String servname;
    private String servtype;
    private double servprice;

    public Services() {
    }

    public Services(String servid, String servname, String servtype, double servprice) {
        this.servid = servid;
        this.servname = servname;
        this.servtype = servtype;
        this.servprice = servprice;
    }

    public String getServid() {
        return servid;
    }

    public void setServid(String servid) {
        this.servid = servid;
    }

    public String getServname() {
        return servname;
    }

    public void setServname(String servname) {
        this.servname = servname;
    }

    public String getServtype() {
        return servtype;
    }

    public void setServtype(String servtype) {
        this.servtype = servtype;
    }

    public double getServprice() {
        return servprice;
    }

    public void setServprice(double servprice) {
        this.servprice = servprice;
    }

    @Override
    public String toString() {
        return "Services{" +
                "servid='" + servid + '\'' +
                ", servname='" + servname + '\'' +
                ", servtype='" + servtype + '\'' +
                ", servprice=" + servprice +
                '}';
    }
}
