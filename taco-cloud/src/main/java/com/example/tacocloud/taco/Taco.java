package com.example.tacocloud.taco;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Taco {

    private final String name;
    private final List<String> ingredients;

}
