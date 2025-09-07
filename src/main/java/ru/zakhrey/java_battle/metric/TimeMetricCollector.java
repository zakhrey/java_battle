package ru.zakhrey.java_battle.metric;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static ru.zakhrey.java_battle.adder.ListAdder.addDoubleToList;

@Getter
public class TimeMetricCollector {

    // массив с данными
    private final List<Double> dataList;

    // массив с количеством элементов
    private final List<Double> countsList;

    // массив с временем обработки
    private List<Double> times;

    /**
     * Класс для измерения времени заполнения списка
     * @param dataList список данных с указанием реализации для заполнения
     * @param countsList список количества данных для вставки
     * @param dispersion дисперсия для замеров не одного конкретного заполнения, а среднего между несколькими вариантами
     */
    public TimeMetricCollector(List<Double> dataList,
                        List<Double> countsList,
                        int dispersion) {

        this.countsList = countsList;
        this.dataList = dataList;
        this.times = new ArrayList<>();

        long timeStart;
        long timeEnd;
        double finalTime;

        for (Double i : countsList) {

            finalTime = 0;
            timeStart = System.currentTimeMillis();
            for (int j = 0; j < dispersion; j++) {
                dataList.clear();
                addDoubleToList(dataList, i.intValue());
            }
            timeEnd = System.currentTimeMillis();
            finalTime += timeEnd - timeStart;

            times.add(finalTime  / dispersion);
        }

        System.gc();
    }

}
