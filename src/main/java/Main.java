import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");

        EntityManager manager = factory.createEntityManager();

        Student s1 = new Student(1, "Hassan", "Shokoohi");


    }
}
