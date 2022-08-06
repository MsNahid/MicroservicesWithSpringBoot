package com.nahidsohel.microservices.currencyexchangeservice;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;

    @GetMapping("/currency-exchange/{from}/USD/{to}/INR")
    public CurrencyExchange retrieveCurrencyExchange(@PathVariable String from, @PathVariable String to){

        String port = environment.getProperty("local.server.port");

        CurrencyExchange currencyExchange = new CurrencyExchange(100L, from, to, BigDecimal.valueOf(50), port);

        return currencyExchange;

    }
}
