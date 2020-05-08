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

WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/a_Add Record'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/input_AWB Prefix'), 
    '618')

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/ipnut_AWB Suffix'), 
    '23790023')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Name'), 'SHIPPER TEST NAME')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Address'), 'SHIPPER TEST ADDRESS')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Shipper Country Code'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Shipper Country Code'), 'SG')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Shipper City Code - Copy'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Shipper City Code'), 'SIN')

WebUI.focus(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_found'), 'SG')

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_found'), 'SIN')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'), 'CONSIGNEE TEST NAME')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Address'), 'CONSIGNEE TEST ADDRESS')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Consignee Country Code - Copy'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Consignee Country'), 'ID')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Consignee City Code - Copy'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCountryCode_found'), 
    'ID', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Consignee City'), 'CGK')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Customer Code (Pre-paid)'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCityCode_found'), 'CGK', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Customer Code (Pre-paid)'), 
    30)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Customer Code (Pre-paid)'), 'AZISIN01')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/span_Customer Code Prepaid'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Agent IATA Code'), '1234567')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Departure'))

WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Departure'), 
    30)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Departure'), 'SIN')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Departure'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/span_Carrier'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Carrier'), 'SQ', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Number'), '3456')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Destination'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Destination'), 'CGK')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Date'), '27-Sep-2019')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Routing to 1'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Routing 1'), 'CGK', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Cargo Class'))

WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Cargo Class'), 10)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Cargo Class'), 'GEN')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Accounting Information'), 'TEST FREIGHT')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Currency'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Currency'), 'SGD')

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Signature'), 'SHIPPER TEST')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/btn_Save'))

WebUI.delay(3)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.switchToWindowIndex(0)

'Open Configurator2'
WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('http://configurator2.ccn/')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtUserI'), 'dzaky')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtPassw'), 'mi8xLYNth')

WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/select_Please select environme'), 'DEV', false)

WebUI.click(findTestObject('Page_Configurator 2.0/input_ctl00MainContentbtnSubmi'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), 30)

WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/DropDown_Category Message'), 'AutoBilling', false)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CCNRSH'), 30)

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), 30)

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), 30)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'))

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), 30)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'))

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), 30)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'))

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), 30)

WebUI.delay(10)

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_Flight Number'), '456')

WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Prefix'), '618')

WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Suffix'), '23790023')

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/input_Submit Search'))

WebUI.delay(10)

WebUI.switchToWindowTitle('Configurator 2.0 - SB Query Result')

WebUI.delay(10)

WebUI.verifyTextPresent('<FlightNumber>3456</FlightNumber>', false)

