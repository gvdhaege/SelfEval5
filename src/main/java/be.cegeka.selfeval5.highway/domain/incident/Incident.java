package be.cegeka.selfeval5.highway.domain.incident;

import be.cegeka.selfeval5.highway.application.HighwayController;
import be.cegeka.selfeval5.highway.domain.highway.Highway;

import javax.inject.Inject;
import javax.persistence.*;

@Entity
public class Incident {
    @Inject
    HighwayController highwayController;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DISTANCE")
    private int distance;
    @ManyToOne
    @JoinColumn(name = "HIGHWAY_ID")
    private int highwayID;

    public Incident() {
    }

    public Incident(String name, String type, int distance, int highwayID) {
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.highwayID = highwayID;
    }
}

