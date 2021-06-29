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

'Scenario 2 - User with invalid email address request for forget password'
WebUI.click(findTestObject('Page_BC Common Login Page/button_Forgot password (Common Login)'))

WebUI.setText(findTestObject('Page_BC Forgot Password/input_Email Address (Forgot Password)'), '')

WebUI.click(findTestObject('Page_BC Forgot Password/button_Send (Forgot Password)'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'The email address entered is invali. Please sign up now.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Registered Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5433\\SN 2 - Invalid email address.png')

WebUI.refresh()

'Scenario 1 - User with valid email address request for forget password'
WebUI.setText(findTestObject('Page_BC Forgot Password/input_Email Address (Forgot Password)'), '')

WebUI.click(findTestObject('Page_BC Forgot Password/button_Send (Forgot Password)'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'A message has been sent to the email address provided for password reset.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Registered Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5433\\SN 2 - email sent.png')

