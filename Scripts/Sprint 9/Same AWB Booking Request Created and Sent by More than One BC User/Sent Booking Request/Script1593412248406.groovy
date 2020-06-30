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

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), vWeight)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), vVolume)

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), vSHC1)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), '')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), vCCode)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), vFNumber)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), vFDate)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), vBoardPoint)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), vOffPoint)

WebUI.click(findTestObject('Page_Create New Booking/span_Allocation Code'))

WebUI.click(findTestObject('Page_Create New Booking/span_Allocation Code NN'))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), vLength)

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), vWidth)

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), vHeight)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), 'CVB')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), vPieces2)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), vWeight2)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), vVolume2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), vRemarks)

WebUI.click(findTestObject('Page_Create New Booking/button_Send Request'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.delay(5)

