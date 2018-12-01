package climbing.model;

import javax.persistence.*;

@Entity
public class TopoComment {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_comment")
    private Comment comment;
    @ManyToOne
    @JoinColumn(name="id_topo")
    private Topo topo;

    public TopoComment(Comment comment, Topo topo) {
        this.comment = comment;
        this.topo = topo;
    }

    public TopoComment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }
}
