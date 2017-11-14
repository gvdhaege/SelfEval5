package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.incident.IncidentService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class IncidentControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private IncidentController incidentController;

    @Mock
    private IncidentService incidentService;

    @Test
    public void addHighway_shouldCallCorrespondingMethodInService() throws Exception {
        incidentController.addIncident("Bandicoot", "Crash", 34,1);
        verify(incidentService).addIncident("Bandicoot", "Crash", 34, 1);

    }
}