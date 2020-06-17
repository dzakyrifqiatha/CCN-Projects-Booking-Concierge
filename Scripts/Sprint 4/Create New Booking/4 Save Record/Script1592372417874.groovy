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

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), findTestData('Booking/TestData_Booking').getValue(
        1, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), findTestData('Booking/TestData_Booking').getValue(
        2, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), findTestData('Booking/TestData_Booking').getValue(
        3, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), findTestData('Booking/TestData_Booking').getValue(
        4, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), findTestData('Booking/TestData_Booking').getValue(
        5, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), findTestData('Booking/TestData_Booking').getValue(
        6, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Weight'), findTestData('Booking/TestData_Booking').getValue(
        7, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Volume'), findTestData('Booking/TestData_Booking').getValue(
        8, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 1'), findTestData('Booking/TestData_Booking').getValue(
        9, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 2'), findTestData('Booking/TestData_Booking').getValue(
        10, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 3'), findTestData('Booking/TestData_Booking').getValue(
        11, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Special Handling Codes 4'), findTestData('Booking/TestData_Booking').getValue(
        12, 1))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Flights'))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight (Carrierr Code)'), findTestData('Booking/TestData_Flight').getValue(
        1, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Number'), findTestData('Booking/TestData_Flight').getValue(
        2, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Flight Date'), findTestData('Booking/TestData_Flight').getValue(
        3, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Board Point'), findTestData('Booking/TestData_Flight').getValue(
        4, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Off Point'), findTestData('Booking/TestData_Flight').getValue(
        5, 1))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Create New Booking/span_Allocation Code'), ' KK ', false)

WebUI.click(findTestObject('Page_Create New Booking/button_Flights-Done'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/button_add Dimensions'))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Length'), findTestData('Booking/TestData_Booking').getValue(
        13, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Width'), findTestData('Booking/TestData_Booking').getValue(
        14, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Height'), findTestData('Booking/TestData_Booking').getValue(
        15, 1))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Unit'), '')

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Pieces'), findTestData('Booking/TestData_Booking').getValue(
        16, 1))

WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Weight'), findTestData('Booking/TestData_Booking').getValue(
        17, 1))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/input_Volume_mat-input-Volume'), '231.5')

WebUI.click(findTestObject('Page_Create New Booking/button_Dimensions-Done'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Create New Booking/textarea_Remarks_Booking'), 'Test Remarks')

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(10)

