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



class Add_Cosignee_Booking {
	@Given("agent click add consignee button")
	def click_add_Cosignee() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Dangerous Goods Information_bx bx-plus'))
	}

	@And("agent input consignee info (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def agent_input_Cosignee_info(int CosigneeCode, int CosigneeAccountNo, String CosigneeName, String CosigneeAddress, String CosigneeCity, String CosigneeState, String CosigneeCountry, int CosigneePostalCode, int CosigneeContact, int CosigneeFax) {
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code'), CosigneeCode)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Account no_accountNo'), CosigneeAccountNo)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name'), CosigneeName)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address'), CosigneeAddress)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city'), CosigneeCity)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state'), CosigneeState)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country'), CosigneeCountry)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), CosigneePostalCode)

		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Contact No_contactNo'), CosigneeContact)
		WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Fax No_faxNo'), CosigneeFax)
	}

	@When("agent click Save Consignee button")
	def agent_click_save_Cosignee() {
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))
		WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Yes'))
	}

	@Then("agent see consignee details populated on Consignee Section")
	def agent_verify_Cosignee(int CosigneeCode) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Consignee is created successfully'),0)
		WebUI.verifyTextPresent(CosigneeCode, false)
	}
}