package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegisterPageObj;
import utility.DriverUtility;
public class RegisterStepDefination extends Base {
	RegisterPageObj registerPageObj = new RegisterPageObj();
	@When("^User click on Register$")
	public void user_click_on_Register() throws Throwable {
		try {
			registerPageObj.clickOnRegister();
			logger.info("click on Register");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();
	}
	@When("^User fills Register form with below information$")
	public void user_fills_Register_form_with_below_information(DataTable personalInfo) throws Throwable {
//		List<List<String>> dataValues = personalInfo.raw();
//		registerPageObj.enterFNameValue(dataValues.get(0).get(0));
//		registerPageObj.enterLNameValue(dataValues.get(0).get(1));
//		registerPageObj.enterEmailValue(dataValues.get(0).get(2));
//		registerPageObj.enterTelephoneValue(dataValues.get(0).get(3));
//		registerPageObj.enterpasswordValue(dataValues.get(0).get(4));
//		registerPageObj.enterConfirmPassValue(dataValues.get(0).get(4));
		
		List<Map<String, String>> datavalues = personalInfo.asMaps(String.class, String.class);
		registerPageObj.enterFNameValue(datavalues.get(0).get("firstname"));
		registerPageObj.enterLNameValue(datavalues.get(0).get("lastName"));
	    registerPageObj.enterEmailValue(datavalues.get(0).get("E-mail"));
		registerPageObj.enterTelephoneValue(datavalues.get(0).get("Telephone"));
		registerPageObj.enterpasswordValue(datavalues.get(0).get("Password"));
		logger.info("Register Form Was filled successfully ");
	}
	@When("^User select '(.+)' for Subscribe$")
	public void user_select_yes_for_Subscribe(String yesNo) throws Throwable {
		if (yesNo.equalsIgnoreCase("yes")) {
			if(registerPageObj.noIsSelected()) {
				registerPageObj.selectYesonSubscribe();
				logger.info("Yes to subscribe is selected");
			}
		}else {
			if(!registerPageObj.noIsSelected()) {
				registerPageObj.selectYesonSubscribe(); 
				logger.info("No to subscribe is selected");
			}
		}
	}
	@When("^User click privacy and policy button$")
	public void user_click_privacy_and_policy_button() throws Throwable {
		Assert.assertTrue(registerPageObj.isPrivacyPolicyDisplayed());
		registerPageObj.clickonPrivacyPolicy();
		logger.info("privacy plicy is selected");
		DriverUtility.screenShot();
	}
	@When("^User click Continue button$")
	public void user_click_Continue_button() throws Throwable {
		try {
			registerPageObj.clickonContinueButtonREG();
			logger.info("continue Button clicked");
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	@Then("^User should see message  '(.+)'$")
	public void user_should_see_message_Your_Account_Has_Been_Created(String message) throws Throwable {
		DriverUtility.wait(5000);
		Assert.assertEquals(registerPageObj.getSuccessfullAcctCreationMessage(),message);
		logger.info("Assertion passed");
		DriverUtility.screenShot();
	}
}