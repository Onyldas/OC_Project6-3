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
    private String departement;
    @NotNull
    private String resume;
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name="id_auteur")
    private Users user;

    public Topo(@NotNull String titre, @NotNull String region, @NotNull String resume, Users user) {
        this.titre = titre;
        this.departement = region;
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

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
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
