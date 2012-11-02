
/**
 * ApplicationManagementServiceApplicationManagementExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.wso2.carbon.appfactory.application.mgt.service;

public class ApplicationManagementServiceApplicationManagementExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1351762859184L;
    
    private org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException faultMessage;

    
        public ApplicationManagementServiceApplicationManagementExceptionException() {
            super("ApplicationManagementServiceApplicationManagementExceptionException");
        }

        public ApplicationManagementServiceApplicationManagementExceptionException(java.lang.String s) {
           super(s);
        }

        public ApplicationManagementServiceApplicationManagementExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ApplicationManagementServiceApplicationManagementExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException getFaultMessage(){
       return faultMessage;
    }
}
    