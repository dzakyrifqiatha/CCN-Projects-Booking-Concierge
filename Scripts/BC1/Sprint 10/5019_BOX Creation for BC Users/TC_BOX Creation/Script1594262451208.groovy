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

email_notValidated = 'testingdevbc1@gmail.com'

password_notValidated = 'password'

WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), email_notValidated)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password password'), password_notValidated)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success', 'A user with such email does not exist. Enter correct email or sign up.'), FailureHandling.CONTINUE_ON_FAILURE)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Failed - User Account not Validated', 'Yes')
	WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Scenario 1 - Success.png')
}

WebUI.refresh()

'LINC User Migrate to BC where BOX not created'

email_migrate = 'testingdevbc2@gmail.com'\

password_migrate = 'password'

WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), email_migrate)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), password_migrate)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

if (WebUI.verifyTextPresent('Please wait a moment while your Booking Concierge starts up.', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success - LINC User Successfully migrated and BOX URL created', 'Yes')
	WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Scenario 2 & 3 - Success.png')
}

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.delay(3)

WebUI.refresh()

'LINC User with BC Account where BOX has been created'

email_existing_box = 'yoongfui@hotmail.com'

password_existing_box = 'password'

WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), email_existing_box)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), password_existing_box)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

WebUI.delay(1)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge/h1_My Bookings'), 'My Bookings')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success', 'Yes')
	WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Scenario 4 - Success.png')
}

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.refresh()

'New Booking Concierge User'

email_newUser = ''

password_newUser = 'password'

WebUI.setText(findTestObject('Page_Booking Concierge/input_Email Address_email'), email_newUser)

WebUI.setText(findTestObject('Page_Booking Concierge/input_Password_password'), password_newUser)

WebUI.click(findTestObject('Page_Booking Concierge/button_Sign in'))

WebUI.delay(10)

if (WebUI.verifyTextPresent('Please wait a moment while your Booking Concierge starts up.', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success - BOX URL created', 'Yes')
	WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\BOX Created.png')
} else if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge/h1_My Bookings'), 'My Bookings')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Login Success', 'Yes')
	WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Scenario 5 - Success.png')
}

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.delay(3)



