
/**
 * ApplicationManagementServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.wso2.carbon.appfactory.application.mgt.service;

    /**
     *  ApplicationManagementServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ApplicationManagementServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ApplicationManagementServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ApplicationManagementServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for updateRolesOfUserForApplication method
            * override this method for handling normal response from updateRolesOfUserForApplication operation
            */
           public void receiveResultupdateRolesOfUserForApplication(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateRolesOfUserForApplication operation
           */
            public void receiveErrorupdateRolesOfUserForApplication(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for isApplicationIdAvailable method
            * override this method for handling normal response from isApplicationIdAvailable operation
            */
           public void receiveResultisApplicationIdAvailable(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isApplicationIdAvailable operation
           */
            public void receiveErrorisApplicationIdAvailable(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUsersOfApplication method
            * override this method for handling normal response from getUsersOfApplication operation
            */
           public void receiveResultgetUsersOfApplication(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUsersOfApplication operation
           */
            public void receiveErrorgetUsersOfApplication(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserFromApplication method
            * override this method for handling normal response from removeUserFromApplication operation
            */
           public void receiveResultremoveUserFromApplication(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserFromApplication operation
           */
            public void receiveErrorremoveUserFromApplication(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserInfoBean method
            * override this method for handling normal response from getUserInfoBean operation
            */
           public void receiveResultgetUserInfoBean(
                    org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserInfoBean operation
           */
            public void receiveErrorgetUserInfoBean(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserToApplication method
            * override this method for handling normal response from addUserToApplication operation
            */
           public void receiveResultaddUserToApplication(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserToApplication operation
           */
            public void receiveErroraddUserToApplication(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revokeApplication method
            * override this method for handling normal response from revokeApplication operation
            */
           public void receiveResultrevokeApplication(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revokeApplication operation
           */
            public void receiveErrorrevokeApplication(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getUserInfo method
            * override this method for handling normal response from getUserInfo operation
            */
           public void receiveResultgetUserInfo(
                    org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserInfo operation
           */
            public void receiveErrorgetUserInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllApplications method
            * override this method for handling normal response from getAllApplications operation
            */
           public void receiveResultgetAllApplications(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllApplications operation
           */
            public void receiveErrorgetAllApplications(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRolesOfUserPerApplication method
            * override this method for handling normal response from getRolesOfUserPerApplication operation
            */
           public void receiveResultgetRolesOfUserPerApplication(
                    java.lang.String[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRolesOfUserPerApplication operation
           */
            public void receiveErrorgetRolesOfUserPerApplication(java.lang.Exception e) {
            }
                


    }
    