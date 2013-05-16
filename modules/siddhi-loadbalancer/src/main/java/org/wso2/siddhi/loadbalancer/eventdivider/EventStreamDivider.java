package org.wso2.siddhi.loadbalancer.eventdivider;

import org.wso2.carbon.databridge.commons.Event;
import org.wso2.siddhi.loadbalancer.nodemanager.Node;
import org.wso2.siddhi.loadbalancer.nodemanager.NodeProvider;
import org.wso2.siddhi.query.api.QueryFactory;
import org.wso2.siddhi.query.api.query.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/29/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class EventStreamDivider implements Divider {
    final static Query query = QueryFactory.createQuery();
    private static final List<Node> nodelist  = NodeProvider.getInputNodeListFromQuery(query);




    @Override
    public synchronized void divide(Event event) {

            for(Node node:nodelist){
                if(node.getStreamID().equals(event.getStreamId())){
                    node.addEvent(event);
                    break;
                }

            }

    }
}
