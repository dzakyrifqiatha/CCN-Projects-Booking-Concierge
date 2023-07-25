package airline
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
import org.openqa.selenium.Keys as Keys
import java.awt.event.KeyEvent

//import prerequisites.login

class create_new_airline_email{

	@Given("agent on Create New Airline page")
	def agent_on_create_airline_page() {
		//		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/NewAirline_page'),0)
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'))
	}

	@And("agent input (.*) on Carrier Code field")
	def input_carrier_code(String carrier_code) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'), carrier_code)
		WebUI.sendKeys(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'), Keys.chord(Keys.TAB))
	}

	@And("agent input (.*) on Carrier Prefix field")
	def input_carrier_prefix(String carrier_prefix) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierPrefix'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierPrefix'), carrier_prefix)
		WebUI.sendKeys(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierPrefix'), Keys.chord(Keys.TAB))
	}

	@And("agent input (.*) on Station field")
	def input_station_field(String station) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__station'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__station'), station)
	}

	@And("agent input (.*) on Airline Email field")
	def input_airline_email(String airline_email) {
		WebUI.setText(findTestObject('Object Repository/number_of_packages_UNID'), airline_email)
		WebUI.sendKeys(findTestObject('Object Repository/number_of_packages_UNID'), Keys.chord(Keys.TAB))
	}

	@When("agent click Save button")
	def agent_save_new_airline() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/save_airline'))
	}

	@Then("agent successfully create a new airline for email send mode")
	def agent_create_airline() {
		//		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/div_Airline has been created successfully'),0)
		//		WebUI.verifyTextPresent(carrier_prefix, false)
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/header_My Airline'),0)
	}

	//	@Then("agent see successful message (.*) displaying for email send mode")
	//	def agent_see_successful_message_email(int carrier_prefix) {
	//		WebUI.verifyElementText((findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/div_Airline has been created successfully')), success_alert_email)
	//	}
}