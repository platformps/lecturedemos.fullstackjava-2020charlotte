package com.github.perscholas.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by leon on 9/2/2020.
 */
public interface LoggerInterface {
    default Logger getLogger() {
        return Logger.getLogger(getClass().getName());
    }

    default void log(Level level, String string, Object... args) {
        getLogger().log(level, String.format(string, args));
    }

    default void log(String message, Object... args) {
        log(getLogger().getLevel(), message, args);
    }

    default void info(String message, Object... args) {
        log(Level.INFO, message, args);
    }
}
