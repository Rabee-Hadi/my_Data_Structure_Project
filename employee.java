/**
 * Created by hp on 13/12/2020.
 */
public class employee extends person {
    private  double empsalary,ponse,didaction,salary;

    private String empdagree;


    public employee() {
    }

    public employee(String name,int phone, String email, String address, double empsalary, double ponse, double didaction,  String empdagree) {
        super(name,phone, email, address);
        this.empsalary = empsalary;
        this.ponse = ponse;
        this.didaction = didaction;
        this.empdagree = empdagree;

    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    public String getEmpdagree() {
        return empdagree;
    }

    public void setEmpdagree(String empdagree) {
        this.empdagree = empdagree;
    }

    public double getPonse() {
        return ponse;
    }

    public void setPonse(double ponse) {
        this.ponse = ponse;
    }

    public double getDidaction() {
        return didaction;
    }

    public void setDidaction(double didaction) {
        this.didaction = didaction;
    }

    public void  getsalary(double empsalary, double ponse, double didaction)
    {
        salary=empsalary+ponse-didaction;
    }
    public double salary(){
        return salary=(empsalary+ponse)-didaction;
    }
    @Override
    public String toString() {
        return super.toString()+"Embloyees{" +
                "empsalary=" + empsalary +
                ", ponse=" + ponse +
                ", didaction=" + didaction +
                ", salary=" + salary() +
                ", empdagree='" + empdagree + '\'' +
                '}';
    }


}
