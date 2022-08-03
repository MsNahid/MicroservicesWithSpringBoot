package com.nahidsohel.microservices.limitservices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Limits {

    Integer maximum;

    Integer minimum;
}
