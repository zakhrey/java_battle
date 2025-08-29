package ru.zakhrey.java_battle.drawer.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DrawModel {

    private List<Double> x;
    private List<Double> y;

    private String sign;
    private String label;
    private String location;
    private String title;
}
