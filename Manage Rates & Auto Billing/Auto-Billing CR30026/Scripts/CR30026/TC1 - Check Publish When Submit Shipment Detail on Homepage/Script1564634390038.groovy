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

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), '618-63687400')

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/span_filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/MAWBNumber-1'))

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/select_Filght Date'), 
    '15-Dec-2019')

not_run: WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/btn_Submit'))

