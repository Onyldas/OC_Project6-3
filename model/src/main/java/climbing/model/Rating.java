package climbing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    private String worded;

    public Rating(String worded) {
        this.worded = worded;
    }

    public Rating() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorded() {
        return worded;
    }

    public void setWorded(String worded) {
        this.worded = worded;
    }
}
