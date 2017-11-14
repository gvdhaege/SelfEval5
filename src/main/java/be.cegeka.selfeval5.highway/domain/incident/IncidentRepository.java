package be.cegeka.selfeval5.highway.domain.incident;

import be.cegeka.selfeval5.highway.domain.incident.Incident;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class IncidentRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Incident> getAll() {
        return entityManager.createQuery("select i from Incident i", Incident.class).getResultList();
    }

    public void addIncident(Incident incident) {
        entityManager.persist(incident);
    }

//    public Incident getIncidentByID(int id) {
//        return entityManager.createQuery("select i from Incident i where id = :id", Incident.class)
//                .setParameter("id", id)
//                .getSingleResult();
//
//    }
}
