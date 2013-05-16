package org.wso2.siddhi.loadbalancer.eventdivider;


import org.wso2.carbon.databridge.commons.Event;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/29/13
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Divider {
    public  void divide(Event event);

}
