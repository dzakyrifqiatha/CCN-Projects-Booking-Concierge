import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Create Booking Record'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.setText(findTestObject('Page_Create Booking/input_AWBPrefix'), CB_Prefix)

WebUI.setText(findTestObject('Page_Create Booking/input_AWBSuffix'), CB_Suffix)

WebUI.setText(findTestObject('Page_Create Booking/input_Origin'), CB_Origin)

WebUI.setText(findTestObject('Page_Create Booking/input_Destination'), CB_Destination)

WebUI.setText(findTestObject('Page_Create Booking/input_GoodsDesc'), CB_GoodsDesc)

WebUI.setText(findTestObject('Page_Create Booking/input_Pieces'), CB_Pieces)

WebUI.setText(findTestObject('Page_Create Booking/input_Weight'), CB_Weight)

if (CB_Volume == '100') {
    WebUI.setText(findTestObject('Page_Create Booking/input_Volume'), CB_Volume)
} else if (CB_DG == '4') {
    WebUI.setText(findTestObject('Page_Create Booking/input_DG'), CB_DG)
}

//WebUI.setText(findTestObject('Page_Create Booking/input_Volume'), CB_Volume)
//
//WebUI.setText(findTestObject('Page_Create Booking/input_DG'), CB_DG, FailureHandling.OPTIONAL)
if (CB_CommodityInfo == 'Yes') {
    WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/Booking Details Section/input_Commodity Info'))

    WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/span_SQ Testing Commodity Info'))
}

WebUI.setText(findTestObject('Page_Create Booking/input_SHC 1'), CB_SHC1)

WebUI.setText(findTestObject('Page_Create Booking/input_SHC 2'), CB_SHC2)

WebUI.setText(findTestObject('Page_Create Booking/input_SHC 3'), CB_SHC3)

WebUI.setText(findTestObject('Page_Create Booking/input_SHC 4'), CB_SHC4)

WebUI.click(findTestObject('Page_Create Booking/div_Value Added Service'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create Booking/span_Cool Shipment'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_TempFrom'), CB_TempFrom, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_TemptTo'), CB_TempTo, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_Dry Ice'), CB_TempDryIce, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create Booking/button_add Flight Section'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Create Booking/input_F_CarrierCode'), CB_F_Carrier)

WebUI.setText(findTestObject('Page_Create Booking/input_F_FlightNumber'), CB_F_Number)

WebUI.setText(findTestObject('Page_Create Booking/input_F_FlightDate'), CB_F_Date)

WebUI.setText(findTestObject('Page_Create Booking/input_F_Departure'), CB_F_Dep)

WebUI.setText(findTestObject('Page_Create Booking/input_F_Arrival'), CB_F_Arrival)

WebUI.click(findTestObject('Page_Create Booking/span_AllocationCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/span_NN'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Create Booking/span_XX'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Create Booking/span_CA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/button_doneFlight Row 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Create Booking/button_add Dimension Section'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_D_Length'), CB_D_Length, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_D_Width'), CB_D_Width, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/Dimension Section/input_mat-input-D Height'), CB_D_Height, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_D_Unit'), CB_D_Unit, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_D_Pieces'), CB_D_Pieces, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_D_Weight'), CB_D_Weight, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create Booking/button_doneDimension Row 1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_SSR 1'), CB_SSR1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_SSR 2'), CB_SSR2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_OSI 1'), CB_OSI1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/input_OSI 2'), CB_OSI2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Create Booking/textarea_Remarks'), CB_Remarks, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

not_run: WebUI.setText(findTestObject('Page_Create New Booking/Page_Save Booking/input_Template Code_mat-input-17'), CB_TemplateCode)

WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Save Template Booking'))

if (WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/verification/popup_success'), 'Booking is saved successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create BOX Document - Success', 'Yes')

    WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\Create Booking - Success.png')
}

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Created By'))

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/span_Created By row 1'), ' TESTING 4 ')

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/p_Airline Recipient row 1'), ' SQ-SIN ')

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/td_Last Updated By row 1'), ' SQ System ')

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 12\\Create Booking - Success.png')

not_run: WebUI.click(findTestObject('OLD-Obsolete/img_Booking Concierge'))

