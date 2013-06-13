<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputMapMappingDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputMapPropertyDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputTupleMappingDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputTuplePropertyDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputXMLMappingDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.InputXMLPropertyDTO" %>
<%@ page import="org.wso2.carbon.cep.stub.admin.internal.xsd.XpathDefinitionDTO" %>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.List" %>
<%
    String topic = request.getParameter("topic");
    String mappingStream = request.getParameter("mappingStream");
    String mappingType = request.getParameter("mappingType");
    String tableIndex = request.getParameter("tableIndex");
    String brokerName = request.getParameter("brokerName");
    String queryEventType = request.getParameter("queryEventType");
//    String queryEventType = null; //not allowed via ui

    if (topic != null) {
        topic = topic.trim();
    }
    if (mappingStream != null) {
        mappingStream = mappingStream.trim();
    }

    if (queryEventType != null && queryEventType.trim().equals("")) {
        queryEventType = null;
    }

    HashSet XMLPropertySet = (HashSet) session.getAttribute("inputXMLPropertyHashSet");
    HashSet nsPrefixesSet = (HashSet) session.getAttribute("nsPrefixHashSet");
    List tuplePropertyList = (List) session.getAttribute("inputTuplePropertyList");
    List mapPropertyList = (List) session.getAttribute("inputMapPropertyList");

    int index = -1;
    try {
        index = Integer.parseInt(tableIndex.trim());
    } catch (NumberFormatException e) {
        index = -1;
    }

    LinkedList<InputDTO> inputs = (LinkedList<InputDTO>) session.getAttribute("inputs");

    if (inputs == null) {
        inputs = new LinkedList<InputDTO>();
        session.setAttribute("inputs", inputs);
    }

    InputDTO input;
    if (inputs.size() > index) {
        input = inputs.get(index);
    } else {
        input = new InputDTO();
        inputs.add(input);
    }

    input.setTopic(topic);
    input.setBrokerName(brokerName);

    if (mappingType.equals("xml")) {
        InputXMLMappingDTO mapping = new InputXMLMappingDTO();
        mapping.setStream(mappingStream);
        mapping.setQueryEventType(queryEventType);
        if (nsPrefixesSet != null) {
            XpathDefinitionDTO[] xpathDefinitions = new XpathDefinitionDTO[nsPrefixesSet.size()];
            nsPrefixesSet.toArray(xpathDefinitions);
            mapping.setXpathDefinition(xpathDefinitions);
        }
        if (XMLPropertySet != null && XMLPropertySet.size() > 0) {
            InputXMLPropertyDTO[] properties = new InputXMLPropertyDTO[XMLPropertySet.size()];
            XMLPropertySet.toArray(properties);
            mapping.setProperties(properties);
        }
        input.setInputTupleMappingDTO(null);
        input.setInputMapMappingDTO(null);
        input.setInputXMLMappingDTO(mapping);
    } else if(mappingType.equals("map")){

        InputMapMappingDTO mapping = new InputMapMappingDTO();
        mapping.setStream(mappingStream);
        mapping.setQueryEventType(queryEventType);
        if (mapPropertyList != null && mapPropertyList.size() > 0) {
            InputMapPropertyDTO[] properties = new InputMapPropertyDTO[mapPropertyList.size()];
            mapPropertyList.toArray(properties);
            mapping.setProperties(properties);
        }
        input.setInputMapMappingDTO(mapping);
        input.setInputTupleMappingDTO(null);
        input.setInputXMLMappingDTO(null);
    }else {

        InputTupleMappingDTO mapping = new InputTupleMappingDTO();
        mapping.setStream(mappingStream);
        mapping.setQueryEventType(queryEventType);
        if (tuplePropertyList != null && tuplePropertyList.size() > 0) {
            InputTuplePropertyDTO[] properties = new InputTuplePropertyDTO[tuplePropertyList.size()];
            tuplePropertyList.toArray(properties);
            mapping.setProperties(properties);
        }
        input.setInputMapMappingDTO(null);
        input.setInputTupleMappingDTO(mapping);
        input.setInputXMLMappingDTO(null);
    }

    try {
        session.removeAttribute("inputXMLPropertyHashSet");
        session.removeAttribute("nsPrefixHashSet");
        session.removeAttribute("inputTuplePropertyList");
        session.removeAttribute("inputMapPropertyList");
    } catch (Exception e) {
        CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request);
    }
%>