package com.github.perscholas.generics;

import java.io.Serializable;

public interface Repository<
        SomeIdType extends Serializable,
        SomeEntityType extends Entity<SomeIdType>> {

    void doThings();

    default void doThingsByDefault() {

    }

    static void doThis() {

    }
}
