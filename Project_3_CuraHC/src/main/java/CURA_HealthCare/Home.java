package CURA_HealthCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePage;
import PageClasses.appointment;
 

public class Home extends BaseClass {
	WebDriver driver;
	HomePage HomePage;
	appointment appointment;

	
	@Test(priority = 0)
	public void HomePage() {
		
		HomePage.Dashboard(driver);
		HomePage.ClickMenue();
		HomePage.ClickHome();
		String str= driver.getCurrentUrl();
		String expUrl="https://katalon-demo-cura.herokuapp.com/";
		Assert.assertEquals(str, expUrl,"[**HomePageIsNotVissible**]");
		System.out.println("home page is visible successfully\n");
	}
	@Test(priority = 1)
	public void MakeAppointment() {
		
		HomePage.Dashboard(driver);
		HomePage.ClickMakeAppointment();
		String str= driver.getCurrentUrl();
		String expUrl="https://katalon-demo-cura.herokuapp.com/profile.php#login";
		Assert.assertEquals(str, expUrl,"[**LoginPageIsNotVissible**]");
		System.out.println("Reached Login page\n");
	}
	
	@Test(priority = 2)
	public void Login() {
		
		HomePage.Dashboard(driver);
		HomePage.ClickMenue();
		HomePage.ClickLogin();
		String str= driver.getCurrentUrl();
		String expUrl="https://katalon-demo-cura.herokuapp.com/profile.php#login";
		Assert.assertEquals(str, expUrl,"[**LoginPageIsNotVissible**]");
		System.out.println("Login page is visible successfully\n");
		
		HomePage.InputUsername("John Doe");
		HomePage.InputPassword("ThisIsNotAPassword");
		HomePage.ClickLoginButton(); 
}

	
	@Test(priority = 3)
	public void Appointment() {
		
		appointment.Dashboard(driver);
		
		WebElement Facility = appointment.facilities();
		Select obj = new Select(Facility);
		obj.selectByVisibleText("Hongkong CURA Healthcare Center");
		
		appointment.Clickreadmission();
		appointment.ChooseHealthcare_Program();
		appointment.InputVisitDate("05/12/2023");
		appointment.Inputcomment("xyz");
		appointment.ClickSubmit();
		
		String Str = appointment.AppConfirmation();
		System.out.println(Str+"\n");
		
		appointment.goTohomePage();
		String hp= driver.getCurrentUrl();
		String expUrl="https://katalon-demo-cura.herokuapp.com/";
		Assert.assertEquals(hp, expUrl,"[**HomePageIsNotVissible**]");
		System.out.println("home page is visible successfully\n");
		
	}















}
