package com.droneland.droneland;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DroneService {

    @Autowired
    DronelandRepository repo;

    public Drone save(Drone drone){
        return repo.save(drone);
    }

    public Drone get(Long id){return repo.findById(id).orElseThrow( () -> new RuntimeException());}

    public List<Drone> getAll() {
        Iterable<Drone> iterator = repo.findAll();
        List<Drone> drone = new ArrayList<Drone>();
        for (Drone drones : iterator)  drone.add(drones);
        return drone;
    }
}
