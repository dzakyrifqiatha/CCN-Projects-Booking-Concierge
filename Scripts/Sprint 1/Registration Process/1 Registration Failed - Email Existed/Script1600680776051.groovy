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

WebUI.click(findTestObject('Page_Booking Concierge/a_here'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), GlobalVariable.vEmailExisted)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), GlobalVariable.vNameExisted)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), GlobalVariable.vPasswordExisted)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), GlobalVariable.vConfPasswordExisted)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), GlobalVariable.vCompanyExisted)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), GlobalVariable.vContactExisted)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'User with this email address exists.')

not_run: WebUI.verifyTextPresent('User with this email address exists', false)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Failed - Email Existed.png')

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Register Page/button_Cancel (Register)'))

