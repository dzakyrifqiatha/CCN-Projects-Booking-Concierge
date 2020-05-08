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

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Auto Billing - Landing Page')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWBNumber_input'), '618-63687315')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Search_button'))

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_Flight Date'), '12-Dec-2019')

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_Flight Number'), 'SQ0109')

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_Carrier'), 'SQ')

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_Origin'), 'SIN')

not_run: WebUI.verifyElementText(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_Destination'), 'KUL')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Table/column_MAWB Number'))

