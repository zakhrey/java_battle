package ru.zakhrey.java_battle.main.sin;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.Plot;
import ru.zakhrey.java_battle.drawer.model.LineModel;
import ru.zakhrey.java_battle.drawer.model.PlotSettingsModel;

import java.util.List;
import java.util.stream.Collectors;

import static ru.zakhrey.java_battle.drawer.PlotDrawer.buildPlot;
import static ru.zakhrey.java_battle.drawer.PlotDrawer.drawPlot;

public class DrawSinPlotMain {

    public static void main(String[] args) {
        Plot plot = buildPlot(buildSinDrawModel());
        drawPlot(plot, buildPlotSettings());
    }

    private static LineModel buildSinDrawModel() {

        List<Double> x = NumpyUtils.linspace(-3, 3, 100);
        return LineModel.builder()
            .x(x)
            .y(x.stream().map(Math::sin).collect(Collectors.toList()))
            .sign("-")
            .label("sin")
            .build();
    }

    private static PlotSettingsModel buildPlotSettings() {

        return PlotSettingsModel.builder()
            .legendLocation("upper left")
            .title("Simple demonstration plot")
            .xLabel("x argument")
            .yLabel("y, sin function")
            .build();
    }

}
