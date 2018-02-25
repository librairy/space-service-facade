/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.space.facade.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface SpaceService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SpaceService\",\"namespace\":\"org.librairy.service.space.facade.model\",\"types\":[{\"type\":\"record\",\"name\":\"Point\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"unknown\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"document\"},{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}]},{\"type\":\"record\",\"name\":\"PointList\",\"fields\":[{\"name\":\"nextPage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"points\",\"type\":{\"type\":\"array\",\"items\":\"Point\"}}]},{\"type\":\"record\",\"name\":\"Neighbour\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"unknown\"},{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"document\"},{\"name\":\"score\",\"type\":\"double\"}]}],\"messages\":{\"addPoint\":{\"request\":[{\"name\":\"point\",\"type\":\"Point\"}],\"response\":\"boolean\"},\"getPoint\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"Point\"},\"removePoint\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"boolean\"},\"removeAll\":{\"request\":[],\"response\":\"boolean\"},\"listPoints\":{\"request\":[{\"name\":\"size\",\"type\":\"int\"},{\"name\":\"page\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":\"PointList\"},\"index\":{\"request\":[{\"name\":\"threshold\",\"type\":\"double\"}],\"response\":\"boolean\"},\"isIndexed\":{\"request\":[],\"response\":\"boolean\"},\"compare\":{\"request\":[{\"name\":\"shape1\",\"type\":{\"type\":\"array\",\"items\":\"double\"}},{\"name\":\"shape2\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"response\":\"double\"},\"getNeighbours\":{\"request\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"max\",\"type\":\"int\"},{\"name\":\"types\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}],\"response\":{\"type\":\"array\",\"items\":\"Neighbour\"}},\"getSimilar\":{\"request\":[{\"name\":\"shape\",\"type\":{\"type\":\"array\",\"items\":\"double\"}},{\"name\":\"max\",\"type\":\"int\"},{\"name\":\"type\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}],\"response\":{\"type\":\"array\",\"items\":\"Neighbour\"}}}}");
  boolean addPoint(org.librairy.service.space.facade.model.Point point) throws org.apache.avro.AvroRemoteException;
  org.librairy.service.space.facade.model.Point getPoint(java.lang.String id) throws org.apache.avro.AvroRemoteException;
  boolean removePoint(java.lang.String id) throws org.apache.avro.AvroRemoteException;
  boolean removeAll() throws org.apache.avro.AvroRemoteException;
  org.librairy.service.space.facade.model.PointList listPoints(int size, java.lang.String page) throws org.apache.avro.AvroRemoteException;
  boolean index(double threshold) throws org.apache.avro.AvroRemoteException;
  boolean isIndexed() throws org.apache.avro.AvroRemoteException;
  double compare(java.util.List<java.lang.Double> shape1, java.util.List<java.lang.Double> shape2) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.space.facade.model.Neighbour> getNeighbours(java.lang.String id, int max, java.util.List<java.lang.String> types) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.space.facade.model.Neighbour> getSimilar(java.util.List<java.lang.Double> shape, int max, java.util.List<java.lang.String> type) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends SpaceService {
    public static final org.apache.avro.Protocol PROTOCOL = org.librairy.service.space.facade.model.SpaceService.PROTOCOL;
    void addPoint(org.librairy.service.space.facade.model.Point point, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getPoint(java.lang.String id, org.apache.avro.ipc.Callback<org.librairy.service.space.facade.model.Point> callback) throws java.io.IOException;
    void removePoint(java.lang.String id, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void removeAll(org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void listPoints(int size, java.lang.String page, org.apache.avro.ipc.Callback<org.librairy.service.space.facade.model.PointList> callback) throws java.io.IOException;
    void index(double threshold, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void isIndexed(org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void compare(java.util.List<java.lang.Double> shape1, java.util.List<java.lang.Double> shape2, org.apache.avro.ipc.Callback<java.lang.Double> callback) throws java.io.IOException;
    void getNeighbours(java.lang.String id, int max, java.util.List<java.lang.String> types, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.space.facade.model.Neighbour>> callback) throws java.io.IOException;
    void getSimilar(java.util.List<java.lang.Double> shape, int max, java.util.List<java.lang.String> type, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.space.facade.model.Neighbour>> callback) throws java.io.IOException;
  }
}