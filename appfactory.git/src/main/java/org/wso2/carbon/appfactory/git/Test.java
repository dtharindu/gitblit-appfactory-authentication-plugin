package org.wso2.carbon.appfactory.git;

public class Test {

	public static void main(String args[]){
		AppFactoryApplicationProvider appPro = new AppFactoryApplicationProvider();
		AppFacAuthClient appAuth = new AppFacAuthClient();
		boolean b = AppFacAuthClient.hasAccess("admin", "testksjbg");
		//appPro.getAllRepositories("admin", "me");
		System.out.println(b);
	}
}
