package be.cegeka.selfeval5.highway.domain.user;

import be.cegeka.selfeval5.highway.domain.incident.Incident;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

//    public User getUserByID(int id) {
//        return entityManager.createQuery("select u from User u where id = :id", Incident.class)
//                .setParameter("id", id)
//                .getSingleResult();
//
//    }
}

