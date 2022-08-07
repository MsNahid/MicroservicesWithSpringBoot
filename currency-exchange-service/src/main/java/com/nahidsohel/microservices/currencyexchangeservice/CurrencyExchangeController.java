package com.nahidsohel.microservices.currencyexchangeservice;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;

    private final CurrencyExchangeRepository currencyExchangeRepository;



    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveCurrencyExchange(@PathVariable String from, @PathVariable String to){

        String port = environment.getProperty("local.server.port");

//        CurrencyExchange currencyExchange = new CurrencyExchange(100L, from, to, BigDecimal.valueOf(50), port);

        CurrencyExchange currencyExchange  = currencyExchangeRepository.findByFromAndTo(from, to);

        if(currencyExchange == null){
            throw new RuntimeException("Unable to find currency exchange " + from + " to " + to + " .");
        }
        currencyExchange.setEnvironment(port);

        return currencyExchange;

    }


}
