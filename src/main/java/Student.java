import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {


    @Id
    private int id;
    private String firstName;
    private String lastNAme;

    public Student() {
    }

    public Student(int id, String firstName, String lastNAme) {
        this.id = id;
        this.firstName = firstName;
        this.lastNAme = lastNAme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }
}
