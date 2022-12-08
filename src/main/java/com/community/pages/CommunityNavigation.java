package com.community.pages;

import org.openqa.selenium.By;

import com.community.enums.Waits;

public class CommunityNavigation extends Commons {

private String  linkSubMenu="//a[text()='%s']";
private String linkDiscussForum="//div[@class='tier3-container --active']/div//a[text()='%s']";
private String linkResource="//div[@class='tier3-container --active']//div//a[text()='%s']";
	
	public  CommunityNavigation clickOnSubMenu(String submenuitem) throws Exception {
		String path=String.format(linkSubMenu, submenuitem);
		click(By.xpath(path), Waits.CLICKABLE, submenuitem);
		return this;
		
	}
	
	public  CommunityConversation clickOnDiscussForum(String menuitem) throws Exception {
		String path=String.format(linkDiscussForum, menuitem);
		click(By.xpath(path), Waits.CLICKABLE, menuitem);
		return new CommunityConversation();
		
	}
	
	public  CommunityConversation clickOnResources(String menuitem) throws Exception {
		String path=String.format(linkResource, menuitem);
		click(By.xpath(path), Waits.CLICKABLE, menuitem);
		return new CommunityConversation();
	}
}
