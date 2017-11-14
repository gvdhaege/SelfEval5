package be.cegeka.selfeval5.highway.domain.highway;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HighwayService {

    @Inject
    private HighwayRepository highwayRepository;

    public void addHighway(String name, int distance){
        highwayRepository.addHighway(new Highway(name, distance));
    }

    public Highway getHighwayByID(int id) {
        return highwayRepository.getHighwayByID(id);
    }
}
