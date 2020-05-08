import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Login/1 Login DEV (Airline SQ) - SIN'), [('path') : 'https://devlogin.ccnhub.com/LINC/'],
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/MR'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Add Record'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), 'SQSIN')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/ContractNumber_input'), '12334567')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), 'SIN')

WebUI.delay(3)

not_run: ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#rcbList").data("kendoDropDownList").select(1);')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input'), 'KUL')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), 'SQ')

WebUI.delay(5)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBPrefix_input'), '618')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBSuffix_input'), '63687341')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightCarrier_input'), 'SQ')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightCarrier_input-found'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightNumber_input'), '106')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstGrossWeight_input'), '190.5')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EffectiveDate_input'), '14/10/2018')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightDate_input'), '12/12/2018')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/WeightUOM_input'), 'KGM')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/WeightUOM_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Currency_input'), 'SGD')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Currency_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstChargeWeight_input'), '192.41')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoClass_input'), 'GEN')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoClass_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/ExpiryDate_input'), '25/12/2018')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoDesc_input'), 'TEST')

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Save'))

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Save-OK'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

