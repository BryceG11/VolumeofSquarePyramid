package com.company;

public class MyEquation {
    Double base;
    Double height;


    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double Equation() {
        return (((base * base) * height) /3);
    }
}
