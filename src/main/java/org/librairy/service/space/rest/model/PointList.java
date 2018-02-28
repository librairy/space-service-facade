package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class PointList {

    @ApiModelProperty(notes="list of points")
    private List<Point> points;

    @ApiModelProperty(notes="reference to next page")
    private String nextPage;

    public PointList(String nextPage, List<Point> points) {
        this.nextPage   = nextPage;
        this.points     = points;
    }

    public PointList(){};

    public List<Point> getPoints() {
        return points;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
}
