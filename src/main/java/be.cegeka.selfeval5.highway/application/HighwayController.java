package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.highway.Highway;
import be.cegeka.selfeval5.highway.domain.highway.HighwayService;

import javax.inject.Inject;

public class HighwayController {

    @Inject
    HighwayService highwayService;

    public void addHighway(Highway highway) {
        highwayService.addHighway(highway);
    }
}
