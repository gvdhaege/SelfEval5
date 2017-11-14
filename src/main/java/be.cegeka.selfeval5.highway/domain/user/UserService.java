package be.cegeka.selfeval5.highway.domain.user;

import be.cegeka.selfeval5.highway.domain.incident.Incident;
import be.cegeka.selfeval5.highway.domain.incident.IncidentRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {

    @Inject
    private UserRepository userRepository;

    public void addUser(String name){
        userRepository.addUser(new User(name));
    }

//    public Incident getUserByID(int id) {
//        return userRepository.getUserByID(id);
//    }
}