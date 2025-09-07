package ru.zakhrey.java_battle.metric;


import com.github.sh0nk.matplotlib4j.NumpyUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeMetricCollectorTest {

    @Test
    public void testTimeMetricCollector() {

        var elementsNumber = 100;
        List<Double> xValues = NumpyUtils.linspace(1_000, 10_000, elementsNumber);

        TimeMetricCollector timeMetric = new TimeMetricCollector(new ArrayList<>(), xValues, 20);

        assertEquals(elementsNumber, timeMetric.getTimes().size());
    }

}
