package ru.zakhrey.java_battle.drawer;

import com.github.sh0nk.matplotlib4j.Plot;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import lombok.extern.slf4j.Slf4j;
import ru.zakhrey.java_battle.drawer.model.DrawModel;

import java.io.IOException;

@Slf4j
public class PlotDrawer {

    public static Plot buildPlot(DrawModel model) {
        Plot plt = Plot.create();
        plt.plot().add(model.getX(), model.getY(), model.getSign()).label("sin");
        plt.legend().loc(model.getLocation());
        plt.title(model.getTitle());
        return plt;
    }

    public static void drawPlot(Plot plt, String plotName) {
        try {
            plt.show();
            log.info("Plot {} is drawn", plotName);
        } catch (IOException | PythonExecutionException e) {
            log.info("Can not draw the plot. Cause: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
