package ru.zakhrey.java_battle;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.Plot;
import ru.zakhrey.java_battle.drawer.model.DrawModel;

import java.util.List;
import java.util.stream.Collectors;

import static ru.zakhrey.java_battle.drawer.PlotDrawer.buildPlot;
import static ru.zakhrey.java_battle.drawer.PlotDrawer.drawPlot;

public class JavaBattleSimpleMain {

    public static void main(String[] args) {
        Plot plot = buildPlot(buildSinDrawModel());
        drawPlot(plot, "Simple demonstration plot");
    }

    private static DrawModel buildSinDrawModel() {
        List<Double> x = NumpyUtils.linspace(-3, 3, 100);
        return DrawModel.builder()
            .x(x)
            .y(x.stream().map(Math::sin).collect(Collectors.toList()))
            .sign("-")
            .label("sin")
            .location("upper left")
            .title("Simple demonstration plot")
            .build();
    }

}
