package climbing.model;

import javax.persistence.*;

@Entity
public class RouteComment {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_comment")
    private Comment comment;
    @ManyToOne
    @JoinColumn(name="id_route")
    private Route route;

    public RouteComment(Comment comment, Route route) {
        this.comment = comment;
        this.route = route;
    }

    public RouteComment() {
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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
