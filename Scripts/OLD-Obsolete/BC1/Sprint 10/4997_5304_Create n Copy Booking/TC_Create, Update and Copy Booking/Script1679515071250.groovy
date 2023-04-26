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

'Create New BOX Document/Booking Record'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), vTempName)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Create BOX Document - Success.png')
}

WebUI.delay(5)

'Copy BOX Document/Booking Record'
WebUI.click(findTestObject('OLD-Obsolete/img_Booking Concierge'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_More_vert'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Copy Record'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Yes Copy Record'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is copied successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Copy BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Copy BOX Document - Success.png')
}

'Update BOX Document/Booking Reocrd'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Top Record'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), vCarrierCode)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), vFNumber)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), vFDate)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), vBoardPoint)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), vOffPoint)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Update BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Update BOX Document - Success.png')
}

'Create New BOX Document/Booking Record Failed'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), vTempName)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Something went wrong. Please contact system administrator: testacct0725@yahoo.com or testing.acc1025@yahoo.com')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Create BOX Document Failed - Success.png')
}

WebUI.delay(5)

'Copy BOX Document/Booking Record Failed'
WebUI.click(findTestObject('OLD-Obsolete/img_Booking Concierge'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-icon_More_vert'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Copy Record'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/button_Yes Copy Record'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Something went wrong. Please contact system administrator: testacct0725@yahoo.com or testing.acc1025@yahoo.com')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Copy BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Copy BOX Document Failed - Success.png')
}

'Update BOX Document/Booking Reocrd Failed'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Top Record'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), vCarrierCode)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), vFNumber)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), vFDate)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), vBoardPoint)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), vOffPoint)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Something went wrong. Please contact system administrator: testacct0725@yahoo.com or testing.acc1025@yahoo.com')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Update BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Update BOX Document Failed - Success.png')
}

