package ru.zakhrey.java_battle.main;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.Plot;
import ru.zakhrey.java_battle.metric.TimeMetricCollector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static ru.zakhrey.java_battle.drawer.PlotDrawer.*;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildPlotSettings;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildTimeLineModel;

public class DoubleListsPlotMain {

    static int dispersion = 20;

    public static void main(String[] args) {

        List<Double> xValues = NumpyUtils.linspace(10_000, 5_000_000, 100);

        TimeMetricCollector arrayTimes = new TimeMetricCollector(new ArrayList<>(), xValues, dispersion);

        Plot timePlot = buildPlot(
            buildTimeLineModel(
                xValues,
                arrayTimes.getTimes(),
                "ArrayList time"
            )
        );

        TimeMetricCollector linkedTimes = new TimeMetricCollector(new LinkedList<>(), xValues, dispersion);

        addToPlot(
            timePlot,
            buildTimeLineModel(
                xValues,
                linkedTimes.getTimes(),
                "LinkedList time"
            )
        );

        drawPlot(timePlot, buildPlotSettings("Time comparison plot"));
    }

}
