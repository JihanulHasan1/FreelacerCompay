
package freelancingcompany;
import java.io.Serializable;
import java.time.LocalDate;
public class Intern extends User implements Serializable{
    
    protected String Gender;
    protected String ID;

    public Intern(String Name, String Email, LocalDate DOB, String password) {
        super(Name, Email, DOB, password);
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getPassword() {
        return password;
    }
}
