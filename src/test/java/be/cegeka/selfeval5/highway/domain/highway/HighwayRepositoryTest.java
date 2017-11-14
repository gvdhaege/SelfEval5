package be.cegeka.selfeval5.highway.domain.highway;

import be.cegeka.selfeval5.highway.Application;
import org.assertj.core.api.Assertions;
import org.junit.After;
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

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class HighwayRepositoryTest {

    @Inject
    private HighwayRepository highwayRepository;

    @PersistenceContext
    private EntityManager entityManager;
    private Highway testHighway = new Highway("Route 66", 666);


    @Test
    public void getAllHighways_shouldReturnAllHighways() throws Exception {
        entityManager.persist(testHighway);
        List<Highway> actual = highwayRepository.getAll();
        List<Highway> expected = new ArrayList<>();
        expected.add(testHighway);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addHighway_shouldAddTheHighwayToDB() throws Exception {
        highwayRepository.addHighway(testHighway);
        List<Highway> actual = highwayRepository.getAll();
        List<Highway> expected = new ArrayList<>();
        expected.add(testHighway);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @After
    public void tearDown() throws Exception {
        entityManager.clear();
    }
}