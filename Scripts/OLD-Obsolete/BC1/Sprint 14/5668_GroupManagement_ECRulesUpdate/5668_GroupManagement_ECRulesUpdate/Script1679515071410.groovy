import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_Booking Concierge Homepage/Navbar/span_Group Management'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/a_Create Group'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

WebUI.click(findTestObject('Page_Group Management/span_Email'))

WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 14\\Rules Email - Success.png')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

WebUI.click(findTestObject('Page_Group Management/span_Upload'))

WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 14\\Rules Upload - Success.png')

