/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Point extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Point\",\"namespace\":\"org.librairy.service.space.facade.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"unknown\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"document\"},{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String id;
   private java.lang.String name;
   private java.lang.String type;
   private java.util.List<java.lang.Double> shape;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Point() {}

  /**
   * All-args constructor.
   */
  public Point(java.lang.String id, java.lang.String name, java.lang.String type, java.util.List<java.lang.Double> shape) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.shape = shape;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    case 3: return shape;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: type = (java.lang.String)value$; break;
    case 3: shape = (java.util.List<java.lang.Double>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'shape' field.
   */
  public java.util.List<java.lang.Double> getShape() {
    return shape;
  }

  /**
   * Sets the value of the 'shape' field.
   * @param value the value to set.
   */
  public void setShape(java.util.List<java.lang.Double> value) {
    this.shape = value;
  }

  /** Creates a new Point RecordBuilder */
  public static org.librairy.service.space.facade.model.Point.Builder newBuilder() {
    return new org.librairy.service.space.facade.model.Point.Builder();
  }
  
  /** Creates a new Point RecordBuilder by copying an existing Builder */
  public static org.librairy.service.space.facade.model.Point.Builder newBuilder(org.librairy.service.space.facade.model.Point.Builder other) {
    return new org.librairy.service.space.facade.model.Point.Builder(other);
  }
  
  /** Creates a new Point RecordBuilder by copying an existing Point instance */
  public static org.librairy.service.space.facade.model.Point.Builder newBuilder(org.librairy.service.space.facade.model.Point other) {
    return new org.librairy.service.space.facade.model.Point.Builder(other);
  }
  
  /**
   * RecordBuilder for Point instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Point>
    implements org.apache.avro.data.RecordBuilder<Point> {

    private java.lang.String id;
    private java.lang.String name;
    private java.lang.String type;
    private java.util.List<java.lang.Double> shape;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.space.facade.model.Point.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.space.facade.model.Point.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.shape)) {
        this.shape = data().deepCopy(fields()[3].schema(), other.shape);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Point instance */
    private Builder(org.librairy.service.space.facade.model.Point other) {
            super(org.librairy.service.space.facade.model.Point.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.shape)) {
        this.shape = data().deepCopy(fields()[3].schema(), other.shape);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.librairy.service.space.facade.model.Point.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.librairy.service.space.facade.model.Point.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.librairy.service.space.facade.model.Point.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.librairy.service.space.facade.model.Point.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.String getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.librairy.service.space.facade.model.Point.Builder setType(java.lang.String value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public org.librairy.service.space.facade.model.Point.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'shape' field */
    public java.util.List<java.lang.Double> getShape() {
      return shape;
    }
    
    /** Sets the value of the 'shape' field */
    public org.librairy.service.space.facade.model.Point.Builder setShape(java.util.List<java.lang.Double> value) {
      validate(fields()[3], value);
      this.shape = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'shape' field has been set */
    public boolean hasShape() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'shape' field */
    public org.librairy.service.space.facade.model.Point.Builder clearShape() {
      shape = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Point build() {
      try {
        Point record = new Point();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        record.shape = fieldSetFlags()[3] ? this.shape : (java.util.List<java.lang.Double>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
