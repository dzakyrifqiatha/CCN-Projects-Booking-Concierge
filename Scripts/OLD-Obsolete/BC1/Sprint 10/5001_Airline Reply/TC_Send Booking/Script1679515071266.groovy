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

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), vCarrierCode)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), vFNumber)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), vFDate)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), vBoardPoint)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), vOffPoint)

WebUI.click(findTestObject('Page_Create New Booking/span_Allocation Code'))

WebUI.click(findTestObject('Page_Create New Booking/span_Allocation Code NN'))

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.click(findTestObject('Page_Create New Booking/button_Send Request'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Template Booking'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), vTempName)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking Request is sent')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Send Booking to Airline - Success.png')
}

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(5)

not_run: WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'www.yahoo.com'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.switchToWindowTitle('Yahoo Indonesia | Berita, Keuangan dan Hiburan')

WebUI.navigateToUrl('www.yahoo.com')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo Indonesia/a_Sign in'))

WebUI.delay(5)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_Masukkan Email'), vEmail)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/button_Berikutnya'))

WebUI.delay(5)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_Password'), 'Pa$5w0rd')

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_aolcom_signin'))

WebUI.delay(10)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo Indonesia/span_Mail'))

WebUI.delay(10)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/input_Yahoo Mail_Search'), (vPrefix + 
    '-') + vSuffix)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/button_Search Email'))

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/ul_Yahoo Mail_pill-list hd'))

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/a_Go to Booking'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject(null))

