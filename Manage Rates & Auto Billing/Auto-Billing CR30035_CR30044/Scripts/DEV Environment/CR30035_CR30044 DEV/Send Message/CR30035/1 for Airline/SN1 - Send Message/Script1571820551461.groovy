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

not_run: WebUI.callTestCase(findTestCase('DEV Environment/Login DEV/3 Login CHEXS DEV'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DEV Environment/Login DEV/3 Login CHEXS DEV'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('http://configurator2.dev.ccn/Pages/Login/Login.aspx')

WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), vFWBMessage)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/Nav_Query Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/dropDown_Receive Date'), 'Today', false)

WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/DropDown_Category Message'), 'AutoBilling', false)

WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_Sender Info Company Code'), 'SQ')

WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_Recipient Info Company Code'), 'SQ')

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), FailureHandling.OPTIONAL)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), FailureHandling.OPTIONAL)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), 2)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), 2)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), 2)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), FailureHandling.OPTIONAL)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), FailureHandling.OPTIONAL)

WebUI.uncheck(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CCNRSH'), 2)

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), 2)

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), 2)

WebUI.verifyElementNotChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), 2)

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/input_Submit Search'))

WebUI.switchToWindowTitle('Configurator 2.0 - SB Query Result')

WebUI.delay(2)

WebUI.takeScreenshot()

not_run: WebUI.switchToWindowTitle('CCNhub LINC')

