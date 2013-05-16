package org.wso2.siddhi.loadbalancer;

import org.wso2.siddhi.loadbalancer.eventreceiver.ExternalEventReceiver;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/29/13
 * Time: 9:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class SiddhiLBManager {


    public static void main(String[] args) {
      ExternalEventReceiver.startReciver("localhost", 9766);
    }

}
