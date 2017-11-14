package be.cegeka.selfeval5.highway.application;

import be.cegeka.selfeval5.highway.domain.highway.Highway;
import be.cegeka.selfeval5.highway.domain.highway.HighwayService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/highway")
@Transactional
public class HighwayController {

    @Inject
    HighwayService highwayService;

    @PostMapping(path = "/add")
    public void addHighway(@RequestParam(value = "name", required = true) String name,
                           @RequestParam(value = "distance", required = true) int distance) {
        highwayService.addHighway(name, distance);
    }

    @GetMapping(path = "/getByID")
    public Highway getHighwayByID(@RequestParam(value = "id", required = true) int id) {
        return highwayService.getHighwayByID(id);
    }
}
