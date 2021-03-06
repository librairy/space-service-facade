package org.librairy.service.nlp.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.space.AvroClient;
import org.librairy.service.space.AvroServer;
import org.librairy.service.space.facade.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        SpaceService customService = new SpaceService() {

            @Override
            public boolean addPoint(Point point) throws AvroRemoteException {
                return false;
            }

            @Override
            public Point getPoint(String id) throws AvroRemoteException {
                return Point.newBuilder().setId(id).setName("example").setShape(Arrays.asList(new Double[]{0.1,0.8,0.1})).build();
            }

            @Override
            public boolean removePoint(String id) throws AvroRemoteException {
                return false;
            }

            @Override
            public boolean removeAll() throws AvroRemoteException {
                return false;
            }

            @Override
            public PointList listPoints(int size, String offset) throws AvroRemoteException {
                return new PointList(0l, "", Collections.emptyList());
            }

            @Override
            public boolean index(double threshold) throws AvroRemoteException {
                return false;
            }

            @Override
            public boolean isIndexed() throws AvroRemoteException {
                return false;
            }

            @Override
            public double compare(List<Double> shape1, List<Double> shape2) throws AvroRemoteException {
                return 0;
            }

            @Override
            public List<Neighbour> getNeighbours(String id, int number, List<String> types, boolean force) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Neighbour> getSimilar(List<Double> shape, int number, List<String> types, boolean force) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public Summary getSummary() throws AvroRemoteException {
                return new Summary();
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        client.addPoint(Point.newBuilder().setId("id").setName("name").setShape(Arrays.asList(new Double[]{0.2,0.3})).build());
        client.getPoint("id");
        client.removePoint("id");
        client.removeAll();
        client.listPoints(20,null);
        client.index(0.9);
        client.isIndexed();
        client.compare(Arrays.asList(new Double[]{0.1,0.2}),Arrays.asList(new Double[]{0.1,0.2}));
        client.getNeighbours("id",10,Collections.emptyList(), false);
        client.getSimilar(Arrays.asList(new Double[]{0.1,0.2}),10,Arrays.asList(new String[]{"paper"}),false);
        client.getSummary();

        client.close();
        server.close();
    }

}
