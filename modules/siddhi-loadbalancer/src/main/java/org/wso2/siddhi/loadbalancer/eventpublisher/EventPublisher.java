package org.wso2.siddhi.loadbalancer.eventpublisher;

import org.apache.log4j.Logger;


import org.wso2.carbon.databridge.commons.Event;
import org.wso2.siddhi.loadbalancer.utils.KeyStoreUtil;
import org.wso2.carbon.databridge.agent.thrift.Agent;
import org.wso2.carbon.databridge.agent.thrift.DataPublisher;
import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
import java.util.List;


public class EventPublisher {
    private static Logger logger = Logger.getLogger(EventPublisher.class);

    public static void publishEvents(String host,String port,List<Event> eventList)
    {
        KeyStoreUtil.setTrustStoreParams();
        AgentConfiguration agentConfiguration = new AgentConfiguration();
        Agent    agent = new Agent(agentConfiguration);
        DataPublisher dataPublisher = null;
        try {
            dataPublisher = new DataPublisher("tcp://"+host+":"+port, "admin", "admin", agent);
        } catch (Exception e) {
            e.printStackTrace();
            dataPublisher.stop();
        }

        for(Event event:eventList)  {
            try {
                dataPublisher.publish(event);
                // logger.info("publishEvent");
            } catch (AgentException e) {
                e.printStackTrace();
                dataPublisher.stop();
            }
        }
        dataPublisher.stop();
    }






}
