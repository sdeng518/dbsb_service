package com.sysnet.dbsb.ws.asia;

public class XnhServiceProxy implements com.sysnet.dbsb.ws.asia.XnhService {
  private String _endpoint = null;
  private com.sysnet.dbsb.ws.asia.XnhService xnhService = null;
  
  public XnhServiceProxy() {
    _initXnhServiceProxy();
  }
  
  public XnhServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initXnhServiceProxy();
  }
  
  private void _initXnhServiceProxy() {
    try {
      xnhService = (new com.sysnet.dbsb.ws.asia.XnhServiceServiceLocator()).getXnhService();
      if (xnhService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)xnhService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)xnhService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (xnhService != null)
      ((javax.xml.rpc.Stub)xnhService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sysnet.dbsb.ws.asia.XnhService getXnhService() {
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService;
  }
  
  public java.lang.String personUploadService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.personUploadService(xml);
  }
  
  public java.lang.String feeBackService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.feeBackService(xml);
  }
  
  public java.lang.String feeUploadService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.feeUploadService(xml);
  }
  
  public java.lang.String feeQueryService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.feeQueryService(xml);
  }
  
  public java.lang.String feeCountService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.feeCountService(xml);
  }
  
  public java.lang.String hosRegInfoService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.hosRegInfoService(xml);
  }
  
  public java.lang.String compensationInfoService(java.lang.String xml) throws java.rmi.RemoteException{
    if (xnhService == null)
      _initXnhServiceProxy();
    return xnhService.compensationInfoService(xml);
  }
  
  
}