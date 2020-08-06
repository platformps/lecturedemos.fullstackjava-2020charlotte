package com.github.perscholas.mutability;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 8/6/2020.
 */
public final class MutableMessage {
    private final String subject;
    private final String message;
    private final Map<String, String> header;

    public MutableMessage(String subject, String message, Map<String, String> header) {
        this.subject = subject;
        this.message = message;
        this.header = header;
    }

    public final Map<String, String> getHeader() {
        return header;
    }
}
