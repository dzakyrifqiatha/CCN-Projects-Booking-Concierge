package booking
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



class Add_flight_to_booking {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("agent click search flight button")
	def agent_click_flight_button() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_flights'))
	}

	@And("agent click Search button on Flight Schedule modals")
	def agent_click_search_flight() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Search'))
	}

	//fix in the future
	@When("agent select flight")
	def agent_select_flight() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_0956'))
	}

	//fix in the future
	@Then("agent see flight details populated on Flight Section")
	def agent_check_flight() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/td_SQ0956'))
	}
}