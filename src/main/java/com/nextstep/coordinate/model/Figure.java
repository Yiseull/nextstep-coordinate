package com.nextstep.coordinate.model;

import java.util.List;

public interface Figure {

    List<Point> getPoints();

    double getArea();

    String getAreaInfo();
}
