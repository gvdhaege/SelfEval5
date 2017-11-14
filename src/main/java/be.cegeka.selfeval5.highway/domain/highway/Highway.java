package be.cegeka.selfeval5.highway.domain.highway;

import javax.persistence.*;

@Entity
public class Highway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DISTANCE")
    private int distance;

    public Highway() {
    }

    public Highway(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


    public int getID() {
        return id;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
