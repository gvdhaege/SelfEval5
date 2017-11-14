package be.cegeka.selfeval5.highway.domain.incident;

import be.cegeka.selfeval5.highway.domain.highway.Highway;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class IncidentService {

    @Inject
    private IncidentRepository incidentRepository;

    public void addIncident(String name, String type, int distance, int highwayID){
        incidentRepository.addIncident(new Incident(name, type, distance, highwayID));
    }

//    public Incident getIncidentByID(int id) {
//        return incidentRepository.getIncidentByID(id);
//    }
}
