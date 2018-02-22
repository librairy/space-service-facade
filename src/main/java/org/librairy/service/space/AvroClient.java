package org.librairy.service.space;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.space.facade.model.Neighbour;
import org.librairy.service.space.facade.model.Point;
import org.librairy.service.space.facade.model.SpaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    SpaceService proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (SpaceService) SpecificRequestor.getClient(SpaceService.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public Boolean add(Point point) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.add with:" + point);
        boolean result = proxy.addPoint(point);
        LOG.debug("Result: " + result);
        return result;
    }

    public Point get(String id) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.get with:" + id);
        Point result = proxy.getPoint(id);
        LOG.debug("Result: " + result);
        return result;
    }

    public Boolean remove(String id) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.remove with id:  \"" + id+"\"");
        boolean result = proxy.removePoint(id);
        LOG.debug("Result: " + result);
        return result;
    }

    public Boolean removeAll() throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.removeAll");
        boolean result = proxy.removeAll();
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Point> list(Integer size, String offset) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.list with size: '" + size+"', offset: " + offset);
        List<Point> result = proxy.listPoints(size,offset == null?"":offset);
        LOG.debug("Result: " + result);
        return result;
    }

    public Boolean index(Double threshold) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.index with threshold: " + threshold);
        boolean result = proxy.index(threshold);
        LOG.debug("Result: " + result);
        return result;
    }

    public Boolean isIndexed() throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.isIndexed ");
        boolean result = proxy.isIndexed();
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Neighbour> neighbours(String id, Integer number, String type) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.neighbours with id: '" + id+"', number: " + number+", type:" + type);
        List<Neighbour> result = proxy.getNeighbours(id,number,type == null?"":type);
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Neighbour> similar(List<Double> shape, Integer number, String type) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.similar with shape: '" + shape+"', number: " + number+", type:" + type);
        List<Neighbour> result = proxy.getSimilar(shape,number,type == null?"":type);
        LOG.debug("Result: " + result);
        return result;
    }
}
