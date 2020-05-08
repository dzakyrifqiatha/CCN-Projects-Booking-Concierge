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

WebUI.click(findTestObject('Landing_Page/div_myAppRMS2'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('Page_Manage Air Cargo Rates Homepage/Home_icon'))

WebUI.click(findTestObject('Page_Manage Air Cargo Rates Homepage/Home_icon'))

WebUI.delay(10)

WebUI.switchToWindowIndex(2)

WebUI.mouseOver(findTestObject('Page_Manage Air Cargo Rates Homepage/Entity Admin/span_Entity Admin'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Air Cargo Rates Homepage/Entity Admin/span_Report Settings'))

WebUI.delay(15)

WebUI.click(findTestObject('Page_Manage Air Cargo Rates Homepage/Entity Admin/Report Settings/a_CP Product ID (1)'))

