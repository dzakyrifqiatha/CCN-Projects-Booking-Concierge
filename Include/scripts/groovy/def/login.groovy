package def
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("agent is on login page")
	def Agent_on_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://bcportaladmin.ppd.ccn/main')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/login_button'))
	}

	@And("agent input valid email(.*)")
	def Input_valid_email(String email) {
		WebUI.click(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/input_email'))
		WebUI.setText(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/input_email'), email.trim())
	}
	
	@And("agent input valid password(.*)")
	def Input_valid_password(String password) {
		WebUI.click(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/input_password'))
		WebUI.setText(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/input_password'), password.trim())
	}

	@When("agent click sign in button")
	def click_sign_in() {
		WebUI.click(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/span_inputlogin'))
	}

	@Then("agent see booking concierge logo in the dashboard")
	def bc_logo_visible() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/Page_Sign up or sign in/Page_BcAdminApp/BC_logo'),0)
	}
}