package org.wso2.carbon.appfactory.git;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.carbon.appfactory.git.AppFacAuthClient;

import com.gitblit.GitblitUserService;
import com.gitblit.IStoredSettings;
import com.gitblit.models.UserModel;

/**
 * This class wraps the default user service and is recommended as the starting
 * point for custom user service implementations.
 * 
 * This does seem a little convoluted, but the idea is to allow IUserService to
 * evolve with new methods and implementations without breaking custom
 * authentication implementations.
 * 
 * The most common implementation of a custom IUserService is to only override
 * authentication and then delegate all other functionality to one of Gitblit's
 * user services. This class optimizes that use-case.
 * 
 * Extending GitblitUserService allows for authentication customization without
 * having to keep-up-with IUSerService API changes.
 * 
 * @author Tharindu Dassanayake (tharindu@wso2.com)
 * 
 */

public class AppFactoryUserService extends GitblitUserService {

	private IStoredSettings settings;
	public static final Logger logger = LoggerFactory.getLogger(AppFacAuthClient.class);
	
	public AppFactoryUserService(){
		super();
	}
	
	
	@Override
	public void setup(IStoredSettings settings) {
		this.settings=settings;
	}
	
	public UserModel authenticate(String username, char[] password) {
		
		String strpassword=new String(password);
		AppFacAuthClient authClient= new AppFacAuthClient();
		UserModel user = null;
		boolean isAuth=authClient.getbasicAuth(username, strpassword);
		
		if(isAuth){	
			logger.info("Authorized User");
			if(user==null){
				user=new UserModel(username);
			}
			user.canAdmin=true;
		}else{
			logger.info("Unauthorized User");
		}
		return user;
	}
	@Override
	public boolean supportsCredentialChanges() {
		return false;
	}
	
	@Override
	public boolean supportsDisplayNameChanges() {
		return false;
	}
	
	@Override
	public boolean supportsEmailAddressChanges() {
		return false;
	}
	
	@Override
	public boolean supportsTeamMembershipChanges() {
		return false;
	}
	@Override
	public boolean supportsCookies() {
		return false;
	}

}