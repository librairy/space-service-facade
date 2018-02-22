/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Neighbour extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Neighbour\",\"namespace\":\"org.librairy.service.space.facade.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"score\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String id;
   private java.lang.String name;
   private java.lang.String type;
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
  public Neighbour(java.lang.String id, java.lang.String name, java.lang.String type, java.lang.Double score) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.score = score;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    case 3: return score;
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
    case 3: score = (java.lang.Double)value$; break;
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

    private java.lang.String id;
    private java.lang.String name;
    private java.lang.String type;
    private double score;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.space.facade.model.Neighbour.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.space.facade.model.Neighbour.Builder other) {
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
      if (isValidValue(fields()[3], other.score)) {
        this.score = data().deepCopy(fields()[3].schema(), other.score);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Neighbour instance */
    private Builder(org.librairy.service.space.facade.model.Neighbour other) {
            super(org.librairy.service.space.facade.model.Neighbour.SCHEMA$);
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
      if (isValidValue(fields()[3], other.score)) {
        this.score = data().deepCopy(fields()[3].schema(), other.score);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setId(java.lang.String value) {
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
    public org.librairy.service.space.facade.model.Neighbour.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setName(java.lang.String value) {
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
    public org.librairy.service.space.facade.model.Neighbour.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.String getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setType(java.lang.String value) {
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
    public org.librairy.service.space.facade.model.Neighbour.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'score' field */
    public java.lang.Double getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder setScore(double value) {
      validate(fields()[3], value);
      this.score = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'score' field has been set */
    public boolean hasScore() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'score' field */
    public org.librairy.service.space.facade.model.Neighbour.Builder clearScore() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Neighbour build() {
      try {
        Neighbour record = new Neighbour();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        record.score = fieldSetFlags()[3] ? this.score : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
