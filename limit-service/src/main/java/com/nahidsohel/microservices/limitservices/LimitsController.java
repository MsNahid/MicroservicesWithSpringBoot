package com.nahidsohel.microservices.limitservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(10, 1);

    }
}
