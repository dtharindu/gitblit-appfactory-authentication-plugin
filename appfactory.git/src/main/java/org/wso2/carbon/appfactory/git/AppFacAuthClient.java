package org.wso2.carbon.appfactory.git;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Properties;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceApplicationManagementExceptionException;
import org.wso2.carbon.appfactory.application.mgt.service.ApplicationManagementServiceStub;
import org.wso2.carbon.appfactory.application.mgt.service.IsApplicationIdAvailable;
import org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceRepositoryMgtExceptionException;
import org.wso2.carbon.appfactory.svn.repository.mgt.service.RepositoryManagementServiceStub;
import org.wso2.carbon.appfactory.repository.mgt.service.RepositoryAuthenticationServiceStub;


public class AppFacAuthClient{
	
	// set isAuth value to the false
	private  boolean isAuth=false;
	private Properties properties;
	
	public boolean isAuthenticate(String userName, String password, String appId){
		// Create service stub	
		RepositoryManagementServiceStub serviceStub;
		 File dir2 = new File(".");
    	//set the trust store path
		try {
			if(properties==null){
				System.out.print("++++");
				properties=new Properties();
				properties.load(new FileInputStream(dir2.getCanonicalPath()+"/gitblit.properties"));
			} 
			//set system property ssl key store path
			System.setProperty("javax.net.ssl.trustStore", properties.getProperty("appfac.trustStore"));
	        //set system property truststore password
			System.setProperty("javax.net.ssl.trustStorePassword", properties.getProperty("appfac.trustStorePassword"));
	        HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
			//Authenticate login to the app factory 
	        authenticator.setUsername(properties.getProperty("appfac.userName"));
			authenticator.setPassword(properties.getProperty("appfac.password"));	
			
	        serviceStub = new RepositoryManagementServiceStub(properties.getProperty("appfac.userName"));
			serviceStub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
			serviceStub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
		
			if(serviceStub.hasAccess(userName, password, appId))
				isAuth=true;
		
		} catch (AxisFault e) {
			e.printStackTrace();
		}catch (RemoteException e) {
			e.printStackTrace();
		} catch (RepositoryManagementServiceRepositoryMgtExceptionException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return isAuth;
    }

	public static boolean getbasicAuth(String userName, String password){
		
		RepositoryAuthenticationServiceStub serviceStub;
		System.setProperty("javax.net.ssl.trustStore", "/home/tharndu/wso2carbon-core-4.0.0-SNAPSHOT/repository/resources/security/client-truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		//set user name nd passwords to the authenticator
	    System.out.println(userName);
	    System.out.println(password);
		authenticator.setUsername(userName);
		authenticator.setPassword(password);
		try {
			serviceStub = new RepositoryAuthenticationServiceStub();
			serviceStub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
			serviceStub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
			serviceStub.hasAccess("admin", "app");
		} catch (AxisFault e) {
			String msg=e.getMessage();
			e.printStackTrace();
			if(msg.contains("Authentication failed"))
				return false;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return true;
	}
	
	public static boolean hasAccess(String username, String appId){

		boolean isAuth=false;
		RepositoryAuthenticationServiceStub serviceStub;
		System.setProperty("javax.net.ssl.trustStore", "/home/tharndu/wso2carbon-core-4.0.0-SNAPSHOT/repository/resources/security/client-truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		//set user name nd passwords to the authenticator
		authenticator.setUsername("admin");
		authenticator.setPassword("admin");
		try {
			serviceStub = new RepositoryAuthenticationServiceStub();
			serviceStub._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, authenticator);
			serviceStub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
			isAuth=serviceStub.hasAccess(username, appId);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return isAuth;
	}
   
}
