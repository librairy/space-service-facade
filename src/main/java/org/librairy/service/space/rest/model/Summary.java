package org.librairy.service.space.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.space.facade.model.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Summary extends org.librairy.service.space.facade.model.Summary {

    public Summary(org.librairy.service.space.facade.model.Summary summary){
        try {
            BeanUtils.copyProperties(this,summary);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Summary() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "total number of points")
    public Long getPoints() {
        return super.getPoints();
    }

    @Override
    @ApiModelProperty(value = "total number of indexed points")
    public Long getIndexes() {
        return super.getIndexes();
    }

    @Override
    @ApiModelProperty(value = "vector dimensions")
    public Integer getDimensions() {
        return super.getDimensions();
    }

    @Override
    @ApiModelProperty(value = "total number of edges")
    public Long getEdges() {
        return super.getEdges();
    }

    @Override
    @ApiModelProperty(value = "threshold used in indexing process")
    public Double getThreshold() {
        return super.getThreshold();
    }

    @Override
    @ApiModelProperty(value="number of points by type")
    public Map<String,Long> getTypes() {
        return super.getTypes();
    }


    @Override
    @ApiModelProperty(value="cluster statistics")
    public Stats getClusters() {
        return new org.librairy.service.space.rest.model.Stats(super.getClusters());
    }
}
