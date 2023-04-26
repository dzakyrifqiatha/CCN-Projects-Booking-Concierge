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

'Share via Email'
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_More_vert'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Share via Email'))

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/BC Table/input_Email to Share'), findTestData('Login/TestData_Login - BC').getValue(
        1, 1))

WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Send via Email'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Send via Email'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Send via Email'))

WebUI.delay(5)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking record is shared with ' + var_email) + '.') {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Share via Email Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 5\\Share via Email - Success.png')

WebUI.refresh()

'Edit Booking'
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.focus(findTestObject('Page_Booking Concierge Homepage/BC Table/div_AWB No'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Edit'))

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), findTestData('Booking/TestData_Booking').getValue(
        13, 1))

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), findTestData('Booking/TestData_Booking').getValue(
        14, 1))

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), findTestData('Booking/TestData_Booking').getValue(
        15, 1))

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(10)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is saved successfully', true)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Edit Booking Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 5\\Edit Booking - Success.png')

WebUI.refresh()

'Audit Log'
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_Booking Concierge Homepage/BC Table/div_AWB No'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_list (Audit Log)'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Transaction Date-Audit Log'))

if (WebUI.verifyTextPresent('Audit Logs', true)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Audit Booking Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 5\\Audit Log.png')

WebUI.refresh()

'Copy Booking'
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_More_vert'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Copy Record'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Yes Copy Record'), FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is copied successfully.', true)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Copy Booking Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 5\\Copy Booking - Success.png')

WebUI.refresh()

'Delete Booking'
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_More_vert'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Delete Record'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Yes Delete Record'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is deleted successfully.', true)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Delete Booking Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 5\\Delete Booking - Success.png')

WebUI.delay(5)

