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

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), var_awbPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), var_awbSuffix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), var_origin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), var_destination)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), var_goodsDesc)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), var_pieces)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), var_weight)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), var_volume)

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), var_shc1)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), '')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), var_fnPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), var_fnSuffix)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), var_fDate)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), var_fBoardPoint)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), var_fOffPoint)

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), var_dLength)

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), var_dWidth)

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), var_dHeight)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), 'CVB')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), var_dPieces)

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), var_dWeight)

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), '222.3', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test - Send Record')

WebUI.click(findTestObject('Page_Create New Booking/button_Send Request'))

WebUI.delay(2)

