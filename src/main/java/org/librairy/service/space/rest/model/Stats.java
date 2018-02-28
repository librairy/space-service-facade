package org.librairy.service.space.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stats extends org.librairy.service.space.facade.model.Stats {

    public Stats(org.librairy.service.space.facade.model.Stats stats){
        try {
            BeanUtils.copyProperties(this,stats);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Stats() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "total number of clusters")
    public Long getTotal() {
        return super.getTotal();
    }

    @Override
    @ApiModelProperty(value = "min number of points per cluster")
    public Long getMin() {
        return super.getMin();
    }

    @Override
    @ApiModelProperty(value = "max number of points per cluster")
    public Long getMax() {
        return super.getMax();
    }

    @Override
    @ApiModelProperty(value = "standard deviation of points per cluster")
    public Double getDev() {
        return super.getDev();
    }

    @Override
    @ApiModelProperty(value = "mean of points per cluster")
    public Double getMean() {
        return super.getMean();
    }

    @Override
    @ApiModelProperty(value = "median of points per cluster")
    public Double getMedian() {
        return super.getMedian();
    }

    @Override
    @ApiModelProperty(value = "mode of points per cluster")
    public Double getMode() {
        return super.getMode();
    }

}
