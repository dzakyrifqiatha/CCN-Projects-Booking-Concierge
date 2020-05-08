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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30045 - PPD\\3 FWB Flow\\SN3 - Send FWB with Flight Date value smaller than Issue Date\\20191120_163852\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Login - PPD/3 Login CHEXS PPD'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

not_run: WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), vMessage)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

not_run: WebUI.delay(3)

not_run: WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'https://ppdlogin.ccnhub.com/LINC'], null)

not_run: WebUI.callTestCase(findTestCase('Login - PPD/1 Login PPD (Airline)'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

not_run: WebUI.delay(10)

WebUI.switchToWindowTitle('Auto Billing - Landing Page')

WebUI.focus(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWBNumber_input'), '618-23256984')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Search_button'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWB_List (618-63687363)'))

WebUI.takeScreenshot()

WebUI.delay(5)

''', 'Test Cases/AB CR30045 - PPD/3 FWB Flow/SN3 - Send FWB with Flight Date value smaller than Issue Date', new TestCaseBinding('Test Cases/AB CR30045 - PPD/3 FWB Flow/SN3 - Send FWB with Flight Date value smaller than Issue Date',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
