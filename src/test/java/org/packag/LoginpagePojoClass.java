package org.packag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefenition.BaseClass1;

public class LoginpagePojoClass extends BaseClass1{

	public LoginpagePojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")

	private WebElement userName;

	@FindBy(id = "pass")

	private WebElement password;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnamefb;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnamefb;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobilenofb;

	@FindBy(xpath="	//input[@name='reg_passwd__']")
	private WebElement newpassfb;
	
	//input[@value='2']
	@FindBy(xpath="	//input[@value='2']")
	private WebElement sexfb;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement submitfb;
	
	public WebElement getSubmitfb() {
		return submitfb;
	}

	public void setSubmitfb(WebElement submitfb) {
		this.submitfb = submitfb;
	}

	public WebElement getDayfb() {
		return dayfb;
	}

	public void setDayfb(WebElement dayfb) {
		this.dayfb = dayfb;
	}

	public WebElement getMonthfb() {
		return monthfb;
	}

	public void setMonthfb(WebElement monthfb) {
		this.monthfb = monthfb;
	}

	public WebElement getYearfb() {
		return yearfb;
	}

	public void setYearfb(WebElement yearfb) {
		this.yearfb = yearfb;
	}

	@FindBy(xpath="//select[@id='day']")
	private WebElement dayfb;
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthfb;
	@FindBy(xpath="//select[@id='year']")
	private WebElement yearfb;
public WebElement getFirstnamefb() {
		return firstnamefb;
	}

	public void setFirstnamefb(WebElement firstnamefb) {
		this.firstnamefb = firstnamefb;
	}

	public WebElement getLastnamefb() {
		return lastnamefb;
	}

	public void setLastnamefb(WebElement lastnamefb) {
		this.lastnamefb = lastnamefb;
	}

	public WebElement getMobilenofb() {
		return mobilenofb;
	}

	public void setMobilenofb(WebElement mobilenofb) {
		this.mobilenofb = mobilenofb;
	}

	public WebElement getNewpassfb() {
		return newpassfb;
	}

	public void setNewpassfb(WebElement newpassfb) {
		this.newpassfb = newpassfb;
	}

	public WebElement getSexfb() {
		return sexfb;
	}

	public void setSexfb(WebElement sexfb) {
		this.sexfb = sexfb;
	}

@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
private WebElement flipkartpopupclose;
@FindBy(xpath="//input[@class='LM6RPg']")
private WebElement searchboxflip;
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
private WebElement searchpro;
	public WebElement getSearchpro() {
	return searchpro;
}

public void setSearchpro(WebElement searchpro) {
	this.searchpro = searchpro;
}

	public WebElement getSearchboxflip() {
	return searchboxflip;
}

public void setSearchboxflip(WebElement searchboxflip) {
	this.searchboxflip = searchboxflip;
}

	public WebElement getFlipkartpopupclose() {
	return flipkartpopupclose;
}

public void setFlipkartpopupclose(WebElement flipkartpopupclose) {
	this.flipkartpopupclose = flipkartpopupclose;
}

public void setClosepopup(WebElement closepopup) {
	this.closepopup = closepopup;
}

	@FindBy(id = "loginbutton")
	private WebElement btn;
	@FindBy(xpath ="//button[@class='_2AkmmA _29YdH8']")
	private WebElement closepopup;
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement amazonsearch;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement iphone;
	
    
	public WebElement getIphone() {
		return iphone;
	}

	public void setIphone(WebElement iphone) {
		this.iphone = iphone;
	}

	public WebElement getAmazonsearch() {
		return amazonsearch;
	}

	public void setAmazonsearch(WebElement amazonsearch) {
		this.amazonsearch = amazonsearch;
	}

	@FindBy(xpath = "//input[@class='core-input ng-valid ng-empty ng-dirty ng-valid-parse ng-touched']")
	private WebElement fromflight;
	
	@FindBy(xpath ="//input[@class='core-input ng-pristine ng-valid ng-empty ng-touched']")
	private WebElement toflight;
 @FindBy(xpath="//input[@class='yyyy date-input-2 ng-dirty ng-touched ng-empty']")
 private WebElement startdate;
 
 
	public WebElement getStartdate() {
	return startdate;
}

public void setStartdate(WebElement startdate) {
	this.startdate = startdate;
}

	public WebElement getFromflight() {
		return fromflight;
	}

	public void setFromflight(WebElement fromflight) {
		this.fromflight = fromflight;
	}

	public WebElement getToflight() {
		return toflight;
	}

	public void setToflight(WebElement toflight) {
		this.toflight = toflight;
	}
	

	public WebElement getClosepopup() {
		return closepopup;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}

}
