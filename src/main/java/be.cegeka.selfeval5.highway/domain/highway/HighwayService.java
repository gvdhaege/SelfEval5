package be.cegeka.selfeval5.highway.domain.highway;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HighwayService {

    @Inject
    private HighwayRepository highwayRepository;

    public void addHighway(Highway highway){
        highwayRepository.addHighway(highway);
    }
}
