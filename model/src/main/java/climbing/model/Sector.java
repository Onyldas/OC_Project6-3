package climbing.model;

import javax.persistence.*;

@Entity
public class Sector {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(targetEntity = Site.class)
    @JoinColumn(name="id_site")
    private Site site;
    private String Nom;
    private String Description;

    public Sector(Site site, String nom, String description) {
        this.site = site;
        Nom = nom;
        Description = description;
    }

    public Sector(){
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

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
