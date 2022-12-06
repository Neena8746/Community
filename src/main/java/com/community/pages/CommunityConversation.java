package com.community.pages;

import org.openqa.selenium.By;

import com.community.driver.DriverManager;
import com.community.enums.Waits;

public class CommunityConversation extends Commons {

	private final By lnkStrtConv=By.xpath("//form[@id='form']/../div/a");
	private final By txtTitle=By.id("lia-subject");
	private final By txtBody=By.xpath("//body[@id='tinymce']");
	private final By lnkPost=By.xpath("//span/input[@id='submitContext_1']");
	private final By txtConvTitle=By.xpath("//div[@class='lia-message-subject']");
	private final By txtLatestConvTitle=By.xpath("(//article[contains(@class,'custom-message-tile')])[1]//h3/a");

	public CommunityConversation clickStrtConv() throws Exception {
		click(lnkStrtConv,Waits.CLICKABLE,"Start a conversation");
		return this;

	}

	public CommunityConversation enterTitle(String title) throws Exception {
		sendKeys(txtTitle, title, Waits.PRESENCE, title);
		return this;
	}

	public CommunityConversation enterDescr(String body) throws Exception {
		DriverManager.getDriver().switchTo().frame(0);
		sendKeys(txtBody, body, Waits.PRESENCE, body);
		DriverManager.getDriver().switchTo().defaultContent();
		return this;
	}

	public CommunityConversation clickPost() throws Exception {
		clickByJavaScript(lnkPost,Waits.CLICKABLE,"Post");
		clickByJavaScript(lnkPost,Waits.CLICKABLE,"Post");
		return this;

	}

	public String getConvTitle() {
		return DriverManager.getDriver().findElement(txtConvTitle).getText();

	}

	public String getLatestConvTitle() {
		return DriverManager.getDriver().findElement(txtLatestConvTitle).getText();

	}
	
	

}
