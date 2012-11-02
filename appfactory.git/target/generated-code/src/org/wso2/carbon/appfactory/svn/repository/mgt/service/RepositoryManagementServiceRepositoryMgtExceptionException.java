
/**
 * RepositoryManagementServiceRepositoryMgtExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.wso2.carbon.appfactory.svn.repository.mgt.service;

public class RepositoryManagementServiceRepositoryMgtExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1351762856196L;
    
    private org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceRepositoryMgtException faultMessage;

    
        public RepositoryManagementServiceRepositoryMgtExceptionException() {
            super("RepositoryManagementServiceRepositoryMgtExceptionException");
        }

        public RepositoryManagementServiceRepositoryMgtExceptionException(java.lang.String s) {
           super(s);
        }

        public RepositoryManagementServiceRepositoryMgtExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RepositoryManagementServiceRepositoryMgtExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceRepositoryMgtException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceRepositoryMgtException getFaultMessage(){
       return faultMessage;
    }
}
    