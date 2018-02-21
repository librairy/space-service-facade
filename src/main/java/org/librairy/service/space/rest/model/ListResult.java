package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ListResult {

    @ApiModelProperty(notes="list of points")
    private List<Point> points;

    public ListResult(List<Point> points) {
        this.points = points;
    }

    public ListResult(){};

    public List<Point> getPoints() {
        return points;
    }
}
