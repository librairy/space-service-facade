package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ComparisonRequest {

    @ApiModelProperty(notes="vector")
    private List<Double> shape1;

    @ApiModelProperty(notes="vector")
    private List<Double> shape2;

    public ComparisonRequest(List<Double> shape1, List<Double> shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }

    public ComparisonRequest(){};

    public List<Double> getShape1() {
        return shape1;
    }

    public List<Double> getShape2() {
        return shape2;
    }

    public void setShape1(List<Double> shape1) {
        this.shape1 = shape1;
    }

    public void setShape2(List<Double> shape2) {
        this.shape2 = shape2;
    }
}
