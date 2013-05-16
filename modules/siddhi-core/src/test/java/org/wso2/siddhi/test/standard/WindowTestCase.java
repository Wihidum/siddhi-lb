/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.siddhi.test.standard;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.wso2.siddhi.core.SiddhiManager;
import org.wso2.siddhi.core.event.Event;
import org.wso2.siddhi.core.query.output.QueryCallback;
import org.wso2.siddhi.core.stream.input.InputHandler;
import org.wso2.siddhi.core.util.EventPrinter;
import org.wso2.siddhi.query.api.QueryFactory;
import org.wso2.siddhi.query.api.condition.Condition;
import org.wso2.siddhi.query.api.definition.Attribute;
import org.wso2.siddhi.query.api.expression.Expression;
import org.wso2.siddhi.query.api.query.Query;
import org.wso2.siddhi.query.api.query.output.OutStream;

public class WindowTestCase {
    static final Logger log = Logger.getLogger(WindowTestCase.class);

    private int count;
    private long value;
    private boolean eventArrived;

    @Before
    public void init() {
        count = 0;
        value = 0;
        eventArrived = false;
    }

    @Test
    public void testWindowQuery1() throws InterruptedException {
        log.info("Window test1");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("time", Expression.value(5000))//.
        );
        query.insertInto("StockQuote", OutStream.OutputEvents.ALL_EVENTS);
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("price", Expression.variable("price"))
        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("IBM".equals(inEvents[0].getData(0)) || "WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.assertTrue("IBM".equals(removeEvents[0].getData(0)) || "WSO2".equals(removeEvents[0].getData(0)));
                    count--;
                }
                eventArrived = true;
            }
        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(6000);
        Assert.assertEquals("In and Remove events has to be equal", 0, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery2() throws InterruptedException {
        log.info("Window test2");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("time", Expression.value(3000))//.
        );
        query.insertInto("StockQuote", OutStream.OutputEvents.ALL_EVENTS);
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("price", "sum", Expression.variable("price")).
                        project("count", "count", Expression.variable("price"))

        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("IBM".equals(inEvents[0].getData(0)) || "WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.assertTrue("IBM".equals(removeEvents[0].getData(0)) || "WSO2".equals(removeEvents[0].getData(0)));
                    count--;
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(6000);
        Assert.assertEquals("In and Remove events has to be equal", 0, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery3() throws InterruptedException {
        log.info("Window test3");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("timeBatch", Expression.value(3000))//.
        );
        query.insertInto("StockQuote", OutStream.OutputEvents.ALL_EVENTS);
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("price", "sum", Expression.variable("price")).
                        project("count", "count", Expression.variable("price"))
        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("IBM".equals(inEvents[0].getData(0)) || "WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.assertTrue("IBM".equals(removeEvents[0].getData(0)) || "WSO2".equals(removeEvents[0].getData(0)));
                    count--;
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(6000);
        Assert.assertEquals("In and Remove event diff", 0, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery4() throws InterruptedException {
        log.info("Window test4");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("time", Expression.value(5000))//.
        );
        query.insertInto("StockQuote", OutStream.OutputEvents.ALL_EVENTS);
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("price", "sum", Expression.variable("price")).
                        groupBy("symbol")
        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("IBM".equals(inEvents[0].getData(0)) || "WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.assertTrue("IBM".equals(removeEvents[0].getData(0)) || "WSO2".equals(removeEvents[0].getData(0)));
                    if ((new Double(0)).equals(removeEvents[0].getData(1))) {
                        count--;
                    }
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(7000);
        Assert.assertEquals("Remove events has two 0.0s out of three total Remove events", 3 - 2, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery5() throws InterruptedException {
        log.info("Window test5");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("time", Expression.value(5000))//.
        );
        query.insertInto("StockQuote");
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("totalPrice", "sum", Expression.variable("price")).
                        groupBy("symbol").
                        having(Condition.compare(Expression.variable("totalPrice"),
                                                 Condition.Operator.GREATER_THAN,
                                                 Expression.value(100.0)))
        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.fail("No remove events expected");
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(7000);
        Assert.assertEquals("Expected events after having clause", 1, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery6() throws InterruptedException {
        log.info("Window test6");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream("define stream cseStream ( symbol string, price float, volume int )");

        String queryReference = siddhiManager.addQuery("from cseStream [price>10]#window.length(3) " +
                                                       "insert all-events into outStream symbol, avg(price) as avgPrice, volume ");
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (removeEvents != null) {
                    count++;
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        inputHandler.send(new Object[]{"WSO2", 27.6f, 100});
        inputHandler.send(new Object[]{"WSO2", 127.6f, 100});
        inputHandler.send(new Object[]{"WSO2", 150.6f, 100});
        Thread.sleep(7000);
        Assert.assertEquals("Expected remove events ", 2, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery7() throws InterruptedException {
        log.info("Window test7");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream(QueryFactory.createStreamDefinition().name("cseEventStream").attribute("symbol", Attribute.Type.STRING).attribute("price", Attribute.Type.FLOAT).attribute("volume", Attribute.Type.INT));

        Query query = QueryFactory.createQuery();
        query.from(
                QueryFactory.inputStream("cseEventStream").
                        window("time", Expression.value(5000))//.
        );
        query.insertInto("StockQuote");
        query.project(
                QueryFactory.outputProjector().
                        project("symbol", Expression.variable("symbol")).
                        project("price", "sum", Expression.variable("price")).
                        groupBy("symbol")
        );


        String queryReference = siddhiManager.addQuery(query);
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.assertTrue("IBM".equals(inEvents[0].getData(0)) || "WSO2".equals(inEvents[0].getData(0)));
                    count++;
                } else {
                    Assert.fail("no expired events are expected ");
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(7000);
        Assert.assertEquals("No expired events are expected only 3 current event", 3, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery8() throws InterruptedException {
        log.info("Window test8");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream("define stream cseEventStream (symbol string, price float, volume int) ");

        String queryReference = siddhiManager.addQuery("from cseEventStream#window.time(5000) " +
                                                       "insert expired-events into StockQuote symbol , sum(price) as sumPrice " +
                                                       "group by symbol;");
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    Assert.fail("no current  events are expected ");
                } else {
                    count--;
                }
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100});
        inputHandler.send(new Object[]{"IBM", 75.6f, 100});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 100});
        Thread.sleep(7000);
        Assert.assertEquals("No current events are expected only 3 expired event", -3, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery9() throws InterruptedException {
        log.info("Window test9");

        SiddhiManager siddhiManager = new SiddhiManager();

        siddhiManager.defineStream("define stream cseEventStream (symbol string, price float, volume long) ");

        String queryReference = siddhiManager.addQuery("from cseEventStream#window.time(5000) " +
                                                       "insert all-events into StockQuote symbol , sum(volume) as sumVolume, avg(volume) as avgVolume " +
                                                       "group by symbol;");
        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                count++;
                eventArrived = true;
            }

        });
        InputHandler inputHandler = siddhiManager.getInputHandler("cseEventStream");
        inputHandler.send(new Object[]{"WSO2", 55.6f, 100l});
        inputHandler.send(new Object[]{"IBM", 75.6f, 300l});
        Thread.sleep(500);
        inputHandler.send(new Object[]{"WSO2", 57.6f, 200l});
        Thread.sleep(7000);
        Assert.assertEquals("Expected total event", 6, count);
        Assert.assertEquals("Event arrived", true, eventArrived);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery10() throws InterruptedException {
        log.info("Window test10");

        SiddhiManager siddhiManager = new SiddhiManager();


        siddhiManager.defineStream("define stream LoginEvents (timeStamp long, ip string) ");

        String queryReference = siddhiManager.addQuery("from LoginEvents#window.timeBatch(1000) " +
                                                       "insert into LoginEventsByHourAndIP ip, count(ip) as ipCount group by ip;");

        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents.length == 2) {
                    count++;
                }
                eventArrived = true;
            }

        });
        InputHandler loginSucceedEvents = siddhiManager.getInputHandler("LoginEvents");

        for (int i = 0; i < 3; i++) {
            loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
            loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.4"});
            Thread.sleep(500);
        }

        Thread.sleep(1000);

        Assert.assertEquals("Event arrived", true, eventArrived);
        Assert.assertEquals("Event count", 2, count);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery11() throws InterruptedException {
        log.info("Window test11");

        SiddhiManager siddhiManager = new SiddhiManager();


        siddhiManager.defineStream("define stream LoginEvents (timeStamp long, ip string) ");

        String queryReference = siddhiManager.addQuery("from LoginEvents#window.length(3) " +
                                                       "insert into LoginEventsByHourAndIP ip, count(ip) as ipCount;");

        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                Event[] events;
                if (inEvents != null) {
                    events = inEvents;
                } else {
                    events = removeEvents;
                }
                for (Event event : events) {
                    if (value < (Long) event.getData1()) {
                        value = (Long) event.getData1();
                    }
                }
                eventArrived = true;
            }

        });
        InputHandler loginSucceedEvents = siddhiManager.getInputHandler("LoginEvents");

        for (int i = 0; i < 3; i++) {
            loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
            loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.4"});
        }

        Thread.sleep(1000);

        Assert.assertEquals("Event arrived", true, eventArrived);
        Assert.assertEquals("Event max value", 3, value);
        siddhiManager.shutdown();
    }

    @Test
    public void testWindowQuery12() throws InterruptedException {
        log.info("Window test12");

        SiddhiManager siddhiManager = new SiddhiManager();


        siddhiManager.defineStream("define stream LoginEvents (timeStamp long, ip string) ");

        String queryReference = siddhiManager.addQuery("from LoginEvents#window.unique('ip') " +
                                                       "insert into uniqueIps  count(ip) as ipCount, ip ;");

        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    value = (Long) inEvents[inEvents.length - 1].getData0();
                }
                eventArrived = true;
            }

        });
        InputHandler loginSucceedEvents = siddhiManager.getInputHandler("LoginEvents");

        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.4"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.5"});

        Thread.sleep(1000);

        Assert.assertEquals("Event arrived", true, eventArrived);
        Assert.assertEquals("Event max value", 3, value);
        siddhiManager.shutdown();
    }


    @Test
    public void testWindowQuery13() throws InterruptedException {
        log.info("Window test13");

        SiddhiManager siddhiManager = new SiddhiManager();


        siddhiManager.defineStream("define stream LoginEvents (timeStamp long, ip string) ");

        String queryReference = siddhiManager.addQuery("from LoginEvents#window.firstUnique('ip') " +
                                                       "insert all-events into uniqueIps  ip ;");

        siddhiManager.addCallback(queryReference, new QueryCallback() {
            @Override
            public void receive(long timeStamp, Event[] inEvents, Event[] removeEvents) {
                EventPrinter.print(timeStamp, inEvents, removeEvents);
                if (inEvents != null) {
                    count += inEvents.length;
                } else {
                    Assert.fail("Remove events emitted");
                }
                eventArrived = true;
            }

        });
        InputHandler loginSucceedEvents = siddhiManager.getInputHandler("LoginEvents");

        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.4"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.3"});
        loginSucceedEvents.send(new Object[]{System.currentTimeMillis(), "192.10.1.5"});

        Thread.sleep(1000);

        Assert.assertEquals("Event arrived", true, eventArrived);
        Assert.assertEquals("Number of output event value", 3, count);
        siddhiManager.shutdown();
    }
}
