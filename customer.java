/**
 * Created by hp on 13/12/2020.
 */
public class customer {

   private String name;
    private  int phone;
    private  String email;
    private String address;
    private  String gandercus;
    private int agecus,checkin,checkout;

    public customer() {
    }

    public customer(String name, int phone, String email, String address, String gandercus, int agecus, int checkout, int checkin) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gandercus = gandercus;
        this.agecus = agecus;
        this.checkin=checkin;
        this.checkout=checkout;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGandercus() {
        return gandercus;
    }

    public void setGandercus(String gandercus) {
        this.gandercus = gandercus;
    }

    public int getAgecus() {
        return agecus;
    }

    public void setAgecus(int agecus) {
        this.agecus = agecus;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gandercus='" + gandercus + '\'' +
                ", agecus=" + agecus +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                '}';
    }
}

