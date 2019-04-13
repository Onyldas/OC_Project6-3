package climbing.model;

import javax.persistence.*;

@Entity
public class Route {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(targetEntity = Sector.class)
    @JoinColumn(name="id_sector")
    private Sector sector;
    private String cotation;
    private int nbSpits;

    public Route(Sector sector, String cotation, int nbSpits) {
        this.sector = sector;
        this.cotation = cotation;
        this.nbSpits = nbSpits;
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sector getSite() {
        return sector;
    }

    public void setSite(Sector sector) {
        this.sector = sector;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public int getNbSpits() {
        return nbSpits;
    }

    public void setNbSpits(int nbSpits) {
        this.nbSpits = nbSpits;
    }
}
