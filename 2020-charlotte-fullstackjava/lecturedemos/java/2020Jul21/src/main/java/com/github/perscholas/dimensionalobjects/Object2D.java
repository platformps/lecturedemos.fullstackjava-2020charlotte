package com.github.perscholas.dimensionalobjects;

/**
 * Created by leon on 7/21/2020.
 */
public class Object2D {
    private int coordinateX;
    private int coordinateY;

    public Object2D(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
