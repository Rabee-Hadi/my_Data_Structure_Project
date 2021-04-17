import java.util.AbstractCollection;
import java.util.AbstractMap;

/**
 * Created by hp on 13/12/2020.
 */
public  class  person {
    private String name;
    private int phone;
    private String email,adress;

    public person() {
    }

    public person(String name, int phone, String email ,String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adress=address;

    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
