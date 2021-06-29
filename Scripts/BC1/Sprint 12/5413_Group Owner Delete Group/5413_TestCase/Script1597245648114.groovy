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

'Scenario 1 - Add new member to group and ensure implicit sharing is turned OFF by default'
WebUI.click(findTestObject('Page_Group Management/a_Group Management group'))

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input_Search Group'), 'groops')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Group Management/mat-icon_Delete Group (Owner)'))

WebUI.delay(10)

WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '42812910')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), 'AQA')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Booking is Saved', 'Yes')
}

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev3@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '42812910')

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), '42812910')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5413\\SN 1 - User C have read-only access to the shared record.png')

'Scenario 2 - Ex group member will not see deleted group'
WebUI.click(findTestObject('Object Repository/Page_Group Management/a_Group Management group'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input_Search Group'), 'groops')

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5413\\SN 2 - "grooops" is not in My group list.png')

'Scneario 3 - Ex group member create a new booking'
WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/input_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '121')

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '7534382')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'LOO')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'AAC')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), 'Testing 12')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '100')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Booking is Saved', 'Yes')
}

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), '121-75343822')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5413\\SN 3 - User C create a new record.png')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev1@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '121-75343822')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5413\\SN 3 - User A didnt get the record created by User C.png')

