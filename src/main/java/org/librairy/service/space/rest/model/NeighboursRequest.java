package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighboursRequest {

    @ApiModelProperty(notes="reference point")
    private String id;

    @ApiModelProperty(notes="max number of related points")
    private Integer number;

    @ApiModelProperty(notes="filter points by this value")
    private String type;

    public NeighboursRequest(String id, Integer number, String type) {
        this.id = id;
        this.number = number;
        this.type = type;
    }

    public NeighboursRequest(){};

    public String getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
