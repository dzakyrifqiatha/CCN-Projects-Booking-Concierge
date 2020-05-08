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

WebUI.click(findTestObject('Landing_Page/span_Settings'))

WebUI.click(findTestObject('Landing_Page/Settings/span_Product Management'))

WebUI.delay(5)

WebUI.click(findTestObject('Landing_Page/Settings/button_Assign Product to Station'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Landing_Page/Settings/dropdown_Station'), 'BWN', false)

WebUI.delay(5)

WebUI.check(findTestObject('Landing_Page/Settings/checkbox_Manage Air Cargo Rates'))

WebUI.verifyElementChecked(findTestObject('Landing_Page/Settings/checkbox_Manage Air Cargo Rates'), 10)

not_run: WebUI.click(findTestObject('Landing_Page/Settings/button_Save'))

