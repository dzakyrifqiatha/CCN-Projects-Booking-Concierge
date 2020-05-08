import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Adhoc - Cost'))

not_run: WebUI.selectOptionByLabel(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'), 'Adhoc Quotation', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Cost/btn_Import Adhoc WS'))

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input'), '')

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CustomerVendorCode_input-found'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input'), '')

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Origin_input-found'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input'), '')

not_run: WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/CarrierCode_input-found'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/2 Adhoc Quotation/AWBNumber'), '')

WebUI.delay(2)

CustomKeywords.'ccnpackage.UnorderedListnumber.uploadFile'(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Browse File'), 
    'D:\\Works\\Cargo Community Network Pte Ltd\\Documents\\AutoBilling + ManageRates\\CR30024_CR30025\\CR30024\\Test Data\\v2\\CR30024_25_TestData5.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/Import/btn_Upload'))

