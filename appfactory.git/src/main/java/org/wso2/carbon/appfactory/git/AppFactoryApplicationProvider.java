package org.wso2.carbon.appfactory.git;
import java.rmi.RemoteException;
import java.util.Properties;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;
import org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceStub;

public class AppFactoryApplicationProvider {

	private Properties properties;
	public String repoList[];
	
	public String[] getAllRepositories(String userName, String password){
	
		ApplicationManagementServiceStub serviceStub;
		System.setProperty("javax.net.ssl.trustStore", "/home/tharndu/wso2carbon-core-4.0.0-SNAPSHOT/repository/resources/security/client-truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		//Authenticater login to the appfactory
	    authenticator.setUsername("admin");
		authenticator.setPassword("admin");	
		
        try {
			serviceStub = new ApplicationManagementServiceStub();
			serviceStub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
			serviceStub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
			repoList=serviceStub.getAllApplications(userName);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ApplicationManagementServiceApplicationManagementExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return repoList;
	}
}
