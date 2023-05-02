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



class new_airline_both {
	@Given("agent on Create New Airline page for both")
	def agent_on_create_airline_page_both() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/CreateAirline_button'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/NewAirline_page'),0)
	}

	@And("agent input (.*) on Carrier Code field for both")
	def input_carrier_code_both(String carrier_code_both) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierCode'), carrier_code_both)
	}

	@And("agent input (.*) on Carrier Prefix field for both")
	def input_carrier_prefix_both(String carrier_prefix_both) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierPrefix'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__carrierPrefix'), carrier_prefix_both)
	}

	@And("agent input (.*) on Station field for both")
	def input_station_field_both(String station_both) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__station'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/input__station'), station_both)
	}

	@When("agent click Save button for both")
	def agent_save_new_airline_both() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/save_airline'))
	}

	@Then("agent successfully create a new airline for both")
	def agent_create_airline_both() {
		//		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/create_airline_success_status'),0)
//		WebUI.verifyTextPresent(carrier_prefix_both, false)
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/header_My Airline'),0)
	}

	//	@Then("agent see (.*) displaying for both airline creation")
	//	def agent_see_successful_message_both(String message_both) {
	//		WebUI.verifyElementText((findTestObject('Object Repository/NEW/dev_BC/MyAirline/create_airline/create_airline_success_status')), message_both)
	//	}
}