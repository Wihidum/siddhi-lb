package org.wso2.carbon.cep.sample.agent;

import org.apache.log4j.Logger;
import org.wso2.carbon.databridge.agent.thrift.Agent;
import org.wso2.carbon.databridge.agent.thrift.DataPublisher;
import org.wso2.carbon.databridge.agent.thrift.conf.AgentConfiguration;
import org.wso2.carbon.databridge.agent.thrift.exception.AgentException;
import org.wso2.carbon.databridge.commons.Event;
import org.wso2.carbon.databridge.commons.exception.DifferentStreamDefinitionAlreadyDefinedException;
import org.wso2.carbon.databridge.commons.exception.MalformedStreamDefinitionException;
import org.wso2.carbon.databridge.commons.exception.NoStreamDefinitionExistException;
import org.wso2.carbon.databridge.commons.exception.StreamDefinitionException;
import org.wso2.carbon.databridge.commons.exception.TransportException;

import javax.security.sasl.AuthenticationException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.util.Random;

public class PhoneRetailAgent {
    private static Logger logger = Logger.getLogger(PhoneRetailAgent.class);
    public static final String PHONE_RETAIL_STREAM = "org.wso2.phone.retail.store";
    public static final String VERSION = "1.2.0";

    public static final String[] phoneModels = {"Nokia", "Apple", "Samsung", "Sony-Ericson", "LG"};
    public static final String[] buyer = {"James", "Mary", "John", "Peter", "Harry", "Tom", "Paul"};
    public static final int[] quantity = {2, 5, 3, 4, 1};
    public static final int[] price = {500, 350, 900, 800, 700};
    public static  int eventCount=0;


    public static void main(String[] args) throws AgentException,
                                                  MalformedStreamDefinitionException,
                                                  StreamDefinitionException,
                                                  DifferentStreamDefinitionAlreadyDefinedException,
                                                  MalformedURLException,
                                                  AuthenticationException,
                                                  NoStreamDefinitionExistException,
                                                  TransportException, SocketException,
                                                  org.wso2.carbon.databridge.commons.exception.AuthenticationException {
        String host="localhost";
        int port=7611;
        int events=20;
        if (args.length != 0 && args[0] != null) {
            host = args[0];
        }
        if (args.length != 0 && args[1] != null) {
            port = Integer.parseInt(args[1]);
        }

        if (args.length != 0 && args[2] != null) {
            events = Integer.parseInt(args[2]);
        }

        System.out.println("Starting Phone Retail Shop Agent");

        KeyStoreUtil.setTrustStoreParams();

        AgentConfiguration agentConfiguration = new AgentConfiguration();
        Agent agent = new Agent(agentConfiguration);

        //create data publisher
        DataPublisher dataPublisher = new DataPublisher("tcp://"+host+":"+port, "admin", "admin", agent);
        String streamId = null;

        try {
            streamId = dataPublisher.findStream(PHONE_RETAIL_STREAM, VERSION);
            System.out.println("Stream already defined");

        } catch (NoStreamDefinitionExistException e) {
            streamId = dataPublisher.defineStream("{" +
                                                  "  'name':'" + PHONE_RETAIL_STREAM + "'," +
                                                  "  'version':'" + VERSION + "'," +
                                                  "  'nickName': 'Phone_Retail_Shop'," +
                                                  "  'description': 'Phone Sales'," +
                                                  "  'metaData':[" +
                                                  "          {'name':'clientType','type':'STRING'}" +
                                                  "  ]," +
                                                  "  'payloadData':[" +
                                                  "          {'name':'brand','type':'STRING'}," +
                                                  "          {'name':'quantity','type':'INT'}," +
                                                  "          {'name':'total','type':'INT'}," +
                                                  "          {'name':'buyer','type':'STRING'}" +
                                                  "  ]" +
                                                  "}");
//            //Define event stream
        }


        //Publish event for a valid stream
        if (!streamId.isEmpty()) {
            System.out.println("Stream ID: " + streamId);

            for (int i = 0; i < events; i++) {
                eventCount++;
                publishEvents(dataPublisher, streamId, i);
                
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("Events published : " + eventCount);
            dataPublisher.stop();
        }
    }

    private static void publishEvents(DataPublisher dataPublisher, String streamId, int i)
            throws AgentException {
        int quantity = getRandomQuantity();
        Event eventOne = new Event(streamId, System.currentTimeMillis(), new Object[]{"external"}, null,
                                   new Object[]{getRandomProduct(), quantity, quantity * getRandomPrice(), getRandomUser()});
        
        dataPublisher.publish(eventOne);
    }

    private static String getRandomProduct() {
        return phoneModels[getRandomId(5)];
    }

    private static String getRandomUser() {
        return buyer[getRandomId(7)];
    }

    private static int getRandomQuantity() {
        return quantity[getRandomId(5)];
    }

    private static int getRandomPrice() {
        return price[getRandomId(5)];
    }


    private static int getRandomId(int i) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(i);
    }
}
