package ru.zakhrey.java_battle.adder;

import java.util.List;

public class ListAdder {

    public static void addDoubleToList(List<Double> targetList, Integer count) {
        double value = Math.random();

        for (int i = 0; i < count; i++) {
            targetList.add(value);
        }
    }

    public static void addRandomDoubleToList(List<Double> targetList, Integer count) {
        double value;

        for (int i = 0; i < count; i++) {
            value = Math.random();
            targetList.add(value);
        }
    }

}
