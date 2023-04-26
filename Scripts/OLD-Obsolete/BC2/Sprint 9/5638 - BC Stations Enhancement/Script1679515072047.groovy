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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - BC2.0'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('OLD-Obsolete/BC/BC Homepage/input_New Booking'))

WebUI.click(findTestObject('OLD-Obsolete/BC/BC Homepage/a_New Booking'))

WebUI.delay(5)

WebUI.setText(findTestObject('OLD-Obsolete/BC/Create Booking/Booking Details Section/input_Origin'), 'SIN')

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Origin Station list'), 3)

WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Origin Station list'))

WebUI.setText(findTestObject('OLD-Obsolete/BC/Create Booking/Booking Details Section/input_Destination'), 'KUL')

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Destination Station list'), 3)

WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Destination Station list'))

WebUI.delay(3)

WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/button_add Flight Section'))

WebUI.setText(findTestObject('OLD-Obsolete/BC/Create Booking/Flight Section/input_F_Departure'), 'SIN')

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Departure Station list'), 3)

WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Departure Station list'))

WebUI.setText(findTestObject('OLD-Obsolete/BC/Create Booking/Flight Section/input_F_Arrival'), 'KUL')

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Arrival Station list'), 3)

WebUI.click(findTestObject('OLD-Obsolete/BC/Create Booking/Station Enhancement/span_Arrival Station list'))

