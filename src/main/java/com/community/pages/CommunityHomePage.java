package com.community.pages;

import org.openqa.selenium.By;

import com.community.enums.Waits;

public class CommunityHomePage extends Commons {
	
	private String  linkMenu="//button/span[text()='%s']";
	
	public  void clickOnMenu(String menuitem) throws Exception {
		String path=String.format(linkMenu, menuitem);
		click(By.xpath(path), Waits.CLICKABLE, menuitem);
		
	}

}
