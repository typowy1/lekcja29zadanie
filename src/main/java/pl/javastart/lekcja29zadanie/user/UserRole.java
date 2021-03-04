package pl.javastart.lekcja29zadanie.user;

import javax.persistence.*;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private pl.javastart.lekcja29zadanie.user.Role role;

    public UserRole() {
    }

    public UserRole(User user, pl.javastart.lekcja29zadanie.user.Role role) {
        this.user = user;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public pl.javastart.lekcja29zadanie.user.Role getRole() {
        return role;
    }

    public void setRole(pl.javastart.lekcja29zadanie.user.Role role) {
        this.role = role;
    }
}
