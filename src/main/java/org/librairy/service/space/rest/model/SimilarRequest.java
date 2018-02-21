package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class SimilarRequest {

    @ApiModelProperty(notes="reference vector")
    private List<Double> shape;

    @ApiModelProperty(notes="max number of related points")
    private Integer number;

    @ApiModelProperty(notes="filter points by this value")
    private String type;

    public SimilarRequest(List<Double> shape, Integer number, String type) {
        this.shape = shape;
        this.number = number;
        this.type = type;
    }

    public SimilarRequest(){};

    public List<Double> getShape() {
        return shape;
    }

    public Integer getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
