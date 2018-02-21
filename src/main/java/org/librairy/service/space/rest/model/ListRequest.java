package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ListRequest {

    @ApiModelProperty(notes="number of points")
    private Integer size;

    @ApiModelProperty(notes="id of the first point (not included)")
    private String offset;

    public ListRequest(Integer size, String offset) {
        this.size = size;
        this.offset = offset;
    }

    public ListRequest(){};


    public Integer getSize() {
        return size;
    }

    public String getOffset() {
        return offset;
    }
}
