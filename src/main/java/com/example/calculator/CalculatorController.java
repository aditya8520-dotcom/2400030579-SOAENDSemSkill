package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        int result = a + b;

        return "Result: " + result;
    }
}