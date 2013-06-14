package org.wso2.siddhi.loadbalancer.utils;

import java.io.File;


public class KeyStoreUtil {
    static File filePath = new File("/home/isuru/Documents/FYP/fypV1/siddhi-lb/modules/siddhi-loadbalancer/src/main/resources");

    public static void setTrustStoreParams() {
        String trustStore = filePath.getAbsolutePath();
        System.setProperty("javax.net.ssl.trustStore", trustStore + "/client-truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");

    }

    public static void setKeyStoreParams() {
        String keyStore = filePath.getAbsolutePath();
        System.setProperty("Security.KeyStore.Location", keyStore + "/wso2carbon.jks");
        System.setProperty("Security.KeyStore.Password", "wso2carbon");

    }
}
