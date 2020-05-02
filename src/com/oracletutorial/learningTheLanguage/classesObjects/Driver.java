package com.oracletutorial.learningTheLanguage.classesObjects;

import common.models.Bike;
import common.models.MountainBike;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        MountainBike b = new MountainBike();
        System.out.println(b);

        VarArgs va = new VarArgs();
        va.printNames("Murat", "Karaman", "Mehmet");
        System.out.println();
    }
}
