package com.community.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.community.enums.ConfigEnums;
import com.community.pages.CommunityConversation;
import com.community.pages.CommunityHomePage;
import com.community.pages.CommunityLoginPage;
import com.community.pages.CommunityNavigation;
import com.community.utils.DataproviderUtils;
import com.community.utils.ReadConfig;

public class CommunityconversationTest extends BaseClass {
	
	@Test(dataProvider = "getData",dataProviderClass = DataproviderUtils.class)
	void startConversation(Map<String,String>data) throws Exception {
		CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.get(ConfigEnums.USERNAME)).enterPassword(ReadConfig.get(ConfigEnums.PASSWORD)).clickLogin();
    	cl.homepageLoad();
		new CommunityHomePage().clickOnMenu(data.get("communityheader"));
		CommunityNavigation cn=new CommunityNavigation();
		cn.clickOnSubMenu(data.get("subheader")).clickOnDiscussForum(data.get("discussionForum")).clickStrtConv().enterTitle(data.get("title"))
		.enterDescr(data.get("description")).clickPost();
		Assertions.assertThat(new CommunityConversation().getConvTitle().equalsIgnoreCase(data.get("title")));
	}
	
	void deleteConversation(Map<String,String>data) throws Exception {
		CommunityLoginPage cl=new CommunityLoginPage();
    	cl.enterUserName(ReadConfig.get(ConfigEnums.USERNAME)).enterPassword(ReadConfig.get(ConfigEnums.PASSWORD)).clickLogin();
    	cl.homepageLoad();
		new CommunityHomePage().clickOnMenu(data.get("communityheader"));
		CommunityNavigation cn=new CommunityNavigation();
		cn.clickOnSubMenu(data.get("subheader")).clickOnDiscussForum(data.get("discussionForum"));
		
	}

}
