package com.droneland.droneland;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DronelandController {

    @Autowired
    DroneService service;

    Logger logger = (Logger) LoggerFactory.getLogger(DronelandController.class);

    @PostMapping("/drone")
    public Drone createDrone(@RequestBody Drone drone){
        return service.save(drone);
    }

    @GetMapping("/drone/{id}")
    public Drone getDrone(@PathVariable String id){
        //logger.info("GET request on route drones with {}", id);
        Long droneId = Long.parseLong(id);
        return service.get(droneId);
    }

    @GetMapping("/drone")
    public List<Drone> getAllThings() {
        return service.getAll();
    }
}
