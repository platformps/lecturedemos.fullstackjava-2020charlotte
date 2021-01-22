package com.github.perscholas.calculations;

/**
 * Created by leon on 7/21/2020.
 */
public class Multiplier extends Calculator {
    private final String MULTIPLY = "*";
    private final String DIVIDE = "÷";

    public Multiplier() {
    }

    @Override
    public void add(int operand1, int operand2) {
        System.out.println("Hey I am adding the values!");
        super.add(operand1, operand2);
        System.out.println("I have completed my calculation!");
    }

    public void multiply(int operand1, int operand2) {
        int product = operand1 * operand2;
        display(operand1, operand2, MULTIPLY, product);
    }

    public void divide(int operand1, int operand2) {
        int product = operand1 / operand2;
        display(operand1, operand2, DIVIDE, product);
    }
}
