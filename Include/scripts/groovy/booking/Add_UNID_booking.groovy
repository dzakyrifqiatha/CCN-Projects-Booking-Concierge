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
import org.openqa.selenium.Keys as Keys


class Add_UNID_booking {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("agent click add dangerous goods details")
	def agent_click_add_UNID() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Operational_bx bx-search'))
	}

	// why is proper shipping name field is set to receive CAPS, but it can not detect the name written in CAPS
	@And("agent input UNID details (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def input_UNID_details(int UNID, String ProperShippingName, String PG, int PI, int TI, int NoOfPackages, int QtyPerPackages) {
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_UNID_unidSerNum'), UNID)
		WebUI.sendKeys(findTestObject('Input'), Keys.chord('Text String',Keys.ENTER,Keys.TAB))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Proper Shipping Name_properShippingName'))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/li_Benzaldehyde'))
		//		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Proper Shipping Name_properShippingName'), ProperShippingName)

		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_PG_packingGroup'))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/PG_III'))
		//		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_PG_packingGroup'), PG)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Qty_packages_UNID'), PI)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_TI_transportIndex'), TI)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_No of Packages_numberOfPackages'), NoOfPackages)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Qty Per Package_netQuantityPerPackage'), QtyPerPackages)
	}

	@When("agent click Save Dangerous Goods button")
	def agent_save_DGR() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))
	}

	// (!) unable to move forward regarding package unit error
	@Then("agent see dangerous goods details populated on Dangerous Goods Section")
	def verify_DGR(int UNID) {
		WebUI.verifyTextPresent(UNID, false)
	}
}