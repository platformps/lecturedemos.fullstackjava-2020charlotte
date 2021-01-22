package com.github.perscholas;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by leon on 8/31/2020.
 */
public class Jsonifier {
    public static String toJson(Object objectToBeConvertedToJson) {
        try {
            return new ObjectMapper().writeValueAsString(objectToBeConvertedToJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
