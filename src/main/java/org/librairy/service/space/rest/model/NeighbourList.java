package org.librairy.service.space.rest.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighbourList {

    @ApiModelProperty(notes="related points")
    private List<Neighbour> neighbours;

    public NeighbourList(List<Neighbour> neighbours) {
        this.neighbours = neighbours;
    }

    public NeighbourList(){};

    public List<Neighbour> getNeighbours() {
        return neighbours;
    }
}
