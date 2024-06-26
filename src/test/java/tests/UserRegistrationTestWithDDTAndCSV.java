package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;


public class UserRegistrationTestWithDDTAndCSV extends TestBase
{
	
	HomePage homeObject;
	UserRegistrationPage registerObject;
	LoginPage loginObject;
	
	CSVReader reader;
	
	
	@Test(priority = 1, alwaysRun = true)
	public void UserCanRegisterSuccessfully() throws CsvValidationException, IOException
	{
		
		// Get Path of CSV file
		String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/UserData.csv";
		reader = new CSVReader(new FileReader(CSV_file));
		
		String[] csvCell;
		
		// While loop will be executed till the last value in CSV_file
		while((csvCell = reader.readNext()) != null)
		{
			String firstname = csvCell[0];
			String lastname = csvCell[1];
			String email = csvCell[2];
			String password = csvCell[3];
			
			homeObject = new HomePage(driver);
			homeObject.openRegisterationPage();
			registerObject = new UserRegistrationPage(driver);
			registerObject.userRegisteration(firstname,lastname,email,password);
			Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
			registerObject.userLogout();
			homeObject.openLoginPage();
			loginObject= new LoginPage(driver);
			loginObject.userlogin(email,password);
		    Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
		    registerObject.userLogout();
		}
		}
}
