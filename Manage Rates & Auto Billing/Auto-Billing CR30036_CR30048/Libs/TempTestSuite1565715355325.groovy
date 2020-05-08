import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/2 Send FWB Message/SN6')

suiteProperties.put('name', 'SN6')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Work\\CCN\\Documents\\3 MR + AB\\CR30043\\Script (From Chew Jin)\\Auto-Billing CR30043 (3)\\Reports\\2 Send FWB Message\\SN6\\20190813_235555\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/2 Send FWB Message/SN6', suiteProperties, [new TestCaseBinding('Test Cases/Login/1 Login DEV (Airline) - MR', 'Test Cases/Login/1 Login DEV (Airline) - MR',  null), new TestCaseBinding('Test Cases/AB CR30043/Create Adhoc Quotation', 'Test Cases/AB CR30043/Create Adhoc Quotation',  null), new TestCaseBinding('Test Cases/Login/3 Login CHEXS DEV', 'Test Cases/Login/3 Login CHEXS DEV',  null), new TestCaseBinding('Test Cases/AB CR30043/2 Send FWB Message/SN6_Send FWB Message with Flight Number is 3 Character (3 digits)', 'Test Cases/AB CR30043/2 Send FWB Message/SN6_Send FWB Message with Flight Number is 3 Character (3 digits)',  null)])
