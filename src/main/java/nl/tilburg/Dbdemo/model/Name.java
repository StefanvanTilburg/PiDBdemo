package nl.tilburg.Dbdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Stefan van Tilburg
 */
@Entity
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;

    public Name(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Name(String firstName) {
        this(-1, firstName);
    }

    public Name() {
        this("Default name");
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
}
