

/**
 * ApplicationManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.wso2.carbon.appfactory.application.mgt.service;

    /*
     *  ApplicationManagementService java interface
     */

    public interface ApplicationManagementService {
          

        /**
          * Auto generated method signature
          * 
                    * @param updateRolesOfUserForApplication21
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public boolean updateRolesOfUserForApplication(

                        java.lang.String applicationId22,java.lang.String userName23,java.lang.String[] rolesToDelete24,java.lang.String[] newRoles25)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateRolesOfUserForApplication21
            
          */
        public void startupdateRolesOfUserForApplication(

            java.lang.String applicationId22,java.lang.String userName23,java.lang.String[] rolesToDelete24,java.lang.String[] newRoles25,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */
        public void  publishApplicationVersionCreation(
         java.lang.String applicationId29,java.lang.String sourceVersion30,java.lang.String targetVersion31

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param isApplicationIdAvailable32
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public boolean isApplicationIdAvailable(

                        java.lang.String applicationKey33)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param isApplicationIdAvailable32
            
          */
        public void startisApplicationIdAvailable(

            java.lang.String applicationKey33,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUsersOfApplication36
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public java.lang.String[] getUsersOfApplication(

                        java.lang.String applicationId37)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUsersOfApplication36
            
          */
        public void startgetUsersOfApplication(

            java.lang.String applicationId37,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param removeUserFromApplication40
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public boolean removeUserFromApplication(

                        java.lang.String applicationId41,java.lang.String userName42)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param removeUserFromApplication40
            
          */
        public void startremoveUserFromApplication(

            java.lang.String applicationId41,java.lang.String userName42,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getUserInfoBean45
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean getUserInfoBean(

                        java.lang.String userName46)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUserInfoBean45
            
          */
        public void startgetUserInfoBean(

            java.lang.String userName46,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addUserToApplication49
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public boolean addUserToApplication(

                        java.lang.String applicationId50,java.lang.String userName51,java.lang.String[] roles52)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addUserToApplication49
            
          */
        public void startaddUserToApplication(

            java.lang.String applicationId50,java.lang.String userName51,java.lang.String[] roles52,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param revokeApplication55
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public boolean revokeApplication(

                        java.lang.String applicationId56)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param revokeApplication55
            
          */
        public void startrevokeApplication(

            java.lang.String applicationId56,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */
        public void  publishApplicationCreation(
         java.lang.String applicationId60

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getUserInfo61
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean[] getUserInfo(

                        java.lang.String applicationId62)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUserInfo61
            
          */
        public void startgetUserInfo(

            java.lang.String applicationId62,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllApplications65
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public java.lang.String[] getAllApplications(

                        java.lang.String userName66)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllApplications65
            
          */
        public void startgetAllApplications(

            java.lang.String userName66,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getRolesOfUserPerApplication69
                
             * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
         */

         
                     public java.lang.String[] getRolesOfUserPerApplication(

                        java.lang.String appId70,java.lang.String userName71)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getRolesOfUserPerApplication69
            
          */
        public void startgetRolesOfUserPerApplication(

            java.lang.String appId70,java.lang.String userName71,

            final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    