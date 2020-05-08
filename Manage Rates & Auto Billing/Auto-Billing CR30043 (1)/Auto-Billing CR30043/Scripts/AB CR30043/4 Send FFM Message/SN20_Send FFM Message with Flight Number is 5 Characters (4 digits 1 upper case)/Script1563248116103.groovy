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

WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), GlobalVariable.Message15)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/Nav_Query Tab'))

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/RadioBtn_Service Bus'))

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message In'), 30)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), FailureHandling.OPTIONAL)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Out'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Message Suspend'), 0, FailureHandling.OPTIONAL)


WebUI.selectOptionByLabel(findTestObject('Page_Configurator 2.0/Tab_Query/DropDown_Category Message'), 'AutoBilling', false)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CCNRSH'), 30)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFWB'), 30)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFSU'), 30)

WebUI.check(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), FailureHandling.OPTIONAL)

WebUI.verifyElementChecked(findTestObject('Page_Configurator 2.0/Tab_Query/checkbox_Msg Type CIMFFM'), 30)

WebUI.delay(10)

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Prefix'), '618')

not_run: WebUI.setText(findTestObject('Page_Configurator 2.0/Tab_Query/input_AWB Suffix'), '63687315')

WebUI.click(findTestObject('Page_Configurator 2.0/Tab_Query/input_Submit Search'))

WebUI.delay(10)

WebUI.switchToWindowTitle('Configurator 2.0 - SB Query Result')

WebUI.delay(10)

WebUI.verifyTextPresent('<FlightNumber>3456A</FlightNumber>', false)

