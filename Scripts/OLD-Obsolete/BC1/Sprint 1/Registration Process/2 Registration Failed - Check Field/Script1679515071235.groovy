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

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), GlobalVariable.vEmailFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), GlobalVariable.vNameFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), GlobalVariable.vPasswordFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), GlobalVariable.vConfPasswordFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), GlobalVariable.vCompanyFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), GlobalVariable.vContactFailed)

WebUI.focus(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), ' Invalid email format. Use test@test.com. ', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_name'), ' Name allowed only alphabets, numbers and space. ', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_password'), 'This field is required. ', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_contact'), ' Phone number allowed only 25 numeric characters and \'+\' for first character only. ', 
    FailureHandling.OPTIONAL)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Failed - Check Field.png')

WebUI.click(findTestObject('Page_BC Register Page/button_Cancel (Register)'))

