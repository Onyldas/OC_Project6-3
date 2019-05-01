package climbing.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class SiteCommentId implements Serializable {

    @ManyToOne
    @JoinColumn
    private Site site;
    @ManyToOne
    @JoinColumn
    private Comment comment;

    public SiteCommentId(Site site, Comment comment) {
        this.site = site;
        this.comment = comment;
    }

    public SiteCommentId() {
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
