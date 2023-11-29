package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
 	By menue = By.id("menu-toggle");
 	By Home = By.xpath("//*[text()='Home']");
 	By Login = By.xpath("//*[text()='Login']");
 	By Username = By.id("txt-username");
 	By password = By.id("txt-password");
 	By loginButton = By.id("btn-login");
 	By MakeAppointment = By.id("btn-make-appointment");
 	
 	//By  = By.xpath("");
 	//By  = By.xpath("");
	
	
 	public void Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	public void ClickMenue() {
		driver.findElement(menue).click();
	}
	public void ClickHome() {
		driver.findElement(Home).click();
	}
	public void ClickLogin() {
		driver.findElement(Login).click();
	}
	public void InputUsername(String name) {
		 driver.findElement(Username).sendKeys(name);;
	}
	public void InputPassword(String pass) {
		 driver.findElement(password).sendKeys(pass);;
	}
	public void ClickLoginButton() {
		driver.findElement(loginButton).click();
	}
	public void ClickMakeAppointment() {
		driver.findElement(MakeAppointment).click();
	}
	
}	
	

