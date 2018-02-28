package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class IndexRequest {

    @ApiModelProperty(notes="similarity threshold")
    private Double threshold;

    public IndexRequest(Double threshold) {
        this.threshold = threshold;
    }

    public IndexRequest(){};

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
}
