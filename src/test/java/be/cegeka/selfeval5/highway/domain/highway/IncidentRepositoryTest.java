package be.cegeka.selfeval5.highway.domain.highway;

import be.cegeka.selfeval5.highway.Application;
import be.cegeka.selfeval5.highway.domain.incident.Incident;
import be.cegeka.selfeval5.highway.domain.incident.IncidentRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class IncidentRepositoryTest {

    @Inject
    private IncidentRepository incidentRepository;

    @PersistenceContext
    private EntityManager entityManager;
    private Incident testIncident = new Incident("Bandicoot", "Crash", 24);

    @Test
    public void getAllHighways_shouldReturnAllHighways() throws Exception {
        entityManager.persist(testIncident);
        List<Incident> actual = incidentRepository.getAll();
        List<Incident> expected = new ArrayList<>();
        expected.add(testIncident);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addIncident_shouldAddIncidentToDB() throws Exception {
        incidentRepository.addIncident(testIncident);
        List<Incident> actual = incidentRepository.getAll();
        List<Incident> expected = new ArrayList<>();
        expected.add(testIncident);
    }
}