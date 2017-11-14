package be.cegeka.selfeval5.highway.domain.incident;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class IncidentService {

    @Inject
    private IncidentRepository incidentRepository;

    public void addIncident(String name, String type, int distance){
        incidentRepository.addIncident(new Incident(name, type, distance));
    }

//    public Incident getIncidentByID(int id) {
//        return incidentRepository.getIncidentByID(id);
//    }
}
