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

WebUI.callTestCase(findTestCase('PPD Environment/Login PPD/1 Login PPD (GSA)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Add Record Adhoc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), vCustomerVendorCode)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/ContractNumber_input'), vContractNumber)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), vOrigin)

WebUI.delay(3)

//not_run: ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#rcbList").data("kendoDropDownList").select(1);')
WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input'), vDestination)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), vCarrierCode)

WebUI.delay(5)

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBPrefix_input'), vAWB_Prefix)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBSuffix_input'), vAWB_Suffix)

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightCarrier_input'), vCarrier)

not_run: WebUI.waitForJQueryLoad(5)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightCarrier_input-found'))

not_run: WebUI.delay(2)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightNumber_input'), vFlightNumber)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstGrossWeight_input'), vESTGrossWeight)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EffectiveDate_input'), vEffectiveDate)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightDate_input'), vFlightDate)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/WeightUOM_input'), vWeightUOM)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/WeightUOM_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Currency_input'), vCurrency)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Currency_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstChargeWeight_input'), vESTChargeWeight)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoClass_input'), 'GEN')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoClass_input-found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/ExpiryDate_input'), vExpiryDate)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoDesc_input'), vCargoDesc)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/btn_Save'))

for (def row = 1; row <= 3; row++) {
    WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/a_Add Record'))

    not_run: WebUI.switchToWindowTitle('Adhoc Quotation Details')

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Charge Code_cbChargeCode'), vChargeCode)

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/input_Charge Code'), Keys.ENTER)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/input_Rate Type'), vRateType)

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/input_Rate Type'), Keys.ENTER)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/input_Quantity'), vQuantity)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Sales Rate_txtSaleRate'), vSalesRate)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Cost Amount_txtCostAmount'), vCostAmount)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Sales Tax_txtSalesTax'), vSalesTax)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Other UOM_cbOtherUOM'), vOtherUOM)

    WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Page_/input_Cost Tax_txtCostTax'), vCostTax)

    WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/1 Other Charges/btn_Save'))

    not_run: WebUI.switchToWindowUrl('http://lobotfms.dev.ccn/AirFreightReference/SellRateSale/AdhocQuotation/AdhocQuotation.aspx')
}

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Save'))

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Save-OK'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.switchToWindowTitle('CCNhub LINC')

