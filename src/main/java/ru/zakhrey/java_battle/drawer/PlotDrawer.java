package ru.zakhrey.java_battle.drawer;

import com.github.sh0nk.matplotlib4j.Plot;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import lombok.extern.slf4j.Slf4j;
import ru.zakhrey.java_battle.drawer.model.LineModel;
import ru.zakhrey.java_battle.drawer.model.PlotSettingsModel;

import java.io.IOException;

@Slf4j
public class PlotDrawer {

    public static Plot buildPlot(LineModel model) {
        Plot plt = Plot.create();
        plt.plot().add(model.getX(), model.getY(), model.getSign()).label(model.getLabel());
        return plt;
    }

    public static void addToPlot(Plot plt, LineModel model) {

        plt.plot().add(model.getX(), model.getY(), model.getSign()).label(model.getLabel());
    }

    public static void drawPlot(Plot plt, PlotSettingsModel settings) {
        try {
            plt.legend().loc(settings.getLegendLocation());
            plt.xlabel(settings.getXLabel());
            plt.ylabel(settings.getYLabel());
            plt.title(settings.getTitle());
            plt.show();
            log.info("Plot {} is drawn", settings.getTitle());
        } catch (IOException | PythonExecutionException e) {
            log.info("Can not draw the plot. Cause: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
