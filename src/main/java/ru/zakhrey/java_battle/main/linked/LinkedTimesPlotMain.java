package ru.zakhrey.java_battle.main.linked;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.Plot;
import ru.zakhrey.java_battle.metric.TimeMetricCollector;

import java.util.LinkedList;
import java.util.List;

import static ru.zakhrey.java_battle.drawer.PlotDrawer.buildPlot;
import static ru.zakhrey.java_battle.drawer.PlotDrawer.drawPlot;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildPlotSettings;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildTimeLineModel;

public class LinkedTimesPlotMain {


    public static void main(String[] args) {

        List<Double> xValues = NumpyUtils.linspace(10_000, 5_000_000, 100);

        TimeMetricCollector timeMetric = new TimeMetricCollector(new LinkedList<>(), xValues, 20);

        Plot timePlot = buildPlot(buildTimeLineModel(xValues, timeMetric.getTimes(), ""));
        drawPlot(timePlot, buildPlotSettings("LinkedList filling time plot"));
    }


}
