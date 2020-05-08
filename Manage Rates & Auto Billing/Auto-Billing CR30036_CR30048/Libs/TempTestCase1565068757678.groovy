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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30043\\2 Send FWB Message\\SN6_Send FWB Message with Flight Number is 3 Character (3 digits)\\20190806_121917\\execution.properties')

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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

not_run: WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), GlobalVariable.Message1)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

not_run: WebUI.delay(5)

not_run: WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'https://devlogin.ccnhub.com/LINC'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Login/1 Login DEV (Airline) - MR'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.switchToWindowIndex(2)

not_run: WebUI.delay(10)

not_run: WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

not_run: WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

not_run: WebUI.delay(2)

not_run: WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

not_run: WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Add Record'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), 'AZISIN01')

WebUI.delay(5)

not_run: WebUI.verifyElementText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input-found'), 'ALLIANCE 21')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), 'SIN')

WebUI.delay(3)

    ((DriverFactory.getWebDriver()) as JavascriptExecutor).executeScript('$("#rcbList").data("kendoDropDownList").select(1);')

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input'), 'CGK')

WebUI.delay(5)

not_run: WebUI.verifyElementText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Destination_input-found'), 'CGK')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), 'SQ')

WebUI.delay(5)

not_run: WebUI.verifyElementText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), 'SQ')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBPrefix_input'), '618')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBSuffix_input'), '63687363')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightCarrier_input'), 'SQ')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightNumber_input'), '456')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstGrossWeight_input'), '15.5')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EffectiveDate_input'), '14/10/2019')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/FlightDate_input'), '14/10/2019')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/WeightUOM_input'), 'KGM')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Currency_input'), 'SGD')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/EstChargeWeight_input'), '16')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CargoClass_input'), 'GEN')

WebUI.waitForJQueryLoad(5)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/ExpiryDate_input'), '25/12/2019')

WebUI.waitForJQueryLoad(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/Nav_Query Tab'))

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), 30)

not_run: WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), FailureHandling.OPTIONAL)

not_run: WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/DropDown_Category Message'), 'AutoBilling', 
    false)

not_run: WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CCNRSH'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), 30)

not_run: WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), 30)

not_run: WebUI.delay(10)

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Prefix'), '618')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Suffix'), '63687341')

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/input_Submit Search'))

not_run: WebUI.delay(10)

not_run: WebUI.switchToWindowTitle('Configurator 2.0 - SB Query Result')

not_run: WebUI.delay(10)

not_run: WebUI.verifyTextPresent('<FlightNumber>0456</FlightNumber>', false)

''', 'Test Cases/AB CR30043/2 Send FWB Message/SN6_Send FWB Message with Flight Number is 3 Character (3 digits)', new TestCaseBinding('Test Cases/AB CR30043/2 Send FWB Message/SN6_Send FWB Message with Flight Number is 3 Character (3 digits)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
