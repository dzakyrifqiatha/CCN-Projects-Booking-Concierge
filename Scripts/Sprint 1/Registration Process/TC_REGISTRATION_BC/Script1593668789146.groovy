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
WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-2-email-address'), var_email)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-3-name'), var_name)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-4-password'), var_pass)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-5-confirm-password'), var_passconf)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-6-company'), var_company)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-7-contact-no'), var_contactno)

WebUI.click(findTestObject('Page_Register Booking Concierge/span_Save'))

WebUI.delay(3)

if (WebUI.verifyTextPresent('User with this email address exists', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Email in use', 'Yes')
} else if (WebUI.verifyTextPresent('Invalid email format. Use test@test.com.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Email format', 'Yes')
} else if (WebUI.verifyTextPresent('Name allowed only alphabets, numbers and space.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Name', 'Yes')
} else if (WebUI.verifyTextPresent('This field is required.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Password empty', 'Yes')
} else if (WebUI.verifyTextPresent('Phone number allowed only 25 numeric characters and \'+\' for first character only.', 
    false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Phone Number Invalid', 'Yes')
}

WebUI.refresh()

'Registration failed - email in use'
WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-2-email-address'), var_email)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-3-name'), var_name)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-4-password'), var_pass)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-5-confirm-password'), var_passconf)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-6-company'), var_company)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-7-contact-no'), var_contactno)

WebUI.click(findTestObject('Page_Register Booking Concierge/span_Save'))

WebUI.delay(3)

if (WebUI.verifyTextPresent('User with this email address exists', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Email in use', 'Yes')
}

WebUI.refresh()

'Registration successful'
WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-2-email-address'), var_email)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-3-name'), var_name)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-4-password'), var_pass)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-5-confirm-password'), var_confpass)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-6-company'), var_company)

WebUI.setText(findTestObject('Page_Register Booking Concierge/input__mat-input-7-contact-no'), var_contactno)

WebUI.click(findTestObject('Page_Register Booking Concierge/span_Save'))

/*WebUI.verifyTextPresent('Your Booking Concierge Account has been created. Please check your registered email account for the activation steps.  We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.', 
    false)*/
WebUI.delay(3)

if (WebUI.verifyTextPresent('Your Booking Concierge Account has been created. Please check your registered email account for the activation steps.  We recommend checking your spam or junk folder if you do not see the email, and mark Booking Concierge as a safe sender.', 
    false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Successful', 'Yes')
} else {
    if (WebUI.verifyTextPresent('User with this email address exists', false)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Email in use', 'Yes')
    } else if (WebUI.verifyTextPresent('Invalid email format. Use test@test.com.', false)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Email format', 'Yes')
    } else if (WebUI.verifyTextPresent('Name allowed only alphabets, numbers and space.', false)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Invalid Name', 'Yes')
    } else if (WebUI.verifyTextPresent('This field is required.', false)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Password empty', 'Yes')
    } else if (WebUI.verifyTextPresent('Phone number allowed only 25 numeric characters and \'+\' for first character only.', 
        false)) {
        CustomKeywords.'ccnpackage.LogResults.searchresult'('Registration Failed - Phone Number Invalid', 'Yes')
    }
}

WebUI.takeScreenshot()

