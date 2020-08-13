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

WebUI.click(findTestObject('Page_Group Management/a_Group'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), 'testingdev5@yahoo.com')

WebUI.focus(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

WebUI.click(findTestObject('Page_Group Management/span_Origin_tag'))

WebUI.setText(findTestObject('Page_Group Management/input_Origin_tag value'), 'LOO')

WebUI.click(findTestObject('Page_Group Management/mat-icon_done rules row'))

WebUI.click(findTestObject('Page_Group Management/button_Save Group'))

WebUI.waitForPageLoad(10)

WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.closeWindowTitle('Group Management')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev5@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/a_Group Management group'))

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input_Search Group'), 'groops')

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN1 - Toogle OFF 1.png')

WebUI.click(findTestObject('Page_Group Management/a_Group'))

WebUI.waitForPageLoad(10)

if (WebUI.verifyElementVisible(findTestObject('Page_Group Management/div_Share my records_toogle'))) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Sharing Toogle turned OFF', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 1 - Toogle OFF 2.png')

'Scenario 2 - User B create a booking and shared to ALL members of the group'
WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.closeWindowTitle('Group Management')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev22@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/input_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '121')

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '4281291')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'LOO')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'AAA')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), 'Testing 12')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '100')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Booking is Saved and Shared', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 2 - Booking is Saved and Shared by User B.png')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev5@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '42812910')

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), '42812910')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 2 - Booking is Showing in User E Dashboard.png')

'Scenario 3 - User E create a booking - Sharing is turned OFF'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/input_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '121')

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '4284157')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'LOO')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'ACC')

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

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 3 - Booking is Saved and not shared by User C.png')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev3@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '42841573')

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), '42841573')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 3 - Booking is not showing in User C Dashboard.png')

'Scenario 4 - User E turn on implicit sharing'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev5@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Group Management/a_Group'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/div_Share my records_toogle'))

WebUI.click(findTestObject('Page_Group Management/button_Save Group'))

WebUI.waitForPageLoad(10)

WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/input_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '121')

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '5532819')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'LOO')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'AXB')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), 'Testing 12')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '100')

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '100')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Booking is Saved and Shared', 'Yes')
}

WebUI.waitForPageLoad(10)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 4 - Booking is Saved and Shared by User E.png')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), 'testingdev3@yahoo.com')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '55328195')

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'), '55328195')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\5388\\SN 4 - Booking is Showing in User C Dashboard.png')

