package com.github.perscholas.mutability;

import java.util.Map;

/**
 * Created by leon on 8/6/2020.
 * This example was taken from the lecture slides on slide number 13.
 * `https://docs.google.com/presentation/d/e/2PACX-1vRpCRoxpjYk9eqLCI3p7P74A63NaO-dLAuKPasQYA9lhaHWSrw2NH6Qfpx7ZIaUXg/pub?start=false&loop=false&delayms=3000#slide=id.p13`
 * The objective of this class is to demonstrate how to create a class which enforces immutability and idempotent behavior
 * this class fails to enforce such properties by exposing a `final` mutable map
 */
public final class AllegedImmutableMessage implements ImmutableMessageInterface {
    private final String subject;
    private final String message;
    private final Map<String, String> mutableMap;

    public AllegedImmutableMessage(String subject, String message, Map<String, String> map) {
        this.subject = subject;
        this.message = message;
        this.mutableMap = map;
    }

    @Override
    public final Map<String, String> getHeader() {
        return mutableMap;
    }
}
