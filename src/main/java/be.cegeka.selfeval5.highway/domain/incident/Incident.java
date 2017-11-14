package be.cegeka.selfeval5.highway.domain.incident;

import javax.persistence.*;

@Entity
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DISTANCE")
    private int distance;

    public Incident() {
    }

    public Incident(String name, String type, int distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
    }
}

