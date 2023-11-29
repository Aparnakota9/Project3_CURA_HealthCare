package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class appointment {
	WebDriver driver;
 	By facility = By.id("combo_facility");
 	By readmission = By.id("chk_hospotal_readmission");
 	By VisitDate = By.id("txt_visit_date");
 	By Comment = By.id("txt_comment");
 	By submit = By.id("btn-book-appointment");
 	By Healthcare_Program  = By.id("radio_program_medicare");
 	By Confirmation = By.id("summary");
 	By goTohomePage  = By.xpath("//*[text()='Go to Homepage']");
 	
 	public void Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement facilities() {
		return driver.findElement(facility);
	}
	public void Clickreadmission() {
		 driver.findElement(readmission).click();
		 }
	public void ChooseHealthcare_Program() {
		 driver.findElement(Healthcare_Program);
		 }
	
	public void InputVisitDate(String date) {
		 driver.findElement(VisitDate).sendKeys(date);;
	}
	public void Inputcomment(String comment) {
		 driver.findElement(Comment).sendKeys(comment);
	}
	public void ClickSubmit() {
		 driver.findElement(submit).click();
	}
	public String AppConfirmation() {
		 return driver.findElement(Confirmation).getText();
	}
	public void goTohomePage() {
		 driver.findElement(goTohomePage).click();
		 }
	
}
