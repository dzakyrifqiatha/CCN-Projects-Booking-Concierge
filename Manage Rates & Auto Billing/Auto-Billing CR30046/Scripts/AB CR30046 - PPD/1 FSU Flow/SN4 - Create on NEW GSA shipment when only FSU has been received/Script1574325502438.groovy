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

WebUI.callTestCase(findTestCase('Login/3 Login CHEXS DEV'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), vMessageFSU)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'http://ppdlogin.ccnhub.com/LINC'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login - PPD/1 Login PPD (Airline KQ) - SIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.switchToWindowTitle('Auto Billing - Landing Page')

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWBNumber_input'), '706-63687262')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Search_button'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWB_List - found'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.switchToWindowTitle('CCNhub LINC')

WebUI.click(findTestObject('Landing_Page/Logout'))

WebUI.callTestCase(findTestCase('Login - PPD/1 Login PPD (GSA)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.switchToWindowTitle('Auto Billing - Landing Page')

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Process Entry'))

WebUI.click(findTestObject('Page_Auto-Billing/1 Navbar/a_Shipment Detail'))

WebUI.setText(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWBNumber_input'), '706-63687262')

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/Search_button'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Auto-Billing/Page_Shipment Details/MAWB_List - found'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.switchToWindowTitle('CCNhub LINC')

WebUI.click(findTestObject('Landing_Page/Logout'))

