import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\kohcj\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30043\\1 Insert New Shipment\\SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)\\20190731_123027\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.Keys as Keys

not_run: WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/a_Add Record'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/input_AWB Prefix'), 
    '618')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/ipnut_AWB Suffix'), 
    '23790023')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Name'), 'SHIPPER TEST NAME')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Address'), 'SHIPPER TEST ADDRESS')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_dropdown'))

WebUI.sendKeys(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_input'), Keys.chord(
        Keys.DELETE))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_clear'))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_dropdown'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_input'), 'SG')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_dropdown'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_input - found'), 
    'SG')

WebUI.sendKeys(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_input'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_clear'))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_dropdown'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_input'), 'SIN')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_dropdown'))

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCountryCode_dropdown'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ShipperCityCode_input - found'), 
    'SIN')

not_run: WebUI.focus(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'))

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Name'), 'CONSIGNEE TEST NAME')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Consignee Address'), 'CONSIGNEE TEST ADDRESS')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Consignee Country Code - Copy'))

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Consignee Country'), 
    'ID')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Consignee City Code - Copy'))

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCountryCode_found'), 
    'ID', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Search Consignee City'), 
    'CGK')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Customer Code (Pre-paid)'))

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/ConsigneeCityCode_found'), 
    'CGK', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Customer Code (Pre-paid)'), 
    30)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Customer Code (Pre-paid)'), 
    'AZISIN01')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Agent IATA Code'), '1234567')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Departure'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Departure'), 
    30)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Departure'), 
    'SIN')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Departure'), 
    FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/span_Carrier'))

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Carrier'), 'SQ', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Number'), '456')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Airport of Destination'))

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Airport of Destination'), 
    'CGK')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Date'), '27-Sep-2019')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Routing to 1'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Routing 1'), 'CGK', FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Cargo Class'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Cargo Class'), 
    10)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Cargo Class'), 'GEN')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Accounting Information'), 
    'TEST FREIGHT')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/dropDown_Currency'))

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Currency'), 'SGD')

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Shipper Signature'), 'SHIPPER TEST')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/btn_Save'))

not_run: WebUI.delay(3)

not_run: WebUI.acceptAlert(FailureHandling.OPTIONAL)

not_run: WebUI.delay(10)

not_run: WebUI.switchToWindowIndex(0)

not_run: currentWindow = WebUI.getWindowIndex()

'Open Configurator2'
not_run: WebUI.executeJavaScript('window.open();', [])

not_run: WebUI.switchToWindowTitle('')

not_run: WebUI.switchToWindowIndex(currentWindow + 1)

not_run: WebUI.callTestCase(findTestCase('Login/3 Login CHEXS DEV'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('http://configurator2.ccn/')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtUserI'), 'dzaky')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtPassw'), 'mi8xLYNth')

not_run: WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/select_Please select environme'), 'DEV', false)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/input_ctl00MainContentbtnSubmi'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/Tab_Query/dropDown_Receive Date'), 'Last30days', 
    false)

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), 30)

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/DropDown_Category Message'), 'AutoBilling', 
    false)

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CCNRSH'), 30)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), 30)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'))

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'))

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'))

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), 30)

not_run: WebUI.delay(10)

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Prefix'), '618')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Suffix'), '23790023')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_Flight Number'), '456')

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/input_Submit Search'))

not_run: WebUI.delay(10)

not_run: WebUI.switchToWindowTitle('Configurator 2.0 - SB Query Result')

not_run: WebUI.delay(10)

not_run: WebUI.verifyTextPresent('<FlightNumber>0456</FlightNumber>', false)

''', 'Test Cases/AB CR30043/1 Insert New Shipment/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)', new TestCaseBinding('Test Cases/AB CR30043/1 Insert New Shipment/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
