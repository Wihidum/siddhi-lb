package org.wso2.siddhi.loadbalancer.nodemanager;

import org.wso2.carbon.databridge.commons.Event;
import org.wso2.siddhi.loadbalancer.eventpublisher.EventPublisher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/29/13
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    private  String hostname;
    private  String port;
    private String streamID;
    private static List<Event> eventList = new ArrayList<Event>();

    public Node(String hostName, String port){
        this.hostname =hostName;
        this.port =port;
    }
    public Node(String hostName, String port,String streamID){
        this.hostname =hostName;
        this.port =port;
        this.streamID =streamID;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPort(){
        return port;
    }
    public void setStreamID(String streamID){
        this.streamID = streamID;
    }
     public  String getStreamID(){
         return streamID;
     }

    public synchronized void addEvent(Event event){
        eventList.add(event);

        if (eventList.size()>=1000){
            if(this.streamID != null){
            EventPublisher.setSTREAM_ID(this.streamID);
            }
            EventPublisher.publishEvents(hostname,port,eventList);
            eventList.clear();
        }

    }



}
