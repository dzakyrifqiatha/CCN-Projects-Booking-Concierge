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

WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.setText(findTestObject('Page_Configurator 2.0/MessageToSend'), GlobalVariable.Message18)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'https://ppdlogin.ccnhub.com/LINC'], null)

WebUI.callTestCase(findTestCase('Login - PPD/1 Login PPD (Agent)'), [:])

WebUI.switchToWindowIndex(2)

WebUI.delay(10)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), '618-63687326')

WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), Keys.chord(
        Keys.RETURN))

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/clicksearch_MAWB Number'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/MAWBNumber-18'))

