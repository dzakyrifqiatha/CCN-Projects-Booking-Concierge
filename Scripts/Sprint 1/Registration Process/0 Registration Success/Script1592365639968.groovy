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

'Run Login Test Case under the Authentication Login folder first'
WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), GlobalVariable.vEmailSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), GlobalVariable.vNameSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), GlobalVariable.vPasswordSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), GlobalVariable.vConfPasswordSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), GlobalVariable.vCompanySuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), GlobalVariable.vContactSuccess)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Your account has been created. Please check your registered email account for the activation steps. We recommend checking your spam or junk folder if you do not see the email, and mark us as a safe sender.')

not_run: WebUI.verifyTextPresent('Your Booking Concierge Account has been created. Please check your registered email account for the activation steps.  We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.', 
    false)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Success.png')

