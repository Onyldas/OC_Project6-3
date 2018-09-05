package climbing.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String content;
    @ManyToOne
    @JoinColumn(name="id_user")
    private Users user;
    private Date date;
    private int note;
    @ManyToOne
    @JoinColumn(name="id_site")
    private Site site;

    public Comment(String content, Users user, Date date, int note, Site site) {
        this.content = content;
        this.user = user;
        this.date = date;
        this.note = note;
        this.site = site;
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

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
