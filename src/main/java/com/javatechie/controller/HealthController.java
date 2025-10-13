package com.javatechie.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HealthController {

    @GetMapping(path = "/health", produces = "application/json")
    public ResponseEntity<Map<String, String>> health() {
        return new ResponseEntity<>(
                Map.of("status","UP", "version","1.0.1"),
                HttpStatus.OK
        );
    }
}
