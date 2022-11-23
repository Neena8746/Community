package com.community.tests;
import org.testng.annotations.Test;
import com.community.pages.CommunityLoginPage;
import com.community.utils.ReadConfig;

public final class LoginTest extends BaseClass {
	
	private LoginTest(){
		
	}
	
    @Test
	void login() throws Exception {
    	
    	CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.getKey("username")).enterPassword(ReadConfig.getKey("password")).clickLogin();


	}
    
   
}
