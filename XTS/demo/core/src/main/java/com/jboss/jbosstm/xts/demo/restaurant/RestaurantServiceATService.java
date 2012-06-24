
package com.jboss.jbosstm.xts.demo.restaurant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "RestaurantServiceATService", targetNamespace = "http://www.jboss.com/jbosstm/xts/demo/Restaurant", wsdlLocation = "/WEB-INF/wsdl/RestaurantServiceAT.wsdl")
public class RestaurantServiceATService
    extends Service
{

    private final static URL RESTAURANTSERVICEATSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.jboss.jbosstm.xts.demo.restaurant.RestaurantServiceATService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.jboss.jbosstm.xts.demo.restaurant.RestaurantServiceATService.class.getResource(".");
            url = new URL(baseUrl, "/WEB-INF/wsdl/RestaurantServiceAT.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: '/WEB-INF/wsdl/RestaurantServiceAT.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RESTAURANTSERVICEATSERVICE_WSDL_LOCATION = url;
    }

    public RestaurantServiceATService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RestaurantServiceATService() {
        super(RESTAURANTSERVICEATSERVICE_WSDL_LOCATION, new QName("http://www.jboss.com/jbosstm/xts/demo/Restaurant", "RestaurantServiceATService"));
    }

    /**
     * 
     * @return
     *     returns IRestaurantServiceAT
     */
    @WebEndpoint(name = "RestaurantServiceAT")
    public IRestaurantServiceAT getRestaurantServiceAT() {
        return super.getPort(new QName("http://www.jboss.com/jbosstm/xts/demo/Restaurant", "RestaurantServiceAT"), IRestaurantServiceAT.class);
    }

}