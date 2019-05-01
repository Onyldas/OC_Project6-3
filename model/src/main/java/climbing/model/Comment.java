package climbing.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String content;
    @ManyToOne (targetEntity = Users.class)
    @JoinColumn(name="id_user")
    private Users user;
    @NotNull
    private Date date;

    public Comment(@NotNull String content, Users user, @NotNull Date date) {
        this.content = content;
        this.user = user;
        this.date = date;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
