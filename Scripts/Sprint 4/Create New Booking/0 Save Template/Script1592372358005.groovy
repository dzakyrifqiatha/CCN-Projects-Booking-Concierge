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

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodDesc)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), '')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), '')

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), '')

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), '')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Template Booking'))

WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), 'Template001')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

