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

'Registration failed - check fields'
emailFailed = 'testfailed'

nameFailed = '@#@#@'

passwordFailed = ''

confirmPasswordFailed = ''

companyFailed = ''

contactNoFailed = 'sdkfns'

WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), emailFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), nameFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), passwordFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), confirmPasswordFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), companyFailed)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), contactNoFailed)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.delay(3)

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), 'Invalid email format. Use test@test.com.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Email Format', 'Yes')
} else if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_name'), 'Name allowed only alphabets, numbers and space')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Name format', 'Yes')
} else if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_password'), 'This field is required')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Password Empty', 'Yes')
} else if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), 'Phone number allowed only 25 numeric character and "+" for first character only')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Contact Number Format', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Failed - Check Field.png')

WebUI.refresh()

'Registration failed - email in use'
WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), var_email)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), var_name)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), var_pass)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), var_confpass)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), var_company)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), var_contactno)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

WebUI.delay(3)

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), 'User with this email address exists.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Email in use', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Failed - Email Existed.png')

WebUI.refresh()

emailSuccess = 'testingdevbcregre9@yopmail.com'

nameSuccess = 'Regression Testing 8'

passwordSuccess = 'password'

confirmPasswordSuccess = 'password'

companySuccess = 'Company Regression 8'

contactNoSuccess = '1231234558'

'Registration successful'
WebUI.setText(findTestObject('Page_BC Register Page/input_Email Address (Register)'), emailSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Name (Register)'), nameSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Password (Register)'), passwordSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Confirm Password (Register)'), confirmPasswordSuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Company (Register)'), companySuccess)

WebUI.setText(findTestObject('Page_BC Register Page/input_Contact no (Register)'), contactNoSuccess)

WebUI.click(findTestObject('Page_BC Register Page/button_Save (Register)'))

/*WebUI.verifyTextPresent('Your Booking Concierge Account has been created. Please check your registered email account for the activation steps.  We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.', 
    false)*/
WebUI.delay(5)

//alertText = WebUI.getAlertText()
//
//WebUI.verifyMatch(alertText, 'Your Booking Concierge Account has been created. Please check your registered email account for the activation steps.  We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.', false)
if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Your account has been created. Please check your registered email account for the activation steps. We recommend checking your spam or junk folder if you do not see the email, and mark us as a safe sender.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Successful', 'Yes')
}

// else {
//    if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/verify_email format'), 'User with this email address exists')) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Email in use', 'Yes')
//    } else if (WebUI.verifyTextPresent('Invalid email format. Use test@test.com.', false)) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Email format', 'Yes')
//    } else if (WebUI.verifyTextPresent('Name allowed only alphabets, numbers and space.', false)) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Name', 'Yes')
//    } else if (WebUI.verifyTextPresent('This field is required.', false)) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Password empty', 'Yes')
//    } else if (WebUI.verifyTextPresent('Phone number allowed only 25 numeric characters and \'+\' for first character only.', 
//        false)) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Phone Number Invalid', 'Yes')
//    }
//}
WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 1\\Registration Success.png')

