package com.community.tests;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.community.enums.ConfigEnums;
import com.community.pages.CommunityLoginPage;
import com.community.reports.ExtentReport;
import com.community.utils.ReadConfig;

public final class LoginTest extends BaseClass {
	
	private LoginTest(){
		
	}
	
    @Test
	void login() throws Exception {
    	
    	CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.get(ConfigEnums.USERNAME)).enterPassword(ReadConfig.get(ConfigEnums.PASSWORD)).clickLogin();
    	Assertions.assertThat(cl.getTitle()).isEqualTo("Home - Cisco Community");

	}
    
   
}
