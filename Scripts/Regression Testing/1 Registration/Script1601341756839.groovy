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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.maximizeWindow()
WebUI.click(findTestObject('Page_Booking Concierge/a_here'), FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), Reg_Email)
WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), Reg_Name)
WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), Reg_Password)
WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), Reg_ConfPassword)
WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), Reg_Company)
WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), Reg_Contact)
WebUI.focus(findTestObject('Page_BC Register Page/button_Save (Register)'))
WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'), FailureHandling.OPTIONAL)
//WebUI.delay(3)
if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 3,
	FailureHandling.OPTIONAL)) {
WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), findTestData('Regression').getValue(
	'Reg_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
} else
{
save_disabled = WebUI.getAttribute(findTestObject('Page_Register Booking Concierge/span_Save'), 'disabled', FailureHandling.OPTIONAL)

if (save_disabled == 'true')  {
    if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), 1, 
        FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), findTestData(
                'Regression').getValue('Reg_popup_invalid_email', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/verify_name'), 1, FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_name'), findTestData(
                'Regression').getValue('Reg_popup_invalid_name', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/verify_password'), 1, FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_password'), findTestData(
                'Regression').getValue('Reg_popup_invalid_password', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/verify_contact'), 1, FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_contact'), findTestData(
                'Regression').getValue('Reg_popup_invalid_contact', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
    }
	}
}
WebUI.click(findTestObject('Page_BC Register Page/button_Cancel (Register)'))

