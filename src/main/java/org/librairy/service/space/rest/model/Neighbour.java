package org.librairy.service.space.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neighbour extends org.librairy.service.space.facade.model.Neighbour {

    public Neighbour(org.librairy.service.space.facade.model.Neighbour neighbour){
        try {
            BeanUtils.copyProperties(this,neighbour);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Neighbour() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "unique identifier")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "label")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "point class")
    public String getType() {
        return super.getType();
    }

    @Override
    @ApiModelProperty(value = "level of relation")
    public Double getScore() {
        return super.getScore();
    }



}
