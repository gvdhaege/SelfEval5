package be.cegeka.selfeval5.highway.domain.highway;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;


public class HighwayServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayService highwayService;

    @Mock
    private HighwayRepository highwayRepository;

    @Test
    public void addHighway_shouldActivateCorrespondingMethodInRepository() throws Exception {
        Highway testHighway = new Highway("Route 66", 666);
        highwayService.addHighway(testHighway);
        verify(highwayRepository).addHighway(testHighway);
    }
}