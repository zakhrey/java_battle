package ru.zakhrey.java_battle.main.array;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.Plot;
import ru.zakhrey.java_battle.metric.TimeMetricCollector;

import java.util.ArrayList;
import java.util.List;

import static ru.zakhrey.java_battle.drawer.PlotDrawer.buildPlot;
import static ru.zakhrey.java_battle.drawer.PlotDrawer.drawPlot;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildPlotSettings;
import static ru.zakhrey.java_battle.main.ListDrawUtils.buildTimeLineModel;

public class ArrayTimesPlotMain {

    public static void main(String[] args) {

        List<Double> xValues = NumpyUtils.linspace(10_000, 5_000_000, 100);

        TimeMetricCollector timeMetric = new TimeMetricCollector(new ArrayList<>(), xValues, 20);

        Plot timePlot = buildPlot(buildTimeLineModel(xValues, timeMetric.getTimes(), ""));
        drawPlot(timePlot, buildPlotSettings("ArrayList filling time plot"));
    }

}
