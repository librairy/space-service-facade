/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface SpaceService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SpaceService\",\"namespace\":\"org.librairy.service.space.facade.model\",\"types\":[{\"type\":\"record\",\"name\":\"Point\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},{\"type\":\"record\",\"name\":\"Neighbour\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"score\",\"type\":\"double\"}]}],\"messages\":{\"add\":{\"request\":[{\"name\":\"point\",\"type\":\"Point\"}],\"response\":\"boolean\"},\"get\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"Point\"},\"remove\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"boolean\"},\"removeAll\":{\"request\":[],\"response\":\"boolean\"},\"list\":{\"request\":[{\"name\":\"size\",\"type\":\"int\"},{\"name\":\"offset\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"Point\"}},\"index\":{\"request\":[{\"name\":\"threshold\",\"type\":\"double\"}],\"response\":\"boolean\"},\"neighbours\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"number\",\"type\":\"int\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"}],\"response\":{\"type\":\"array\",\"items\":\"Neighbour\"}},\"similar\":{\"request\":[{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}},{\"name\":\"number\",\"type\":\"int\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"}],\"response\":{\"type\":\"array\",\"items\":\"Neighbour\"}}}}");
  boolean add(org.librairy.service.space.facade.model.Point point) throws org.apache.avro.AvroRemoteException;
  org.librairy.service.space.facade.model.Point get(java.lang.String id) throws org.apache.avro.AvroRemoteException;
  boolean remove(java.lang.String id) throws org.apache.avro.AvroRemoteException;
  boolean removeAll() throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.space.facade.model.Point> list(int size, java.lang.String offset) throws org.apache.avro.AvroRemoteException;
  boolean index(double threshold) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.space.facade.model.Neighbour> neighbours(java.lang.String id, int number, java.lang.String type) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.space.facade.model.Neighbour> similar(java.util.List<java.lang.Double> shape, int number, java.lang.String type) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends SpaceService {
    public static final org.apache.avro.Protocol PROTOCOL = org.librairy.service.space.facade.model.SpaceService.PROTOCOL;
    void add(org.librairy.service.space.facade.model.Point point, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void get(java.lang.String id, org.apache.avro.ipc.Callback<org.librairy.service.space.facade.model.Point> callback) throws java.io.IOException;
    void remove(java.lang.String id, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void removeAll(org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void list(int size, java.lang.String offset, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.space.facade.model.Point>> callback) throws java.io.IOException;
    void index(double threshold, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void neighbours(java.lang.String id, int number, java.lang.String type, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.space.facade.model.Neighbour>> callback) throws java.io.IOException;
    void similar(java.util.List<java.lang.Double> shape, int number, java.lang.String type, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.space.facade.model.Neighbour>> callback) throws java.io.IOException;
  }
}