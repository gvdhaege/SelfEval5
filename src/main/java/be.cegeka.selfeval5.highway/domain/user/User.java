package be.cegeka.selfeval5.highway.domain.user;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
