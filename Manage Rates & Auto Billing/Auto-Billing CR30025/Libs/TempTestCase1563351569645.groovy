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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30043\\SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)\\20190717_151929\\execution.properties')

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

not_run: WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

not_run: WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/a_Add Record'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/input_AWB Prefix'), 
    '618')

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/span_Carrier'), 'SQ', 
    false)

not_run: WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/input_Flight Number'), '456')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Add Record/btn_Save'))

not_run: WebUI.delay(10)

not_run: WebUI.switchToWindowIndex(0)

'Open Configurator2'
not_run: WebUI.executeJavaScript('window.open();', [])

not_run: currentWindow = WebUI.getWindowIndex()

not_run: WebUI.switchToWindowIndex(currentWindow + 1)

not_run: WebUI.navigateToUrl('http://configurator2.ccn/')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtUserI'), 'dzaky')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtPassw'), 'mi8xLYNth')

not_run: WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/select_Please select environme'), 'DEV', false)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/input_ctl00MainContentbtnSubmi'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

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

''', 'Test Cases/AB CR30043/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)', new TestCaseBinding('Test Cases/AB CR30043/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
