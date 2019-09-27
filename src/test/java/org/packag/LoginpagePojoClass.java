package org.packag;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefenition.BaseClass1;

public class LoginpagePojoClass extends BaseClass1{

	public LoginpagePojoClass() {
		PageFactory.initElements(driver, this);
	}
	//sign inlink
	@FindBy(linkText="Sign in")
	private WebElement signin;
	
	//signin email
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(id ="email")
	private WebElement userName;
	
	//signin password
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	//Signin submit button
	@FindBy(id = "SubmitLogin")
	private WebElement btn;
	public WebElement getBtn() {
		return btn;
	}
	
	//signup email
		public WebElement getsignupemail() {
			return signupemail;
		}
		@FindBy(xpath="//*[@id='email_create']")
		private WebElement signupemail;
	
	//sign up create an account button
		@FindBy(xpath="//*[@id='SubmitCreate']")
		private WebElement createsignupbtn;
		public WebElement getcreateBtn() {
			return createsignupbtn;
		}

		
		//reg firstname
		public WebElement getregFirstname() {
			return reguserName;
		}
		@FindBy(xpath="//*[@id='customer_firstname']")
		private WebElement reguserName;
		
		
	//reg lastname
		public WebElement getregLastname() {
			return reglastName;
		}
		@FindBy(xpath="//*[@id='customer_lastname']")
		private WebElement reglastName;
		
		
	//reg password
		public WebElement getregpassword() {
			return regpasswdName;
		}
		@FindBy(xpath="//*[@id='passwd']")
		private WebElement regpasswdName;
		
	//reg Address
		public WebElement getregaddress() {
			return regaddress;
		}
		@FindBy(xpath="//*[@id='address1']")
		private WebElement regaddress;
		
	//reg city
		public WebElement getregcity() {
			return regcity;
		}
		@FindBy(xpath="//*[@id='city']")
		private WebElement regcity;	
		
	//reg state
		public WebElement getstate() {
			return regstate;
		}
		@FindBy(xpath = "//select[contains(@name,'id_state')]")
		private WebElement regstate;
		
	//reg zip
		public WebElement getregzip() {
			return regzip;
		}
		@FindBy(xpath="//*[@id='postcode']")
		private WebElement regzip;	
		
	//reg country
		public WebElement getregcountry() {
			return regcountry;
		}
		@FindBy(xpath="//*[@id='id_country']")
		private WebElement regcountry;	

		
	//reg mobileno
		public WebElement getregmobileno() {
			return regmobileno;
		}
		@FindBy(xpath="//*[@id='phone_mobile']")
		private WebElement regmobileno;	
		
	//reg Address1
		public WebElement getregaddress1() {
			return regaddress1;
		}
		@FindBy(xpath="//*[@id='alias']")
		private WebElement regaddress1;
		
	//click on register button
			@FindBy(xpath="//*[@id='authentication']")
			private WebElement regbtn;
			public WebElement getSubmitregbtn() {
				return regbtn;
			}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
    @FindBy(xpath ="(//input[contains(@class,'is_required validate account_input form-control')])[2]")

	private WebElement email;


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

	
	@FindBy(id ="SubmitLogin")
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

	
	
	

	

	public WebElement sigin() {
		// TODO Auto-generated method stub
		return signin;
	}

}
