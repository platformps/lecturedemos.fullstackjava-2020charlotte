package com.github.perscholas.mutability;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Leon on 8/6/2020.
 * This example was suggested by James Covington
 * The objective of this class is to demonstrate how to create a class which enforces immutability and idempotent behavior
 * this class enforces such properties by exposing only immutable objects; `String`, and `.unmodifableMap` types
 */
public final class CovingtonImmutableMessage implements ImmutableMessageInterface {
    private final String subject;
    private final String message;
    private final Map<String, String> header;

    public CovingtonImmutableMessage(String subject, String message, Map<String, String> header) {
        this.subject = subject;
        this.message = message;
        this.header = Collections.unmodifiableMap(header); // we ensure map is immutable here
    }

    @Override
    public final Map<String, String> getHeader() {
        return header;
    }
}
