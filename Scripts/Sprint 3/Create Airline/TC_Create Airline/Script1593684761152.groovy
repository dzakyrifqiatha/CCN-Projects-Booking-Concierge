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

'Create Airline Failed - Invalid email format'
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_My Airlines'))

WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

string(carrierCode = 'SQ')

string(carrierPrefix = 610)

string(station = 'SIN')

string(airlineEmail = 'testemail')

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Code'), carrierCode)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Prefix'), carrierPrefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Station'), station)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), airlineEmail)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), var_remarks)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyTextPresent('Invalid email format. Use test@test.com. ', false)) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Failed - Invalid Email', 'Yes')
}

WebUI.takeScreenshot()

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

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyTextPresent('Airline has been created successfully. ', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Success', 'Yes')
}

WebUI.takeScreenshot()

WebUI.delay(5)

////////////////////////////////////////////////////////////

'Create Airline Failed - Prefix and Station Combination is existed'
//WebUI.click(findTestObject('img_Booking Concierge'))

WebUI.click(findTestObject('Page_BC My Airlines/span_Create Airline'))

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Code'), var_carriercode)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Carrier Prefix'), var_carrierprefix)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Station'), var_station)

WebUI.setText(findTestObject('Page_BC Create Airline/input__mat-input-Airline Email'), var_airlineemail)

WebUI.focus(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'))

WebUI.setText(findTestObject('Page_BC Create Airline/textarea__mat-input-Remarks'), var_remarks)

WebUI.delay(5)

WebUI.click(findTestObject('Page_BC Create Airline/button_Save'))

if (WebUI.verifyTextPresent('There is an existing airline record under this station. Please try again. ', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Failed - Carrier Prefix Existed', 'Yes')
} else if (WebUI.verifyTextPresent('There is an existing airline record under this station. Please try again. ', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Airline Failed - Station Existed', 'Yes')
}

WebUI.takeScreenshot()

WebUI.delay(5)
