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

'Run 0 Login Success Test Case under the Sprint 2/Login to Booking Concierge folder first'

'Identify Airline That Setup for EDI Messaging'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_My Airlines'))

WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

 carrierCode = 'EK'

 carrierPrefix = '176'

 station = 'DOH'

 //airlineEmail = 'testemail'

WebUI.setText(findTestObject('Page_BC Create Airline/Page_Create Airline/input_Carrier Code'), carrierCode)

WebUI.setText(findTestObject('Page_BC Create Airline/Page_Create Airline/input_Carrier Prefix'), carrierPrefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input_Station'), station)

WebUI.verifyElementChecked(findTestObject('Object Repository/Page_BC My Airlines/Page_Create Airline/div_EDI Checkbox'), 0)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_BC My Airlines/Page_Create Airline/div_Email Checkbox'), 0)

//WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), airlineEmail)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), var_remarks)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyElementText(findTestObject('Page_BC Create Airline/verification/verify_email format'), 'Airline has been created successfully.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline EDI - Success', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 3\\Create Airline Failed - Invalid Email Format.png')

WebUI.click(findTestObject('Page_BC Create Airline/button_Cancel'))

////////////////////////////////////////////////////////////

'Create Airline Success'
//WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_My Airlines'))
WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Code'), var_carriercode)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Prefix'), var_carrierprefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Station'), var_station)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), var_airlineemail)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), var_remarks)

//WebUI.delay(3)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyElementText(findTestObject('Page_BC Create Airline/verification/popup_success'), 'Airline has been created successfully.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Success', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 3\\Create Airline Success.png')

WebUI.delay(5)

////////////////////////////////////////////////////////////

'Create Airline Failed - Prefix and Station Combination is existed'
//WebUI.click(findTestObject('OLD-Obsolete/img_Booking Concierge'))

WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Code'), var_carriercode)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Prefix'), var_carrierprefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Station'), var_station)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), var_airlineemail)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), var_remarks)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyElementText(findTestObject('Page_BC Create Airline/verification/verify_carrier prefix'), 'There is an existing airline record under this station. Please try again.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Failed - Carrier Prefix Existed', 'Yes')
} else if (WebUI.verifyElementText(findTestObject('Page_BC Create Airline/verification/verify_station'), 'There is an existing airline record under this station. Please try again.')) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Failed - Station Existed', 'Yes')
}

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 3\\Create Airline Failed - Prefix and Station Combination Existed.png')

WebUI.delay(5)

