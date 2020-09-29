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

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), Reg_Email)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), Reg_Name)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), Reg_Password)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), Reg_ConfPassword)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), Reg_Company)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), Reg_Contact)

WebUI.focus(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'), FailureHandling.OPTIONAL)

WebUI.delay(5)


d_Reg_popup = WebUI.getText(findTestObject('Page_Register Booking Concierge/verification/popup_success'))

if (d_Reg_popup == Reg_popup ) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup, 'Yes')
// if test case is register failed, check the other popup 	
	if (d_Reg_popup == 'xxxx' ) {	
		d_Reg_popup_invalid_email  = WebUI.getText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'))
		if (d_Reg_popup_invalid_email == Reg_popup_invalid_email ) {
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_email, 'Yes')
		} else
		{
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_email + ' - ' + d_Reg_popup_invalid_email, 'No')
		}
			
		d_Reg_popup_invalid_name  = WebUI.getText(findTestObject('Page_Register Booking Concierge/verification/verify_name'))
		if (d_Reg_popup_invalid_name == Reg_popup_invalid_name ) {
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_name, 'Yes')
		} else
		{
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_name + ' - ' + d_Reg_popup_invalid_name, 'No')
		}
		
		d_Reg_popup_invalid_password  = WebUI.getText(findTestObject('Page_Register Booking Concierge/verification/verify_password'))
		if (d_Reg_popup_invalid_password == Reg_popup_invalid_password ) {
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_password, 'Yes')
		} else
		{
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_password + ' - ' + d_Reg_popup_invalid_password, 'No')
		}
		
		d_Reg_popup_invalid_contact  = WebUI.getText(findTestObject('Page_Register Booking Concierge/verification/verify_contact'))
		if (d_Reg_popup_invalid_contact == Reg_popup_invalid_contact ) {
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_contact, 'Yes')
		} else
		{
			CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup_invalid_contact + ' - ' + d_Reg_popup_invalid_contact, 'No')
		}
		
	}
} else
{
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Test Response ' + Reg_popup, 'No')}



WebUI.click(findTestObject('Page_BC Register Page/button_Cancel (Register)'))

//WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), ' Invalid email format. Use test@test.com. ', 
//    FailureHandling.OPTIONAL)

//WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_name'), ' Name allowed only alphabets, numbers and space. ', 
//    FailureHandling.OPTIONAL)

//WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_password'), 'This field is required. ', 
//    FailureHandling.OPTIONAL)

//WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_contact'), ' Phone number allowed only 25 numeric characters and \'+\' for first character only. ', 
//    FailureHandling.OPTIONAL)

//WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Failed - Check Field.png')



