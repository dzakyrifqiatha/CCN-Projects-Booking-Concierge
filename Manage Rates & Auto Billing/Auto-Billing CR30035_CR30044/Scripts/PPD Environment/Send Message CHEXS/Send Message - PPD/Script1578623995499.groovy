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

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

not_run: WebUI.sendKeys(findTestObject('Page_Configurator 2.0/MessageToSend'), vMessage)

not_run: WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

not_run: WebUI.delay(3)

WebUI.callTestCase(findTestCase('PPD Environment/CR30035_CR30044 PPD/Send Message/CR30035/3 for GSA/SN23 - Send Message'), 
    [('vFWBMessage') : findTestData('CR30035/CR30035_TestData_v3.0').getValue('vMessage', 13)], FailureHandling.STOP_ON_FAILURE)

