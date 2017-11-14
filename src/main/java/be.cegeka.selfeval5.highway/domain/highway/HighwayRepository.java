package be.cegeka.selfeval5.highway.domain.highway;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class HighwayRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Highway> getAll() {
        return entityManager.createQuery("select h from Highway h", Highway.class).getResultList();
    }

    public void addHighway(Highway highway) {
        entityManager.persist(highway);
    }

    public Highway getHighwayByID(int id) {
        return entityManager.createQuery("select h from Highway h where id = :id", Highway.class)
                .setParameter("id", id)
                .getSingleResult();

    }
}
