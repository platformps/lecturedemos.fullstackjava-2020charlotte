package com.github.perscholas.dimensionalobjects;

/**
 * Created by leon on 7/21/2020.
 */
public class Object3D extends Object2D {
    private int coordinateZ;

    public Object3D(int coordinateX, int coordinateY, int coordinateZ) {
        super(coordinateX, coordinateY);
        this.coordinateZ = coordinateZ;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(int coordinateZ) {
        this.coordinateZ = coordinateZ;
    }
}
