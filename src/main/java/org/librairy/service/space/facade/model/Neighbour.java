/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Neighbour extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Neighbour\",\"namespace\":\"org.librairy.service.space.facade.model\",\"fields\":[{\"name\":\"point\",\"type\":{\"type\":\"record\",\"name\":\"Point\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]}},{\"name\":\"score\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.librairy.service.space.facade.model.Point point;
   private double score;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Neighbour() {}

  /**
   * All-args constructor.
   */
  public Neighbour(org.librairy.service.space.facade.model.Point point, java.lang.Double score) {
    this.point = point;
    this.score = score;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return point;
    case 1: return score;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: point = (org.librairy.service.space.facade.model.Point)value$; break;
    case 1: score = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'point' field.
   */
  public org.librairy.service.space.facade.model.Point getPoint() {
    return point;
  }

  /**
   * Sets the value of the 'point' field.
   * @param value the value to set.
   */
  public void setPoint(org.librairy.service.space.facade.model.Point value) {
    this.point = value;
  }

  /**
   * Gets the value of the 'score' field.
   */
  public java.lang.Double getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * @param value the value to set.
   */
  public void setScore(java.lang.Double value) {
    this.score = value;
  }

  /** Creates a new Neighbour RecordBuilder */
  public static org.librairy.service.space.facade.model.Neighbour.Builder newBuilder() {
    return new org.librairy.service.space.facade.model.Neighbour.Builder();
  }
  
  /** Creates a new Neighbour RecordBuilder by copying an existing Builder */
  public static org.librairy.service.space.facade.model.Neighbour.Builder newBuilder(org.librairy.service.space.facade.model.Neighbour.Builder other) {
    return new org.librairy.service.space.facade.model.Neighbour.Builder(other);
  }
  
  /** Creates a new Neighbour RecordBuilder by copying an existing Neighbour instance */
  public static org.librairy.service.space.facade.model.Neighbour.Builder newBuilder(org.librairy.service.space.facade.model.Neighbour other) {
    return new org.librairy.service.space.facade.model.Neighbour.Builder(other);
  }
  
  /**
   * RecordBuilder for Neighbour instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Neighbour>
    implements org.apache.avro.data.RecordBuilder<Neighbour> {

    private org.librairy.service.space.facade.model.Point point;
    private double score;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.space.facade.model.Neighbour.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.space.facade.model.Neighbour.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.point)) {
        this.point = data().deepCopy(fields()[0].schema(), other.point);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Neighbour instance */
    private Builder(org.librairy.service.space.facade.model.Neighbour other) {
            super(org.librairy.service.space.facade.model.Neighbour.SCHEMA$);
      if (isValidValue(fields()[0], other.point)) {
        this.point = data().deepCopy(fields()[0].schema(), other.point);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'point' field */
    public org.librairy.service.space.facade.model.Point getPoint() {
      return point;
    }
    
    /** Sets the value of the 'point' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setPoint(org.librairy.service.space.facade.model.Point value) {
      validate(fields()[0], value);
      this.point = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'point' field has been set */
    public boolean hasPoint() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'point' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder clearPoint() {
      point = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'score' field */
    public java.lang.Double getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setScore(double value) {
      validate(fields()[1], value);
      this.score = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'score' field has been set */
    public boolean hasScore() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'score' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder clearScore() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Neighbour build() {
      try {
        Neighbour record = new Neighbour();
        record.point = fieldSetFlags()[0] ? this.point : (org.librairy.service.space.facade.model.Point) defaultValue(fields()[0]);
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
