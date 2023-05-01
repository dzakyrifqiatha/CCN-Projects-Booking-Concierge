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



class New_Booking_All {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("agent go to Create New Booking page")
	def agent_go_to_create_booking() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_My Airlines_theme-module_form-control_714185'))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_New Booking'))
	}

	@When("agent input booking details(.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def agent_input_awb_prefix(int AWBPrefix, String Origin, String Destination, String GoodsDesc, int Pieces, int Weight, int Volume, String CommodityInfo) {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input__awbPrefix'))
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__awbPrefix'), AWBPrefix)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__origin'), Origin)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__destination'), Destination)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__goodsDescription'), GoodsDesc)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__pieces'), Pieces)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__weight'), Weight)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__volume'), Volume)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__commodityInfo'), CommodityInfo)
	}

	@And("agent select AWB Suffix from the AWB Stock list")
	def agent_select_AWB_suffix() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Dangerous Goods Information_bx bx-plus'))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_77777781'))
	}

	@Then("agent see AWB SUffix populated on AWB Suffix textfield")
	def populated_AWB_suffix() {
		WebUI.verifyTextPresent("77777781", false)
	}
}