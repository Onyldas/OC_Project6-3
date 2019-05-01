package climbing.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class TopoCommentId implements Serializable {

    @ManyToOne
    @JoinColumn
    private Topo topo;
    @ManyToOne
    @JoinColumn
    private Comment comment;

    public TopoCommentId(Topo topo, Comment comment) {
        this.topo = topo;
        this.comment = comment;
    }

    public TopoCommentId() {
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
