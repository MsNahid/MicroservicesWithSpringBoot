package com.nahidsohel.microservices.limitservices;

import com.nahidsohel.microservices.limitservices.configuration.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(configuration.getMaximum(), configuration.getMinimum());

//        return new Limits(10, 1);

    }
}
