import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc Quotation'))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'), 'Adhoc Quotation', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Import Adhoc WS'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), 'SDVSIN01')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), 'SIN')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), 'SQ')

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBNumber'), '618')

WebUI.delay(2)

CustomKeywords.'ccnpackage.UnorderedListnumber.uploadFile'(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse File'), 
    'D:\\Work\\5 CCN\\Documents\\3 MR + AB\\CR30024_CR30025\\CR30024\\Test Data\\v2\\CR30024_25_TestData1.xlsx')

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

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Upload'))

