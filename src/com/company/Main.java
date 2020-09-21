package com.company;

public class Main {

    public static void main(String[] args) {
     SetPyramid pyramid = new SetPyramid();
     pyramid.getBase();
     pyramid.getHeight();
     MyEquation Equation = new MyEquation();
     Equation.setBase(15.0);
     Equation.setHeight(26.0);
     System.out.println(Equation.Equation());


    }
}
