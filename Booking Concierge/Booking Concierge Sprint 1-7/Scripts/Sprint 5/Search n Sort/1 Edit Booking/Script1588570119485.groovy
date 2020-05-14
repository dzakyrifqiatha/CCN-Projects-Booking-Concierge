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

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), '312-12345675')

WebUI.focus(findTestObject('Page_Booking Concierge Homepage/BC Table/div_AWB No'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/span_Top AWB No'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), '1234567')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), 'SIN')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), 'BKK')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), 'Test Edit 1')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), '100')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), '1000')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), '1.25')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), 'GEN')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), '')

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Edit'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), 'AP')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), '111')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), '20-Apr-20')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), '')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), '')

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Edit'))

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), '100')

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), '200')

WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), '150')

not_run: WebUI.focus(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'))

not_run: WebUI.clearText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), 'CCB')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), '100')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), '100')

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), '')

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(10)

