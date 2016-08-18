/**
 * XnhServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sysnet.dbsb.ws.asia;

public class XnhServiceServiceLocator extends org.apache.axis.client.Service implements com.sysnet.dbsb.ws.asia.XnhServiceService {

    public XnhServiceServiceLocator() {
    }


    public XnhServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public XnhServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for XnhService
    private java.lang.String XnhService_address = "http://localhost:8087/services/XnhService";

    public java.lang.String getXnhServiceAddress() {
        return XnhService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XnhServiceWSDDServiceName = "XnhService";

    public java.lang.String getXnhServiceWSDDServiceName() {
        return XnhServiceWSDDServiceName;
    }

    public void setXnhServiceWSDDServiceName(java.lang.String name) {
        XnhServiceWSDDServiceName = name;
    }

    public com.sysnet.dbsb.ws.asia.XnhService getXnhService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XnhService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXnhService(endpoint);
    }

    public com.sysnet.dbsb.ws.asia.XnhService getXnhService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sysnet.dbsb.ws.asia.XnhServiceSoapBindingStub _stub = new com.sysnet.dbsb.ws.asia.XnhServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getXnhServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setXnhServiceEndpointAddress(java.lang.String address) {
        XnhService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sysnet.dbsb.ws.asia.XnhService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sysnet.dbsb.ws.asia.XnhServiceSoapBindingStub _stub = new com.sysnet.dbsb.ws.asia.XnhServiceSoapBindingStub(new java.net.URL(XnhService_address), this);
                _stub.setPortName(getXnhServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("XnhService".equals(inputPortName)) {
            return getXnhService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8087/services/XnhService", "XnhServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8087/services/XnhService", "XnhService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("XnhService".equals(portName)) {
            setXnhServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
