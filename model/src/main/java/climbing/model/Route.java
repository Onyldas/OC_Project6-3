package climbing.model;

import javax.persistence.*;

@Entity
public class Route {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_site")
    private Site site;
    private String cotation;
    private int nbSpits;

    public Route(Site site, String cotation, int nbSpits) {
        this.site = site;
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

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
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
