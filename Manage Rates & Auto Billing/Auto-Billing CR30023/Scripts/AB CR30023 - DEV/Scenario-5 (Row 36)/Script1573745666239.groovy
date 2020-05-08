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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

'Configurator2.0 Login'
WebUI.openBrowser('')

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('http://configurator2.ccn/')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtUserI'), 'kelvin')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtPassw'), '#Pa55w0rd12345')

WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/select_Please select environme'), 'DEV', false)

WebUI.click(findTestObject('Page_Configurator 2.0/input_ctl00MainContentbtnSubmi'))

'Send Message'
WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), GlobalVariable.Message5)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

'LINC Login'
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://devlogin.ccnhub.com/LINC/')

WebUI.click(findTestObject('Page_CCNhub LINC/span_CCNhub LINC Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail(real_input)'), 'SQ.DZAKY@CCNhub.com')

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword(real_input)'), '33cdfcf7')

WebUI.click(findTestObject('Page_CCNhub LINC/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CCNhub LINC/button_ctl00ContentrwForceLogi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.delay(10)

WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), '618-63687324')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), Keys.chord(Keys.RETURN))

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/clicksearch_MAWB Number'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/MAWBNumber-5'))

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/dropDown_Cargo Class'), 
    '')

