package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighboursRequest {

    @ApiModelProperty(notes="reference point")
    private String id;

    @ApiModelProperty(notes="max number of related points")
    private Integer number;

    @ApiModelProperty(notes="filter points by this value")
    private List<String> types;

    public NeighboursRequest(String id, Integer number, List<String> types) {
        this.id = id;
        this.number = number;
        this.types = types;
    }

    public NeighboursRequest(){};

    public String getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public List<String> getTypes() {
        return types;
    }
}
