package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.highway.Highway;
import be.cegeka.selfeval5.highway.domain.highway.HighwayService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class HighwayControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayController highwayController;

    @Mock
    private HighwayService highwayService;

    @Test
    public void addHighway_shouldCallCorrespondingMethodInService() throws Exception {
    Highway testHighway = new Highway("E40", 300);
    highwayController.addHighway(testHighway);

        verify(highwayService).addHighway(testHighway);
    }
}