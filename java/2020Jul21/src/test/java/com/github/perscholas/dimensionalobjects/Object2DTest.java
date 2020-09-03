package com.github.perscholas.dimensionalobjects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class Object2DTest {
    @Test
    public void testXAndY() {
        // given
        int expectedX = 10;
        int expectedY = 15;
        Object2D object2D = new Object2D(expectedX, expectedY);

        // when
        int actualX = object2D.getCoordinateX();
        int actualY = object2D.getCoordinateY();

        // then
        Assert.assertEquals(expectedX, actualX);
        Assert.assertEquals(expectedY, actualY);
    }
}
