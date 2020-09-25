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

'Scenario 2 - Existing User click on BC URL to register'
WebUI.click(findTestObject('Page_BC Common Login Page/a_here (Common Login - Register)'))

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), vEmail1)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), vName1)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), vPass1)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), vConfPass1)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), vCompany1)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), vContact1)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'User with this email address exists')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registered Failed', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5430\\SN 2 - Existing User.png')

'Scenario 1 - New User click on BC URL to register'
WebUI.click(findTestObject('Page_BC Common Login Page/a_here (Common Login - Register)'))

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), vEmail2)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), vName2)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), vPass2)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), vConfPass2)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), vCompany2)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), vContact2)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Your account has been created. Please check you registered email account for the activation steps. We recommend checking your spam or junk folder if you do not see the email, and mark us as a safe sender.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registered Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5430\\SN 2 - New User.png')

