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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Login\\1 Login DEV (Agent)\\20191107_121124\\execution.properties')

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

'LINC Login'
not_run: WebUI.openBrowser('https://devlogin.ccnhub.com/LINC/')

not_run: WebUI.click(findTestObject('Page_CCNhub LINC/span_CCNhub LINC Login'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.maximizeWindow()

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail(real_input)'), 'DHLSIN01.DZAKY@CCNhub.com')

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword(real_input)'), 'password')

WebUI.click(findTestObject('Page_CCNhub LINC/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CCNhub LINC/button_ctl00ContentrwForceLogi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

''', 'Test Cases/Login/1 Login DEV (Agent)', new TestCaseBinding('Test Cases/Login/1 Login DEV (Agent)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
