package com.community.pages;

import org.openqa.selenium.By;

import com.community.enums.Waits;

public class CommunityNavigation extends Commons {

private String  linkSubMenu="//a[text()='%replacable%']";
private String linkDiscussForum="//div[@class='tier3-container --active']/div//a[text()='%replacable%']";
private String linkResource="//div[@class='tier3-container --active']//div//a[text()='%replacable%']";
	
	public  CommunityNavigation clickOnSubMenu(String submenuitem) throws Exception {
		String path=linkSubMenu.replace("%replacable%",submenuitem);
		click(By.xpath(path), Waits.CLICKABLE, submenuitem);
		return this;
		
	}
	
	public  CommunityConversation clickOnDiscussForum(String menuitem) throws Exception {
		String path=linkDiscussForum.replace("%replacable%",menuitem);
		click(By.xpath(path), Waits.CLICKABLE, menuitem);
		return new CommunityConversation();
		
	}
	
	public  CommunityConversation clickOnResources(String menuitem) throws Exception {
		String path=linkResource.replace("%replacable%",menuitem);
		click(By.xpath(path), Waits.CLICKABLE, menuitem);
		return new CommunityConversation();
	}
}
