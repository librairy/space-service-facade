package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighboursResult {

    @ApiModelProperty(notes="related points")
    private List<Neighbour> neighbours;

    public NeighboursResult(List<Neighbour> neighbours) {
        this.neighbours = neighbours;
    }

    public NeighboursResult(){};

    public List<Neighbour> getNeighbours() {
        return neighbours;
    }
}
