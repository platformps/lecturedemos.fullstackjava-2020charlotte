package com.github.perscholas;

/**
 * Created by leon on 8/31/2020.
 */
public interface Jsonable {
    default String toJson() {
        return Jsonifier.toJson(this);
    }
}
