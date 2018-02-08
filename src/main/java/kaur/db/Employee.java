package kaur.db;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private long id;

    @Column(name = "nimi")
    private String nimi;

    @Column(name = "ulemused")
    @ElementCollection
    private List<String> ulemused = new ArrayList<String>();

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getSupers() {
        return ulemused;
    }

    public void addSuper(String name) {
        ulemused.add(name);
    }

    public void removeSuper(String name) {
        ulemused.remove(name);
    }

    public void clearSupers() {
        ulemused.clear();
    }

    public String getName() {
        return nimi;
    }

    public void setName(String name) {
        this.nimi = name;
    }
}
