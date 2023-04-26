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

'Scenario 4 - User key in not matched text in Password Reset'
WebUI.setText(findTestObject('Page_BC Forgot Password/input_Password (Forgot Password)'), '')

WebUI.setText(findTestObject('Page_BC Forgot Password/input_Confirm Password (Forgot Password)'), '')

if (WebUI.verifyElementText(findTestObject('Page_BC Forgot Password/span_Password do not match'), 'Password do not match')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Password do not match', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5433\\SN 4 - Password do not match.png')

WebUI.refresh()

'Scenario 3 - User key in matched text in Password Reset'
WebUI.setText(findTestObject('Page_BC Forgot Password/input_Password (Forgot Password)'), '')

WebUI.setText(findTestObject('Page_BC Forgot Password/input_Confirm Password (Forgot Password)'), '')

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Password reset successful.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Reset Password Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5433\\SN 3 - Reset Password Success.png')


