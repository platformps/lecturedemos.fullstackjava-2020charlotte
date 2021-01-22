package com.github.perscholas.mutability;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 8/6/2020.
 * The objective of this class is to demonstrate how to create a class which enforces immutability and idempotent behavior
 * this class is a prototype design-pattern standard for enforcing such properties by exposing only a clone of mutable object, rather than the reference literal
 */
public final class PrototypicalImmutableMessage implements ImmutableMessageInterface {
    private final String subject;
    private final String message;
    private final Map<String, String> header;

    public PrototypicalImmutableMessage(String subject, String message, Map<String, String> header) {
        this.subject = subject;
        this.message = message;
        this.header = header;
    }

    @Override
    public final Map<String, String> getHeader() {
        return new HashMap<>(header); // enforcement of prototype design pattern; https://www.geeksforgeeks.org/prototype-design-pattern/
    }
}
