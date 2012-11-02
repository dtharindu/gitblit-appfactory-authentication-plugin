
/**
 * RepositoryManagementServiceSCMManagerExceptionsException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.wso2.carbon.appfactory.svn.repository.mgt.service;

public class RepositoryManagementServiceSCMManagerExceptionsException extends java.lang.Exception{

    private static final long serialVersionUID = 1351762856174L;
    
    private org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceSCMManagerExceptions faultMessage;

    
        public RepositoryManagementServiceSCMManagerExceptionsException() {
            super("RepositoryManagementServiceSCMManagerExceptionsException");
        }

        public RepositoryManagementServiceSCMManagerExceptionsException(java.lang.String s) {
           super(s);
        }

        public RepositoryManagementServiceSCMManagerExceptionsException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RepositoryManagementServiceSCMManagerExceptionsException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceSCMManagerExceptions msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceSCMManagerExceptions getFaultMessage(){
       return faultMessage;
    }
}
    