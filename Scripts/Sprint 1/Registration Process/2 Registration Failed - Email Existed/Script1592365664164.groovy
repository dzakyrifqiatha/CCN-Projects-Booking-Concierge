import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_Booking Concierge/a_here'))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-2-email-address'), findTestData('Registration/TestData_Registration').getValue(
        1, 3))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-3-name'), findTestData('Registration/TestData_Registration').getValue(
        2, 3))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-4-password'), findTestData('Registration/TestData_Registration').getValue(
        3, 3))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-5-confirm-password'), findTestData('Registration/TestData_Registration').getValue(
        4, 3))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-6-company'), findTestData('Registration/TestData_Registration').getValue(
        5, 3))

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-7-contact-no'), findTestData('Registration/TestData_Registration').getValue(
        6, 3))

WebUI.click(findTestObject('Page_Register Booking Concierge/span_Save'))

WebUI.verifyTextPresent('User with this email address exists', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Register Booking Concierge/span_Cancel'))

