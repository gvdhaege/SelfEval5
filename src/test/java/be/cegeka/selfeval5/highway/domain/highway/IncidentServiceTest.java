package be.cegeka.selfeval5.highway.domain.highway;

import be.cegeka.selfeval5.highway.domain.incident.Incident;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class IncidentServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentService incidentService;

    @Mock
    private IncidentRepository incidentRepository;

    @Test
    public void addIncident_shouldCallCorrespondingMethodInRepository() throws Exception {
        incidentService.addIncident("Bandicoot", "Crash", 24);
        verify(incidentRepository).addIncident(Mockito.refEq(new Incident("Bandicoot", "Crash", 24)));
    }


}