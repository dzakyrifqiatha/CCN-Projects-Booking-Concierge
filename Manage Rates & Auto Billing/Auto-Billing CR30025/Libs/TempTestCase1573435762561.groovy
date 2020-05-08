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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\CR30025 - Adhoc WS Cost\\SN8 - Import Excel template if the scenario 1 to 8 not occured and overwrite existing record is unchecked\\20191111_092922\\execution.properties')

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

not_run: WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc - Cost'))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'), 'Adhoc Quotation', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Import Adhoc WS'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), 'SQ')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), 'SIN')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), 'SQ')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBNumber'), '618')

WebUI.delay(2)

WebUI.verifyElementNotChecked(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/checkbox_Overwrite Existing Records'), 
    3)

CustomKeywords.'ccnpackage.UnorderedListnumber.uploadFile'(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse File'), 
    'D:\\\\Work\\\\5 CCN\\\\Documents\\\\3 MR + AB\\\\CR30024_CR30025\\\\CR30024\\\\Test Data\\\\v2\\\\CR30024_25_TestData5.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Upload'))

''', 'Test Cases/CR30025 - Adhoc WS Cost/SN8 - Import Excel template if the scenario 1 to 8 not occured and overwrite existing record is unchecked', new TestCaseBinding('Test Cases/CR30025 - Adhoc WS Cost/SN8 - Import Excel template if the scenario 1 to 8 not occured and overwrite existing record is unchecked',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
