package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

public class UserController {
    @Inject
    UserService userService;

    //    @GetMapping(path = "/getByID")
//    public Incident getIncidentByID(@RequestParam(value = "id", required = true) int id) {
//        return incidentService.getIncidentByID(id);
//    }
//
    @PostMapping(path = "/add")
    public void addUser(@RequestParam(value = "name", required = true) String name) {
        userService.addUser(name);
    }
}
