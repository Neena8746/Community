package com.community.tests;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.community.enums.ConfigEnums;
import com.community.pages.CommunityLoginPage;
import com.community.utils.DataproviderUtils;
import com.community.utils.ReadConfig;

public final class LoginTest extends BaseClass {
	
	private LoginTest(){
		
	}
	
    @Test()
	void login() throws Exception {
    	
    	CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.get(ConfigEnums.USERNAME)).enterPassword(ReadConfig.get(ConfigEnums.PASSWORD)).clickLogin();
    	cl.homepageLoad();
    	Assertions.assertThat(cl.getTitle()).isEqualTo("Home - Cisco Community");

	}
    
   @Test(dataProvider = "getData",dataProviderClass = DataproviderUtils.class)
   void logintest(Map<String,String>data) throws Exception {
	   
    	CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.get(ConfigEnums.USERNAME)).enterPassword(ReadConfig.get(ConfigEnums.PASSWORD)).clickLogin();
    	cl.homepageLoad();
    	Assertions.assertThat(cl.getTitle()).isEqualTo("Home - Cisco Community");
    	System.out.println(data.get("description"));

	}
   

    
   
}
