package com.droneland.droneland;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DronelandController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
}
