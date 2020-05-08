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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\CR30024\\SN1 - Import Excel template if any mandatory field on Adhoc Cost Section left blank\\20191107_133320\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.click(findTestObject('Landing_Page/MR'))

not_run: WebUI.switchToWindowIndex(1)

not_run: WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc - Cost'))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'), 'Adhoc Quotation', false)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Import Adhoc WS'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), 'SQ')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input-found'))

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), '')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'))

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), '')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'))

CustomKeywords.'ccnpackage.UploadFile.uploadFile'(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse'), 
    'D:\\\\Work\\\\5 CCN\\\\Documents\\\\3 MR + AB\\\\CR30024_CR30025\\\\CR30024\\\\Test Data\\\\v2\\\\CR30024_25_TestData1.xlsx')

//not_run: WebElement ele = driver.findElement(By.xpath('/html/body/div/form/div[8]/div[6]/div[2]/div/ul/li/span/input[2]'))
//
//not_run: JavascriptExecutor executor = ((driver) as JavascriptExecutor)
//
//not_run: executor.executeScript('arguments[0].click();', ele)
not_run: WebElement elementToClick = driver.findElement(By.xpath('/html/body/div/form/div[8]/div[6]/div[2]/div/ul/li/span/input[2]'))

// Scroll the browser to the element's Y position
not_run: ((driver) as JavascriptExecutor).executeScript(('window.scrollTo(0,' + elementToClick.getLocation().y) + '235')

// Click the element
not_run: elementToClick.click()

not_run: WebUI.waitForElementClickable(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse'), 10)

not_run: CustomKeywords.'ccnpackage.clickUsingJS.clickUsingJS'(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Browse'), 
    0)

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Browse'))

//not_run: WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse'), 
//    30)
//
//not_run: WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))
not_run: WebUI.switchToWindowTitle(null)

''', 'Test Cases/CR30024/SN1 - Import Excel template if any mandatory field on Adhoc Cost Section left blank', new TestCaseBinding('Test Cases/CR30024/SN1 - Import Excel template if any mandatory field on Adhoc Cost Section left blank',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
