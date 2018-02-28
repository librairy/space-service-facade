/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Summary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Summary\",\"namespace\":\"org.librairy.service.space.facade.model\",\"fields\":[{\"name\":\"threshold\",\"type\":\"double\",\"default\":0.0},{\"name\":\"points\",\"type\":\"long\",\"default\":0},{\"name\":\"indexes\",\"type\":\"long\",\"default\":0},{\"name\":\"dimensions\",\"type\":\"int\",\"default\":0},{\"name\":\"edges\",\"type\":\"long\",\"default\":0},{\"name\":\"types\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"long\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clusters\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Stats\",\"fields\":[{\"name\":\"total\",\"type\":\"long\",\"default\":0},{\"name\":\"min\",\"type\":\"long\",\"default\":0},{\"name\":\"max\",\"type\":\"long\",\"default\":0},{\"name\":\"mean\",\"type\":\"double\",\"default\":0.0},{\"name\":\"median\",\"type\":\"double\",\"default\":0.0},{\"name\":\"mode\",\"type\":\"double\",\"default\":0.0},{\"name\":\"var\",\"type\":\"double\",\"default\":0.0},{\"name\":\"dev\",\"type\":\"double\",\"default\":0.0}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private double threshold;
   private long points;
   private long indexes;
   private int dimensions;
   private long edges;
   private java.util.Map<java.lang.String,java.lang.Long> types;
   private org.librairy.service.space.facade.model.Stats clusters;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Summary() {}

  /**
   * All-args constructor.
   */
  public Summary(java.lang.Double threshold, java.lang.Long points, java.lang.Long indexes, java.lang.Integer dimensions, java.lang.Long edges, java.util.Map<java.lang.String,java.lang.Long> types, org.librairy.service.space.facade.model.Stats clusters) {
    this.threshold = threshold;
    this.points = points;
    this.indexes = indexes;
    this.dimensions = dimensions;
    this.edges = edges;
    this.types = types;
    this.clusters = clusters;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return threshold;
    case 1: return points;
    case 2: return indexes;
    case 3: return dimensions;
    case 4: return edges;
    case 5: return types;
    case 6: return clusters;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: threshold = (java.lang.Double)value$; break;
    case 1: points = (java.lang.Long)value$; break;
    case 2: indexes = (java.lang.Long)value$; break;
    case 3: dimensions = (java.lang.Integer)value$; break;
    case 4: edges = (java.lang.Long)value$; break;
    case 5: types = (java.util.Map<java.lang.String,java.lang.Long>)value$; break;
    case 6: clusters = (org.librairy.service.space.facade.model.Stats)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'threshold' field.
   */
  public java.lang.Double getThreshold() {
    return threshold;
  }

  /**
   * Sets the value of the 'threshold' field.
   * @param value the value to set.
   */
  public void setThreshold(java.lang.Double value) {
    this.threshold = value;
  }

  /**
   * Gets the value of the 'points' field.
   */
  public java.lang.Long getPoints() {
    return points;
  }

  /**
   * Sets the value of the 'points' field.
   * @param value the value to set.
   */
  public void setPoints(java.lang.Long value) {
    this.points = value;
  }

  /**
   * Gets the value of the 'indexes' field.
   */
  public java.lang.Long getIndexes() {
    return indexes;
  }

  /**
   * Sets the value of the 'indexes' field.
   * @param value the value to set.
   */
  public void setIndexes(java.lang.Long value) {
    this.indexes = value;
  }

  /**
   * Gets the value of the 'dimensions' field.
   */
  public java.lang.Integer getDimensions() {
    return dimensions;
  }

  /**
   * Sets the value of the 'dimensions' field.
   * @param value the value to set.
   */
  public void setDimensions(java.lang.Integer value) {
    this.dimensions = value;
  }

  /**
   * Gets the value of the 'edges' field.
   */
  public java.lang.Long getEdges() {
    return edges;
  }

  /**
   * Sets the value of the 'edges' field.
   * @param value the value to set.
   */
  public void setEdges(java.lang.Long value) {
    this.edges = value;
  }

  /**
   * Gets the value of the 'types' field.
   */
  public java.util.Map<java.lang.String,java.lang.Long> getTypes() {
    return types;
  }

  /**
   * Sets the value of the 'types' field.
   * @param value the value to set.
   */
  public void setTypes(java.util.Map<java.lang.String,java.lang.Long> value) {
    this.types = value;
  }

  /**
   * Gets the value of the 'clusters' field.
   */
  public org.librairy.service.space.facade.model.Stats getClusters() {
    return clusters;
  }

  /**
   * Sets the value of the 'clusters' field.
   * @param value the value to set.
   */
  public void setClusters(org.librairy.service.space.facade.model.Stats value) {
    this.clusters = value;
  }

  /** Creates a new Summary RecordBuilder */
  public static org.librairy.service.space.facade.model.Summary.Builder newBuilder() {
    return new org.librairy.service.space.facade.model.Summary.Builder();
  }
  
  /** Creates a new Summary RecordBuilder by copying an existing Builder */
  public static org.librairy.service.space.facade.model.Summary.Builder newBuilder(org.librairy.service.space.facade.model.Summary.Builder other) {
    return new org.librairy.service.space.facade.model.Summary.Builder(other);
  }
  
  /** Creates a new Summary RecordBuilder by copying an existing Summary instance */
  public static org.librairy.service.space.facade.model.Summary.Builder newBuilder(org.librairy.service.space.facade.model.Summary other) {
    return new org.librairy.service.space.facade.model.Summary.Builder(other);
  }
  
  /**
   * RecordBuilder for Summary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Summary>
    implements org.apache.avro.data.RecordBuilder<Summary> {

    private double threshold;
    private long points;
    private long indexes;
    private int dimensions;
    private long edges;
    private java.util.Map<java.lang.String,java.lang.Long> types;
    private org.librairy.service.space.facade.model.Stats clusters;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.space.facade.model.Summary.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.space.facade.model.Summary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.points)) {
        this.points = data().deepCopy(fields()[1].schema(), other.points);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.indexes)) {
        this.indexes = data().deepCopy(fields()[2].schema(), other.indexes);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dimensions)) {
        this.dimensions = data().deepCopy(fields()[3].schema(), other.dimensions);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.edges)) {
        this.edges = data().deepCopy(fields()[4].schema(), other.edges);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.types)) {
        this.types = data().deepCopy(fields()[5].schema(), other.types);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.clusters)) {
        this.clusters = data().deepCopy(fields()[6].schema(), other.clusters);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Summary instance */
    private Builder(org.librairy.service.space.facade.model.Summary other) {
            super(org.librairy.service.space.facade.model.Summary.SCHEMA$);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.points)) {
        this.points = data().deepCopy(fields()[1].schema(), other.points);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.indexes)) {
        this.indexes = data().deepCopy(fields()[2].schema(), other.indexes);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dimensions)) {
        this.dimensions = data().deepCopy(fields()[3].schema(), other.dimensions);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.edges)) {
        this.edges = data().deepCopy(fields()[4].schema(), other.edges);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.types)) {
        this.types = data().deepCopy(fields()[5].schema(), other.types);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.clusters)) {
        this.clusters = data().deepCopy(fields()[6].schema(), other.clusters);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'threshold' field */
    public java.lang.Double getThreshold() {
      return threshold;
    }
    
    /** Sets the value of the 'threshold' field */
    public org.librairy.service.space.facade.model.Summary.Builder setThreshold(double value) {
      validate(fields()[0], value);
      this.threshold = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'threshold' field has been set */
    public boolean hasThreshold() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'threshold' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearThreshold() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'points' field */
    public java.lang.Long getPoints() {
      return points;
    }
    
    /** Sets the value of the 'points' field */
    public org.librairy.service.space.facade.model.Summary.Builder setPoints(long value) {
      validate(fields()[1], value);
      this.points = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'points' field has been set */
    public boolean hasPoints() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'points' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearPoints() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'indexes' field */
    public java.lang.Long getIndexes() {
      return indexes;
    }
    
    /** Sets the value of the 'indexes' field */
    public org.librairy.service.space.facade.model.Summary.Builder setIndexes(long value) {
      validate(fields()[2], value);
      this.indexes = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'indexes' field has been set */
    public boolean hasIndexes() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'indexes' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearIndexes() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'dimensions' field */
    public java.lang.Integer getDimensions() {
      return dimensions;
    }
    
    /** Sets the value of the 'dimensions' field */
    public org.librairy.service.space.facade.model.Summary.Builder setDimensions(int value) {
      validate(fields()[3], value);
      this.dimensions = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'dimensions' field has been set */
    public boolean hasDimensions() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'dimensions' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearDimensions() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'edges' field */
    public java.lang.Long getEdges() {
      return edges;
    }
    
    /** Sets the value of the 'edges' field */
    public org.librairy.service.space.facade.model.Summary.Builder setEdges(long value) {
      validate(fields()[4], value);
      this.edges = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'edges' field has been set */
    public boolean hasEdges() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'edges' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearEdges() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'types' field */
    public java.util.Map<java.lang.String,java.lang.Long> getTypes() {
      return types;
    }
    
    /** Sets the value of the 'types' field */
    public org.librairy.service.space.facade.model.Summary.Builder setTypes(java.util.Map<java.lang.String,java.lang.Long> value) {
      validate(fields()[5], value);
      this.types = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'types' field has been set */
    public boolean hasTypes() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'types' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearTypes() {
      types = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'clusters' field */
    public org.librairy.service.space.facade.model.Stats getClusters() {
      return clusters;
    }
    
    /** Sets the value of the 'clusters' field */
    public org.librairy.service.space.facade.model.Summary.Builder setClusters(org.librairy.service.space.facade.model.Stats value) {
      validate(fields()[6], value);
      this.clusters = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'clusters' field has been set */
    public boolean hasClusters() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'clusters' field */
    public org.librairy.service.space.facade.model.Summary.Builder clearClusters() {
      clusters = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Summary build() {
      try {
        Summary record = new Summary();
        record.threshold = fieldSetFlags()[0] ? this.threshold : (java.lang.Double) defaultValue(fields()[0]);
        record.points = fieldSetFlags()[1] ? this.points : (java.lang.Long) defaultValue(fields()[1]);
        record.indexes = fieldSetFlags()[2] ? this.indexes : (java.lang.Long) defaultValue(fields()[2]);
        record.dimensions = fieldSetFlags()[3] ? this.dimensions : (java.lang.Integer) defaultValue(fields()[3]);
        record.edges = fieldSetFlags()[4] ? this.edges : (java.lang.Long) defaultValue(fields()[4]);
        record.types = fieldSetFlags()[5] ? this.types : (java.util.Map<java.lang.String,java.lang.Long>) defaultValue(fields()[5]);
        record.clusters = fieldSetFlags()[6] ? this.clusters : (org.librairy.service.space.facade.model.Stats) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}