package org.wso2.siddhi.loadbalancer.nodemanager;

import org.wso2.siddhi.query.api.definition.StreamDefinition;
import org.wso2.siddhi.query.api.query.Query;
import org.wso2.siddhi.query.api.query.QueryEventStream;
import org.wso2.siddhi.query.api.query.input.BasicStream;
import org.wso2.siddhi.query.api.query.input.Stream;
import org.wso2.siddhi.query.api.query.output.OutStream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NodeProvider {
    private static List<Node> inputNodeList = new ArrayList<Node>();
    private static List<Node> outputNodeList = new ArrayList<Node>();

    public static List<Node> getNodeListFromFile(){

        try{

            FileInputStream fstream = new FileInputStream("/home/isuru/Documents/project/LoadBalancer/src/utils/OperatorNodes.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                String[] array =strLine.split("\\|");
                Node node = new Node(array[0],array[1]);
                inputNodeList.add(node);
            }

            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        return inputNodeList;


    }

    public static List<Node> getInputNodeListFromQuery(Query query){

        Stream stream = query.getInputStream();
        QueryEventStream queryEventStream= ((BasicStream)stream).getQueryEventStream();
        StreamDefinition streamDefinition = queryEventStream.getInStreamDefinition();
        String streamId = streamDefinition.getStreamId();
        String ip = streamDefinition.getIp();
        String port ="9673";
        inputNodeList.add(new Node(ip,port,streamId));
        return inputNodeList;
    }

    public static List<Node> getOutputNodeListFromQuery(Query query){

        OutStream stream = query.getOutputStream();
        String streamId = stream.getStreamId();
        List<String> ipList = stream.getIp();
        String port ="9673";
        for(String ip: ipList){
            outputNodeList.add(new Node(ip,port,streamId));
        }
        return outputNodeList;
    }

}
