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



class Add_ULD_Booking {
	@Given("agent click add ULD button")
	def agent_click_ULD_button() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Operational_bx bx-search'))
	}

	// can not input ULDContour manually, since the field does not accept comma
	@And("agent input ULD details (.*), (.*), (.*), (.*), (.*)")
	def agent_input_ULD_details(String ULDType, int ULDCountour, int NumOfULD, int WeightPerULD, String CommodityCodeULD) {
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Type_uld'), ULDType)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Contour_contour'), ULDCountour)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Num of ULD_number'), NumOfULD)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Weight Per ULD (kg)_weight'), WeightPerULD)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Code_commodityCode'), CommodityCodeULD)
	}

	@When("agent click Save uld button")
	def agent_save_uld() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Save_1'))
	}

	@Then("agent see ULD details populated in ULD section")
	def agent_verify_ULD() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/Booking/td_FLA'),0)
	}
}