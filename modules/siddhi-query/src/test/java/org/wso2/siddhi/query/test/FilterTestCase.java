package org.wso2.siddhi.query.test;

import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Test;
import org.wso2.siddhi.query.api.query.Query;
import org.wso2.siddhi.query.compiler.SiddhiCompiler;
import org.wso2.siddhi.query.compiler.exception.SiddhiPraserException;

public class FilterTestCase {

    @Test
    public void Test() throws RecognitionException, SiddhiPraserException {
        Query query = SiddhiCompiler.parseQuery("from  cseEventStream#window.lenghtBatch(50)  " +
                                                "insert all-events into StockQuote symbol, avg(price) as avgPrice" +
                                                " group by symbol" +
                                                " having (price >=20);"
        );
        Assert.assertNotNull(query);
    }

    @Test
    public void Test1() throws RecognitionException, SiddhiPraserException {
        Query query = SiddhiCompiler.parseQuery("from  cseEventStream [price >= 20]#window.lengthBatch(50)" +
                                                "insert into StockQuote symbol, avg(price) as avgPrice" +
                                                " group by symbol" +
                                                " having avgPrice>50;");
        Assert.assertNotNull(query);
    }

    //        from cseEventStream[win.lenghtBatch(50)][price >= 20]
//            insert into StockQuote symbol, avg(price) as avgPrice
//            group by symbol
//            having avgPrice>50;
    @Test
    public void Test2() throws RecognitionException, SiddhiPraserException {
        SiddhiCompiler.parse("from  cseEventStream [price >= 20]#window.length(50)" +
                             "insert into StockQuote symbol, avg(price) as avgPricegroup by symbol" +
                             "group by symbol" +
                             " " +
                             " having avgPrice>50;");
    }

    @Test
    public void Test3() throws RecognitionException, SiddhiPraserException {
        SiddhiCompiler.parse("from allStockQuotes#window.time(600000)" +
                             "insert into fastMovingStockQuotes \n" +
                             "symbol as symbol, price, avg(price) as averagePrice \n" +
                             "group by symbol \n" +
                             "having ( price > ( averagePrice*1.02) ) or ( averagePrice > price ); ");
//                             "having ( price > ( averagePrice*1.02) ) or ( averagePrice*0.98 > price ); ");
//                             "having ( price >  (averagePrice +5)) or ( averagePrice > price ); ");
        ;
    }

    @Test
    public void Test4() throws RecognitionException, SiddhiPraserException {
        Query query = SiddhiCompiler.parseQuery("from  cseEventStream#window.lenghtBatch(50)  " +
                "return symbol, avg(price) as avgPrice"
        );
        Assert.assertNotNull(query);
    }

}


