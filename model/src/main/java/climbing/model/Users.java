package climbing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String pseudo;
    @NotNull
    private String mail;
    @NotNull
    private String password;
    private int age;
    private boolean pro;

    public Users() {
    }

    public Users(String pseudo, String mail, String password, int age) {
        this.pseudo = pseudo;
        this.mail = mail;
        this.password = password;
        this.age = age;
        this.pro = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPro() {
        return pro;
    }

    public void setPro(boolean pro) {
        this.pro = pro;
    }

}
