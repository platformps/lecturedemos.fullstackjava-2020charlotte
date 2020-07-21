package com.github.perscholas.calculations;

import java.util.*;

/**
 * Created by leon on 7/21/2020.
 * Agent Nouns (end in 'or' or 'er')
 */
public class Calculator {
    private final String ADD = "+";
    private final String SUBTRACT = "-";

    public Calculator() {
    }

    public void display(int operand1, int operand2, String operator, int sumOrDelta) {
        System.out.println(operand1 + operator + operand2 + "=" + sumOrDelta);
    }

    public void add(int operand1, int operand2) {
        int result = operand1+ operand2;
        display(operand1, operand2, ADD, result);
    }

    public void subtract(int operand1, int operand2) {
        int result = operand1 - operand2;
        display(operand1, operand2, SUBTRACT, result);
    }
}
