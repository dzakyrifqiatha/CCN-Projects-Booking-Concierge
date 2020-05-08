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

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.delay(10)

WebUI.switchToWindowTitle('Auto Billing - Landing Page')

WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/a_Add Record'))

WebUI.delay(10)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/input_AWB Prefix'), 
    vAWB_Prefix)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/ipnut_AWB Suffix'), 
    vAWB_Suffix)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Name'), vShipperName)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Address'), vShipperAddress)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_input'), vShipperCountryCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#ShipperCountryCode").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_input - found'), 
    'SG', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_dropdown'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_input'), vShipperCityCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#ShipperCityCode").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_input - found'), 
    'SIN', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'), vConsigneeName)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Address'), vConsigneeAddress)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCountryCode_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCountryCode_input'), vConsigneeCountryCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#ConsigneeCountryCode").data("kendoDropDownList").select(1);')

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCountryCode_input - found'), 
    'SG')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCityCode_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCityCode_input'), vConsigneeCityCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#ConsigneeCityCode").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCityCode_input - found'), 
    'SIN')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCustCodePP_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCustCodePP_input'), vCarrierCustCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#CustomerCodePrePaid").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCustCodePP_input - found'), 
    'AZISIN01')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCityCode_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCityCode_input'), vCarrierCityCode)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#CustomerCityPrePaid").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CarrierCityCode_input - found'), 
    'SIN')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Agent IATA Code'), vAgentIATACode)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDEP_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDEP_input'), vAirportDEP)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#Origin").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDEP_input - found'), 'SIN')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Carrier1_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Carrier1_input'), vCarrier)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#CarrierCode1").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Carrier1_input - found'), 'SQ')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Number'), vFlightNumber)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Date'), vFlightDate)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Via1_dropdown'))

WebUI.waitForJQueryLoad(5)

not_run: WebUI.delay(4)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Via1_input'), vVia1, FailureHandling.OPTIONAL)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#Via1").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Via1_input - found'), 'CGK')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDES_dropdown'))

WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDES_input'), vAirportDES)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#Destination").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/AirportDES_input-found'), 'CGK')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CargoClass_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CargoClass_input'), vCargoClass)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#CargoClass").data("kendoDropDownList").select(4);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/CargoClass_input-found'), 'GEN')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Currency_dropdown'))

WebUI.waitForJQueryLoad(5)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Currency_input'), vCurrency)

WebUI.delay(2)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#Currency").data("kendoDropDownList").select(1);')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/Currency_input-found'), 'SGD')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/btn_Save'))

WebUI.delay(3)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

