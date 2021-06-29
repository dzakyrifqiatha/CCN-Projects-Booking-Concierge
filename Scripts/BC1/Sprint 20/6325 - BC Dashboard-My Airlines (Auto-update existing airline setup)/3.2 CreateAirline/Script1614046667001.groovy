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

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_My Airlines'))

WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Code'), Airline_Code)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Prefix'), Airline_Prefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Station'), Airline_Station)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), Airline_Email)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), Airline_Remarks)

if (Airline_CEDI == 'Yes') {
    WebUI.verifyElementChecked(findTestObject('Page_BC My Airlines/Page_Create Airline/div_EDI Checkbox'), 2)

    WebUI.verifyElementNotChecked(findTestObject('Page_BC My Airlines/Page_Create Airline/div_Email Checkbox'), 2)
}

if (Airline_CEmail == 'Yes') {
    WebUI.verifyElementChecked(findTestObject('Page_BC My Airlines/Page_Create Airline/div_Email Checkbox'), 2)

    WebUI.verifyElementNotChecked(findTestObject('Page_BC My Airlines/Page_Create Airline/div_EDI Checkbox'), 2)
}

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyElementPresent(findTestObject('Page_Register Booking Concierge/verification/popup_success'), 3, FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_Register Booking Concierge/verification/popup_success'), findTestData('Regression').getValue(
            'Airline_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
}

