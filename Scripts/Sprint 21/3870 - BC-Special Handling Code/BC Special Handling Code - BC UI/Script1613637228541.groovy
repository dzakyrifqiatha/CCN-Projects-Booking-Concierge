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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

'Create Booking Record'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Prefix'), CB_Prefix)

WebUI.setText(findTestObject('Page_Create Booking/input_-_mat-input-Suffix'), CB_Suffix)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Origin'), CB_Origin)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Destination'), CB_Destination)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-GoodsDesc'), CB_GoodsDesc)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Pieces'), CB_Pieces)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Weight'), CB_Weight)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-Volume'), CB_Volume)

WebUI.setText(findTestObject('Page_Create Booking/input__mat-input-DG'), CB_DG)

WebUI.setText(findTestObject('Page_Create Booking/input_Special Handling Codes_mat-input-1'), CB_SHC1)

'New in Sprint 4 (Sprint 21)'
WebUI.click(findTestObject('Sprint 21/PageCreateBooking_Special Handling Code/mat-option_AOG - First row SHC'))

WebUI.setText(findTestObject('Page_Create Booking/input_Special Handling Codes_mat-input-2'), CB_SHC2)

WebUI.setText(findTestObject('Page_Create Booking/input_Special Handling Codes_mat-input-3'), CB_SHC3)

WebUI.setText(findTestObject('Page_Create Booking/input_Special Handling Codes_mat-input-4'), CB_SHC4)

WebUI.click(findTestObject('Page_Create Booking/div_Value Added Service'))

WebUI.click(findTestObject('Page_Create Booking/span_Cool Shipment'))

WebUI.setText(findTestObject('Page_Create Booking/input_from_mat-input-TempFrom'), CB_TempFrom)

WebUI.setText(findTestObject('Page_Create Booking/input_to_mat-input-TemptTo'), CB_TempTo)

WebUI.setText(findTestObject('Page_Create Booking/input_Dry Ice_mat-input-Dry Ice'), CB_TempDryIce)

WebUI.click(findTestObject('Page_Create Booking/button_add Flight Section'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-27-CarrierCode'), CB_F_Carrier)

WebUI.setText(findTestObject('Page_Create Booking/input_A1_mat-input-FlightNumber'), CB_F_Number)

WebUI.setText(findTestObject('Page_Create Booking/input_A1_mat-input-FlightDate'), CB_F_Date)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-Departure'), CB_F_Dep)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-Arrival'), CB_F_Arrival)

WebUI.click(findTestObject('Page_Create Booking/span_AllocationCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/span_NN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/span_XX'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/span_CA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/button_doneFlight Row 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/button_add Dimension Section'))

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Length'), CB_D_Length)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Width'), CB_D_Width)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Height'), CB_D_Height)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Unit'), CB_D_Unit)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Pieces'), CB_D_Pieces)

WebUI.setText(findTestObject('Page_Create Booking/input_mat-input-D Weight'), CB_D_Weight)

WebUI.click(findTestObject('Page_Create Booking/button_doneDimension Row 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Create Booking/input_Special Service Request_mat-input-Line 1'), CB_SSR1)

WebUI.setText(findTestObject('Page_Create Booking/input_Service Request_mat-input-Line 2'), CB_SSR2)

WebUI.setText(findTestObject('Page_Create Booking/input_Other Service Information_mat-input-Line 1'), CB_OSI1)

WebUI.setText(findTestObject('Page_Create Booking/input_Service Information_mat-input-Line 2'), CB_OSI2)

WebUI.setText(findTestObject('Page_Create Booking/textarea_Remarks_mat-input-Remarks'), CB_Remarks)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), CB_TemplateCode)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 10\\Create BOX Document - Success.png')
}

WebUI.delay(5)

WebUI.click(findTestObject('img_Booking Concierge'))

