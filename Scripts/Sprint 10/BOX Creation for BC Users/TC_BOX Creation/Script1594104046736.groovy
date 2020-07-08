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

'User Account not validated'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.delay(5)

if (WebUI.verifyElementNotClickable(findTestObject('Page_Booking Concierge/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Sign in button unclickable', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 2\\Login Failed - Without Password.png')

WebUI.refresh()

'LINC User Migrate to BC where BOX not created'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), 'tdasdjajd@yahoo.com')

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), 'password')

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

WebUI.delay(5)

if (WebUI.verifyTextPresent('A user with such email does not exist. Enter the correct email or sign up.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Email Not Registered', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 2\\Login Failed - Email Not Registered.png')

WebUI.refresh()

'LINC User with BC Account where BOX has been created'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), 'testest')

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), 'password')

WebUI.delay(5)

if (WebUI.verifyElementNotClickable(findTestObject('Page_Booking Concierge/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Sign in button unclickable', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 2\\Login Failed - Invalid Email Format.png')

WebUI.refresh()

'New Booking Concierge User'
WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), var_username)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), var_password)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

WebUI.delay(10)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge/h1_My Bookings'), 'My Bookings')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success', 'Yes')
}

//else {
//    if (WebUI.verifyTextPresent('User with this email address exists', false)) {
//        CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - Email Existed', 'No')
//    }
//}
WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 2\\Login Success.png')

