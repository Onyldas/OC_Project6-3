package climbing.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Site {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    private String description;
    private Date date;
    private String level;
    private double altitude;
    private String adresse;
    @ManyToOne
    @JoinColumn(name="id_topo")
    private Topo topo;

    public Site(@NotNull String name, String description, Date date, String level, double altitude, String adresse, Topo topo) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.level = level;
        this.altitude = altitude;
        this.adresse = adresse;
        this.topo = topo;
    }

    public Site() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }
}
