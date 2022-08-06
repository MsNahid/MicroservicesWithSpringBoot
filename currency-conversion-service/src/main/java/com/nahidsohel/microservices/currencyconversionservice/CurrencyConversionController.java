package com.nahidsohel.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/")
    public String testController(){
        return "hello";
    }

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion currencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        return new CurrencyConversion(1000L, from, to, BigDecimal.ONE, quantity, BigDecimal.ONE, "");

    }
}
