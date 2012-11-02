
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.wso2.carbon.appfactory.application.mgt.service.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://service.mgt.application.appfactory.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.appfactory.application.mgt.service.xsd.UserInfoBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.mgt.application.appfactory.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ApplicationManagementException".equals(typeName)){
                   
                            return  org.wso2.carbon.appfactory.application.mgt.service.xsd.ApplicationManagementException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    