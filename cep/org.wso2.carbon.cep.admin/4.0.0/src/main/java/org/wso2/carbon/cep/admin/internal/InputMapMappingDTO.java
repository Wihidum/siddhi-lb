package org.wso2.carbon.cep.admin.internal;

/**
 * This class is used to define mapping between input XML to CEP Engine Inputs
 * */
public class InputMapMappingDTO {


    /**
     * Name of the mapping Stream
     * */
    private String stream;

    /**
     * Name of the to be converted event class
     */
    protected String mappingClass ;

    /**
     * Properties of the mapping
     * */
    private MapPropertyDTO[] mapPropertyDTOs;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getMappingClass() {
        return mappingClass;
    }

    public void setMappingClass(String mappingClass) {
        this.mappingClass = mappingClass;
    }

    public MapPropertyDTO[] getProperties() {
        return mapPropertyDTOs;
    }

    public void setProperties(MapPropertyDTO[] mapPropertyDTOs) {
        this.mapPropertyDTOs = mapPropertyDTOs;
    }


}
