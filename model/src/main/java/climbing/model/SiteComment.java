package climbing.model;

import javax.persistence.*;

@Entity
public class SiteComment {
    @EmbeddedId
    private SiteCommentId id;

    public SiteComment(SiteCommentId id) {
        this.id = id;
    }

    public SiteComment() {
    }

    public SiteCommentId getId() {
        return id;
    }

    public void setId(SiteCommentId id) {
        this.id = id;
    }
}
