package com.github.perscholas.dimensionalobjects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class Object3DTest {
    @Test
    public void testXAndY() {
        // given
        int expectedX = 10;
        int expectedY = 15;
        int expectedZ = 30;
        Object3D object3D = new Object3D(expectedX, expectedY, expectedZ);

        // when
        int actualX = object3D.getCoordinateX();
        int actualY = object3D.getCoordinateY();
        int actualZ = object3D.getCoordinateZ();

        // then
        Assert.assertEquals(expectedX, actualX);
        Assert.assertEquals(expectedY, actualY);
        Assert.assertEquals(expectedZ, actualZ);
    }
}
