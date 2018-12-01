package climbing.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name="id_user")
    private Users user;
    @ManyToOne (targetEntity = Site.class)
    @JoinColumn(name="id_site")
    private Site site;
    private Date date_debut;
    private Date date_fin;

    public Reservation(Users user, Site site, Date date_debut, Date date_fin) {
        this.user = user;
        this.site = site;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public Reservation() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
}
