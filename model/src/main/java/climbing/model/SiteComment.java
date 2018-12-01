package climbing.model;

import javax.persistence.*;

@Entity
public class SiteComment {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name="id_commentaire")
    private Comment comment;
    @ManyToOne
    @JoinColumn(name="id_site")
    private Site site;

    public SiteComment() {
    }

    public SiteComment(Comment comment, Site site) {
        this.comment = comment;
        this.site = site;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
