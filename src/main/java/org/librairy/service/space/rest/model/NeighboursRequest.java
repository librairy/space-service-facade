package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighboursRequest {

    @ApiModelProperty(notes="max number of related points")
    private Integer number;

    @ApiModelProperty(notes="filter points by this value")
    private List<String> types;

    @ApiModelProperty(notes="compare to all points")
    private Boolean force;

    public NeighboursRequest(Integer number, List<String> types, Boolean force) {
        this.number = number;
        this.types = types;
        this.force = force;
    }

    public NeighboursRequest(){};

    public Integer getNumber() {
        return number;
    }

    public List<String> getTypes() {
        return types;
    }

    public Boolean getForce() {
        return force;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }
}


