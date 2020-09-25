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

WebUI.click(findTestObject('Page_Booking Concierge Dashboard/button_User Guides article'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 14\\User Guide Updates - Success.png')

WebUI.click(findTestObject('Page_Booking Concierge Dashboard/a_descriptionBooking Concierge Guide'))

WebUI.switchToWindowIndex(1)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 14\\User Guides - Success.png')

WebUI.click(findTestObject('Page_Booking Concierge Dashboard/a_descriptionGroup Management Guide'))

WebUI.switchToWindowIndex(2)

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 14\\Group Management - Success.png')

