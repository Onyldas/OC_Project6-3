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
    private String name;
    private Boolean defaultSector;
    private String description;

    public Sector(Site site, String name, Boolean defaultSector, String description) {
        this.site = site;
        this.name = name;
        this.defaultSector = defaultSector;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDefaultSector() {
        return defaultSector;
    }

    public void setDefaultSector(Boolean defaultSector) {
        this.defaultSector = defaultSector;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
