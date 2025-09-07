package ru.zakhrey.java_battle.main;

import ru.zakhrey.java_battle.drawer.model.LineModel;
import ru.zakhrey.java_battle.drawer.model.PlotSettingsModel;

import java.util.List;

public class ListDrawUtils {

    public static LineModel buildTimeLineModel(List<Double> count, List<Double> times, final String label) {

        return LineModel.builder()
                .x(count)
                .y(times)
                .sign("-")
                .label(label)
                .build();
    }
    public static PlotSettingsModel buildPlotSettings(final String title) {

        return PlotSettingsModel.builder()
                .legendLocation("upper left")
                .title(title)
                .xLabel("Number of elements")
                .yLabel("Filling time, ms")
                .build();
    }
}
