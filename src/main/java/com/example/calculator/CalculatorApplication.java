package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Calculator{
    int a;
    int b;

    public int sum(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }
}

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum1 = calculator.sum(4, 6);
        System.out.println(sum1);
    }
}
