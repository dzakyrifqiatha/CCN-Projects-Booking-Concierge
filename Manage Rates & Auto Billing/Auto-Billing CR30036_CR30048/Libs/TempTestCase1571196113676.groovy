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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\CR30036 - Contracts Rate upload for Agent\\SN0a - Input valid file into MR\\20191016_112153\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Login/1 Login DEV (Agent DHL)'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Landing_Page/MR'))

not_run: WebUI.delay(10)

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.focus(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

not_run: WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Freight - Contract'))

not_run: WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/btn_Add Record'))

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Vendor Code'), 'SQ')

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Vendor Code - found'))

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_ShipperConsignee'), '*')

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_ShipperConsignee - found'))

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Currency'), 'SGD')

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Currency - found'))

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_RadDatePicker_EffectiveDatedateInput'), 
    '01/10/2019')

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_RadDatePicker_ExpiryDatedateInput'), 
    '30/11/2019')

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_No records to display_btnImport'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/Import/btn_Browse File'))

CustomKeywords.'ccnpackage.UnorderedListnumber.uploadFile'(findTestObject('Page_Manage Rates/3 Freight - Contract/Import/btn_Browse File'), 
    'D:\\\\Work\\\\5 CCN\\\\Documents\\\\3 MR + AB\\\\CR30036_CR30048\\\\CR30048\\\\Test Data v1.0\\\\Result-Consolidated Rates_20191015161434.xlsx')

''', 'Test Cases/CR30036 - Contracts Rate upload for Agent/SN0a - Input valid file into MR', new TestCaseBinding('Test Cases/CR30036 - Contracts Rate upload for Agent/SN0a - Input valid file into MR',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
