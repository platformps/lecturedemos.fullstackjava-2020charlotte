package com.github.perscholas.mutability;

import java.util.Collections;
import java.util.Map;

/**
 * Created by James Covington on 8/6/2020.
 */
public final class ImmutableCovingtonMessage {
    private final String subject;
    private final String message;
    private final Map<String, String> header;

    public ImmutableCovingtonMessage(String subject, String message, Map<String, String> header) {
        this.subject = subject;
        this.message = message;
        this.header = Collections.unmodifiableMap(header);
    }

    public final Map<String, String> getHeader() {
        return header;
    }
}
