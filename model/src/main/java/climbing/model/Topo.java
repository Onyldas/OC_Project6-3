package climbing.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Topo {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String titre;
    @NotNull
    private String region;
    @NotNull
    private String resume;
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name="id_user")
    private Users user;

    public Topo(@NotNull String titre, @NotNull String region, @NotNull String resume, Users user) {
        this.titre = titre;
        this.region = region;
        this.resume = resume;
        this.user = user;
    }

    public Topo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
