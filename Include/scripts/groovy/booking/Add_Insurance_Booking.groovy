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



class Add_Insurance_Booking {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("agent click add insurance button")
	def agent_click_add_insurance() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Operational_bx bx-search'))
	}
	@And("agent input insurance details (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def agent_add_insurance_details(String CommodityType, String GoodsDescription, int GoodsValue, String InsuranceCode, String InsuranceName, String InsuranceEmail, String InsuranceAddress, String InsuranceCity, String InsuranceState, String InsuranceCountry, int InsurancePostalCode) {
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Type_commodityType'), CommodityType)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_For insurance purpose_commodityDescription'), GoodsDescription)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Goods Value(SGD)_goodsValue'), GoodsValue)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code_1'), InsuranceCode)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name_1'), InsuranceName)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address_1'), InsuranceAddress)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city_1'), InsuranceCity)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state_1'), InsuranceState)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country_1'), InsuranceCountry)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode_1'), InsurancePostalCode)
	}

	@When("agent click Save insurance button")
	def agent_click_save_insurance() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Get Quote'))
	}

	// (!) there is an error message. Something went wrong, please contact admin
	@Then("agent see insurance details populated on Insurance Section")
	def agent_see_insurance_details() {
		println status
	}
}