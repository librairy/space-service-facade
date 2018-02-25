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
    private List<String> types;

    public SimilarRequest(List<Double> shape, Integer number, List<String> types) {
        this.shape = shape;
        this.number = number;
        this.types = types;
    }

    public SimilarRequest(){};

    public List<Double> getShape() {
        return shape;
    }

    public Integer getNumber() {
        return number;
    }

    public List<String> getTypes() {
        return types;
    }
}
