
/**
 * ApplicationManagementServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.wso2.carbon.appfactory.application.mgt.service;

        

        /*
        *  ApplicationManagementServiceStub java implementation
        */

        
        public class ApplicationManagementServiceStub extends org.apache.axis2.client.Stub
        implements ApplicationManagementService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("ApplicationManagementService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[12];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "updateRolesOfUserForApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "publishApplicationVersionCreation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "isApplicationIdAvailable"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "getUsersOfApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "removeUserFromApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "getUserInfoBean"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "addUserToApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "revokeApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "publishApplicationCreation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "getUserInfo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "getAllApplications"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org", "getRolesOfUserPerApplication"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "updateRolesOfUserForApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "updateRolesOfUserForApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "updateRolesOfUserForApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationVersionCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationVersionCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationVersionCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "isApplicationIdAvailable"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "isApplicationIdAvailable"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "isApplicationIdAvailable"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUsersOfApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUsersOfApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUsersOfApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "removeUserFromApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "removeUserFromApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "removeUserFromApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfoBean"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfoBean"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfoBean"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "addUserToApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "addUserToApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "addUserToApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "revokeApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "revokeApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "revokeApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "publishApplicationCreation"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfo"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfo"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getUserInfo"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getAllApplications"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getAllApplications"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getAllApplications"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getRolesOfUserPerApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getRolesOfUserPerApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org","ApplicationManagementServiceApplicationManagementException"), "getRolesOfUserPerApplication"),"org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public ApplicationManagementServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public ApplicationManagementServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public ApplicationManagementServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://appfactory.example.com:9443/services/ApplicationManagementService.ApplicationManagementServiceHttpsSoap12Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public ApplicationManagementServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://appfactory.example.com:9443/services/ApplicationManagementService.ApplicationManagementServiceHttpsSoap12Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public ApplicationManagementServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#updateRolesOfUserForApplication
                     * @param updateRolesOfUserForApplication74
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  boolean updateRolesOfUserForApplication(

                            java.lang.String applicationId75,java.lang.String userName76,java.lang.String[] rolesToDelete77,java.lang.String[] newRoles78)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:updateRolesOfUserForApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId75,
                                                    userName76,
                                                    rolesToDelete77,
                                                    newRoles78,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "updateRolesOfUserForApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getUpdateRolesOfUserForApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startupdateRolesOfUserForApplication
                    * @param updateRolesOfUserForApplication74
                
                */
                public  void startupdateRolesOfUserForApplication(

                 java.lang.String applicationId75,java.lang.String userName76,java.lang.String[] rolesToDelete77,java.lang.String[] newRoles78,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:updateRolesOfUserForApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId75,
                                                    userName76,
                                                    rolesToDelete77,
                                                    newRoles78,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "updateRolesOfUserForApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultupdateRolesOfUserForApplication(
                                            getUpdateRolesOfUserForApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorupdateRolesOfUserForApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRolesOfUserForApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorupdateRolesOfUserForApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorupdateRolesOfUserForApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdateRolesOfUserForApplication(f);
                                            }
									    } else {
										    callback.receiveErrorupdateRolesOfUserForApplication(f);
									    }
									} else {
									    callback.receiveErrorupdateRolesOfUserForApplication(f);
									}
								} else {
								    callback.receiveErrorupdateRolesOfUserForApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorupdateRolesOfUserForApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                 
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                  */
                public void  publishApplicationVersionCreation(
                 java.lang.String applicationId82,java.lang.String sourceVersion83,java.lang.String targetVersion84

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
                _operationClient.getOptions().setAction("urn:publishApplicationVersionCreation");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    applicationId82,
                                                                    sourceVersion83,
                                                                    targetVersion84,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                                    "publishApplicationVersionCreation")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationVersionCreation"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationVersionCreation"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationVersionCreation"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                                throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#isApplicationIdAvailable
                     * @param isApplicationIdAvailable85
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  boolean isApplicationIdAvailable(

                            java.lang.String applicationKey86)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:isApplicationIdAvailable");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationKey86,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "isApplicationIdAvailable")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getIsApplicationIdAvailableResponse_return((org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startisApplicationIdAvailable
                    * @param isApplicationIdAvailable85
                
                */
                public  void startisApplicationIdAvailable(

                 java.lang.String applicationKey86,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("urn:isApplicationIdAvailable");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationKey86,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "isApplicationIdAvailable")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultisApplicationIdAvailable(
                                            getIsApplicationIdAvailableResponse_return((org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorisApplicationIdAvailable(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isApplicationIdAvailable"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorisApplicationIdAvailable((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorisApplicationIdAvailable(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorisApplicationIdAvailable(f);
                                            }
									    } else {
										    callback.receiveErrorisApplicationIdAvailable(f);
									    }
									} else {
									    callback.receiveErrorisApplicationIdAvailable(f);
									}
								} else {
								    callback.receiveErrorisApplicationIdAvailable(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorisApplicationIdAvailable(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#getUsersOfApplication
                     * @param getUsersOfApplication89
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  java.lang.String[] getUsersOfApplication(

                            java.lang.String applicationId90)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:getUsersOfApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId90,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUsersOfApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetUsersOfApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startgetUsersOfApplication
                    * @param getUsersOfApplication89
                
                */
                public  void startgetUsersOfApplication(

                 java.lang.String applicationId90,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("urn:getUsersOfApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId90,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUsersOfApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetUsersOfApplication(
                                            getGetUsersOfApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetUsersOfApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUsersOfApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorgetUsersOfApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetUsersOfApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUsersOfApplication(f);
                                            }
									    } else {
										    callback.receiveErrorgetUsersOfApplication(f);
									    }
									} else {
									    callback.receiveErrorgetUsersOfApplication(f);
									}
								} else {
								    callback.receiveErrorgetUsersOfApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetUsersOfApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#removeUserFromApplication
                     * @param removeUserFromApplication93
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  boolean removeUserFromApplication(

                            java.lang.String applicationId94,java.lang.String userName95)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:removeUserFromApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId94,
                                                    userName95,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "removeUserFromApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getRemoveUserFromApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startremoveUserFromApplication
                    * @param removeUserFromApplication93
                
                */
                public  void startremoveUserFromApplication(

                 java.lang.String applicationId94,java.lang.String userName95,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("urn:removeUserFromApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId94,
                                                    userName95,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "removeUserFromApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultremoveUserFromApplication(
                                            getRemoveUserFromApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorremoveUserFromApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserFromApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorremoveUserFromApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorremoveUserFromApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorremoveUserFromApplication(f);
                                            }
									    } else {
										    callback.receiveErrorremoveUserFromApplication(f);
									    }
									} else {
									    callback.receiveErrorremoveUserFromApplication(f);
									}
								} else {
								    callback.receiveErrorremoveUserFromApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorremoveUserFromApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#getUserInfoBean
                     * @param getUserInfoBean98
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean getUserInfoBean(

                            java.lang.String userName99)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:getUserInfoBean");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userName99,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUserInfoBean")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetUserInfoBeanResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startgetUserInfoBean
                    * @param getUserInfoBean98
                
                */
                public  void startgetUserInfoBean(

                 java.lang.String userName99,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:getUserInfoBean");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userName99,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUserInfoBean")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetUserInfoBean(
                                            getGetUserInfoBeanResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetUserInfoBean(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfoBean"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorgetUserInfoBean((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetUserInfoBean(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfoBean(f);
                                            }
									    } else {
										    callback.receiveErrorgetUserInfoBean(f);
									    }
									} else {
									    callback.receiveErrorgetUserInfoBean(f);
									}
								} else {
								    callback.receiveErrorgetUserInfoBean(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetUserInfoBean(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#addUserToApplication
                     * @param addUserToApplication102
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  boolean addUserToApplication(

                            java.lang.String applicationId103,java.lang.String userName104,java.lang.String[] roles105)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:addUserToApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId103,
                                                    userName104,
                                                    roles105,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "addUserToApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getAddUserToApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startaddUserToApplication
                    * @param addUserToApplication102
                
                */
                public  void startaddUserToApplication(

                 java.lang.String applicationId103,java.lang.String userName104,java.lang.String[] roles105,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("urn:addUserToApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId103,
                                                    userName104,
                                                    roles105,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "addUserToApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddUserToApplication(
                                            getAddUserToApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddUserToApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserToApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErroraddUserToApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddUserToApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddUserToApplication(f);
                                            }
									    } else {
										    callback.receiveErroraddUserToApplication(f);
									    }
									} else {
									    callback.receiveErroraddUserToApplication(f);
									}
								} else {
								    callback.receiveErroraddUserToApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroraddUserToApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#revokeApplication
                     * @param revokeApplication108
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  boolean revokeApplication(

                            java.lang.String applicationId109)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:revokeApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId109,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "revokeApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getRevokeApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startrevokeApplication
                    * @param revokeApplication108
                
                */
                public  void startrevokeApplication(

                 java.lang.String applicationId109,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("urn:revokeApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId109,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "revokeApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrevokeApplication(
                                            getRevokeApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrevokeApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"revokeApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorrevokeApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorrevokeApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrevokeApplication(f);
                                            }
									    } else {
										    callback.receiveErrorrevokeApplication(f);
									    }
									} else {
									    callback.receiveErrorrevokeApplication(f);
									}
								} else {
								    callback.receiveErrorrevokeApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrevokeApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                 
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                  */
                public void  publishApplicationCreation(
                 java.lang.String applicationId113

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
                _operationClient.getOptions().setAction("urn:publishApplicationCreation");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    applicationId113,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                                    "publishApplicationCreation")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationCreation"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationCreation"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"publishApplicationCreation"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                                throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#getUserInfo
                     * @param getUserInfo114
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean[] getUserInfo(

                            java.lang.String applicationId115)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn:getUserInfo");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId115,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUserInfo")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetUserInfoResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startgetUserInfo
                    * @param getUserInfo114
                
                */
                public  void startgetUserInfo(

                 java.lang.String applicationId115,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("urn:getUserInfo");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applicationId115,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getUserInfo")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetUserInfo(
                                            getGetUserInfoResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetUserInfo(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUserInfo"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorgetUserInfo((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetUserInfo(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetUserInfo(f);
                                            }
									    } else {
										    callback.receiveErrorgetUserInfo(f);
									    }
									} else {
									    callback.receiveErrorgetUserInfo(f);
									}
								} else {
								    callback.receiveErrorgetUserInfo(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetUserInfo(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#getAllApplications
                     * @param getAllApplications118
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  java.lang.String[] getAllApplications(

                            java.lang.String userName119)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("urn:getAllApplications");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userName119,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getAllApplications")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetAllApplicationsResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startgetAllApplications
                    * @param getAllApplications118
                
                */
                public  void startgetAllApplications(

                 java.lang.String userName119,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("urn:getAllApplications");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userName119,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getAllApplications")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetAllApplications(
                                            getGetAllApplicationsResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetAllApplications(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getAllApplications"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorgetAllApplications((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetAllApplications(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAllApplications(f);
                                            }
									    } else {
										    callback.receiveErrorgetAllApplications(f);
									    }
									} else {
									    callback.receiveErrorgetAllApplications(f);
									}
								} else {
								    callback.receiveErrorgetAllApplications(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetAllApplications(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#getRolesOfUserPerApplication
                     * @param getRolesOfUserPerApplication122
                    
                     * @throws org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException : 
                     */

                    

                            public  java.lang.String[] getRolesOfUserPerApplication(

                            java.lang.String appId123,java.lang.String userName124)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("urn:getRolesOfUserPerApplication");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    appId123,
                                                    userName124,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getRolesOfUserPerApplication")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetRolesOfUserPerApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
                          throw (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementService#startgetRolesOfUserPerApplication
                    * @param getRolesOfUserPerApplication122
                
                */
                public  void startgetRolesOfUserPerApplication(

                 java.lang.String appId123,java.lang.String userName124,

                  final org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("urn:getRolesOfUserPerApplication");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    appId123,
                                                    userName124,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.mgt.application.appfactory.carbon.wso2.org",
                                                    "getRolesOfUserPerApplication")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRolesOfUserPerApplication(
                                            getGetRolesOfUserPerApplicationResponse_return((org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRolesOfUserPerApplication(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRolesOfUserPerApplication"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException){
														callback.receiveErrorgetRolesOfUserPerApplication((org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetRolesOfUserPerApplication(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRolesOfUserPerApplication(f);
                                            }
									    } else {
										    callback.receiveErrorgetRolesOfUserPerApplication(f);
									    }
									} else {
									    callback.receiveErrorgetRolesOfUserPerApplication(f);
									}
								} else {
								    callback.receiveErrorgetRolesOfUserPerApplication(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetRolesOfUserPerApplication(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://appfactory.example.com:9443/services/ApplicationManagementService.ApplicationManagementServiceHttpsSoap12Endpoint/
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    java.lang.String[] param3,
                                    java.lang.String[] param4,
                                    org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication();

                                 
                                              wrappedType.setApplicationId(param1);
                                         
                                              wrappedType.setUserName(param2);
                                         
                                              wrappedType.setRolesToDelete(param3);
                                         
                                              wrappedType.setNewRoles(param4);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getUpdateRolesOfUserForApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    java.lang.String param3,
                                    org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation();

                                 
                                              wrappedType.setApplicationId(param1);
                                         
                                              wrappedType.setSourceVersion(param2);
                                         
                                              wrappedType.setTargetVersion(param3);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable();

                                 
                                              wrappedType.setApplicationKey(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getIsApplicationIdAvailableResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication();

                                 
                                              wrappedType.setApplicationId(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String[] getGetUsersOfApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication();

                                 
                                              wrappedType.setApplicationId(param1);
                                         
                                              wrappedType.setUserName(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getRemoveUserFromApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean();

                                 
                                              wrappedType.setUserName(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean getGetUserInfoBeanResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    java.lang.String[] param3,
                                    org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication();

                                 
                                              wrappedType.setApplicationId(param1);
                                         
                                              wrappedType.setUserName(param2);
                                         
                                              wrappedType.setRoles(param3);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getAddUserToApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication();

                                 
                                              wrappedType.setApplicationId(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private boolean getRevokeApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation();

                                 
                                              wrappedType.setApplicationId(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo();

                                 
                                              wrappedType.setApplicationId(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean[] getGetUserInfoResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications();

                                 
                                              wrappedType.setUserName(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String[] getGetAllApplicationsResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication wrappedType = new org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication();

                                 
                                              wrappedType.setAppId(param1);
                                         
                                              wrappedType.setUserName(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private java.lang.String[] getGetRolesOfUserPerApplicationResponse_return(
                                org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.UpdateRolesOfUserForApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationVersionCreation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailableResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUsersOfApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.RemoveUserFromApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.AddUserToApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.RevokeApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.RevokeApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.PublishApplicationCreation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUserInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetUserInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetAllApplications.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetAllApplicationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplication.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.GetRolesOfUserPerApplicationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.class.equals(type)){
                
                           return org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   