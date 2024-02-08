package ru.noname07.lab5.collection.data;

import ru.noname07.lab5.collection.Valid;

public class Coordinates implements Valid {
    private Double x;
    private Float y;

    public Coordinates(double x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return this.x;
    }

    public Float getY() {
        return this.y;
    }

    @Override
    public boolean isValid() {
        if (this.x == null || this.x == 0)
            return false;
        if (this.y == 0 || this.y > 715 || this.y == null)
            return false;

        return true;
    }

}