package com.droneland.droneland;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface DronelandRepository extends CrudRepository<Drone, Long> {
}
