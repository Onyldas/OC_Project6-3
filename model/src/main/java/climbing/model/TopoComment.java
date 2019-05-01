package climbing.model;

import javax.persistence.*;

@Entity
public class TopoComment {
    @EmbeddedId
    private TopoCommentId id;

    public TopoComment(TopoCommentId id) {
        this.id = id;
    }

    public TopoComment() {
    }

    public TopoCommentId getId() {
        return id;
    }

    public void setId(TopoCommentId id) {
        this.id = id;
    }
}
