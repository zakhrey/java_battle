package ru.zakhrey.java_battle.drawer.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LineModel {

    private List<Double> x;
    private List<Double> y;

    private String sign;
    private String label;
}
