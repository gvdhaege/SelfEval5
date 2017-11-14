package be.cegeka.selfeval5.highway.domain.highway;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;


public class HighwayServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighwayService highwayService;

    @Mock
    private HighwayRepository highwayRepository;

    @Test
    public void addHighway_shouldCallCorrespondingMethodInRepository() throws Exception {
        highwayService.addHighway("E40", 300);
        verify(highwayRepository).addHighway(refEq(new Highway("E40", 300)));
    }

    @Test
    public void getHighwayByID_shouldCallCorrespondingMethodInRepository() throws Exception {
        Highway testHighway = new Highway("E40", 300);
        highwayService.getHighwayByID(testHighway.getID());
        verify(highwayRepository).getHighwayByID(testHighway.getID());
    }

    @Test
    public void getHighwayByID_shouldReturnRightHighway() throws Exception {
        Highway testHighway = new Highway("E40", 300);
        when(highwayRepository.getHighwayByID(testHighway.getID())).thenReturn(testHighway);
        Highway actual = highwayService.getHighwayByID(testHighway.getID());
        Highway expected = testHighway;
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}