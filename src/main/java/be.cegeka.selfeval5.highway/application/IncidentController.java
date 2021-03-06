package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.highway.Highway;
import be.cegeka.selfeval5.highway.domain.incident.IncidentService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/incident")
@Transactional
public class IncidentController {

    @Inject
    IncidentService incidentService;

//    @GetMapping(path = "/getByID")
//    public Incident getIncidentByID(@RequestParam(value = "id", required = true) int id) {
//        return incidentService.getIncidentByID(id);
//    }
//
    @PostMapping(path = "/add")
    public void addIncident(@RequestParam(value = "name", required = true) String name,
                            @RequestParam(value = "type", required = true) String type,
                            @RequestParam(value = "distance", required = true) int distance,
                            @RequestParam(value = "highwayID", required = true) int highwayID) {
    incidentService.addIncident(name, type, distance, highwayID);
    }
}
