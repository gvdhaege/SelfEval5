package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.highway.Highway;
import be.cegeka.selfeval5.highway.domain.highway.HighwayService;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class HighwayControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayController highwayController;

    @Mock
    private HighwayService highwayService;

    @Test
    public void addHighway_shouldCallCorrespondingMethodInService() throws Exception {
        highwayController.addHighway("E40", 300);

        verify(highwayService).addHighway("E40", 300);
    }

    @Test
    public void getHighwayByID_shouldCallCorrespondingMethodInService() throws Exception {
        Highway testHighway = new Highway("E40", 300);
        highwayController.addHighway("E40", 300);
        highwayController.getHighwayByID(testHighway.getID());

        verify(highwayService).getHighwayByID(testHighway.getID());
    }

    @Test
    public void getHighwayByID_shouldReturnRightHighway() throws Exception {
        Highway testHighway = new Highway("E40", 300);
        when(highwayService.getHighwayByID(testHighway.getID())).thenReturn(testHighway);
        Highway actual = highwayController.getHighwayByID(testHighway.getID());
        Highway expected = testHighway;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}