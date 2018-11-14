package PageFactrory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmailRegsPageFactrory {
WebDriver driver;

@FindBy(name="txtUName")
WebElement uName;

@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="txtConfPassword")
WebElement confirm;
@FindBy(id="txtFirstName")
WebElement fName;
@FindBy(name="txtLN")
WebElement lName;
@FindBy(id="DOB")
WebElement date;
@FindBy(id="txtEmail")
WebElement email;

public WebElement getDate() {
	return date;
}
public void setDate(String Udate) {
	date.sendKeys(Udate);
}
public WebElement getEmail() {
	return email;
}
public void setEmail(String Uemail) {
	email.sendKeys(Uemail);
}



@FindBy(id="txtAddress")
WebElement address;

@FindBy(name="City")
WebElement city;


@FindBy(name="Phone")
WebElement number;
@FindBy(name="chkHobbies")
WebElement hobbies;

@FindBy(name="submit")
WebElement sub;

@FindBy(name="reset")
WebElement rest;

@FindBy(name="gender")
WebElement radio;
public WebElement getRadio() {
	return radio;
}
public EmailRegsPageFactrory(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


public void setRadio(String gradio) {

if(gradio.equals("male")) {
	radio.findElement(By.xpath("//*[@id='rbMale']")).click();
}
else
	radio.findElement(By.xpath("//*[@id='rbFemale']")).click();
}


public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getuName() {
	return uName;
}

public void setuName(String fuName) {
	uName.sendKeys(fuName);
}

public WebElement getPassword() {
	return password;
}

public void setPassword(String fpassword) {
	password.sendKeys(fpassword); 
}

public WebElement getConfirm() {
	return confirm;
}

public void setConfirm(String fconfirm) {
	confirm.sendKeys(fconfirm); 
}

public WebElement getfName() {
	return fName;
}

public void setfName(String fNames) {
	fName.sendKeys(fNames);
}

public WebElement getlName() {
	return lName;
}

public void setlName(String lNames) {
lName.sendKeys(lNames); 
}

public WebElement getAddress() {
	return address;
}

public void setAddress(String faddress) {
	address.sendKeys(faddress);
}

public WebElement getCity() {
	return city;
}

public void setCity(String ucity) {
	
	Select sele = new Select(city);
	sele.selectByValue(ucity);
}
	

public WebElement getNumber() {
	return number;
}

public void setNumber(String Mnumber) {
	number.sendKeys(Mnumber); 
}

public WebElement getHobbies() {
	return hobbies;
}

public void setHobbies(String Uhobbies) {
	if(Uhobbies.equals("Music")) {
		hobbies.findElement(By.xpath("//*[@id='hb1']")).click();
	}
	else if(Uhobbies.equals("Reading"))
		hobbies.findElement(By.xpath("//*[@id='hb2']")).click();
	else if (Uhobbies.equals("Movies"))
		hobbies.findElement(By.xpath("//*[@id='hb3']")).click();
	}




public void setSub() {
	sub.click();
}



public void setRest() {
	rest.click();
}



}
