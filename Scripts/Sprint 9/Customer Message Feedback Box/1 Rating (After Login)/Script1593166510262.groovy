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

WebUI.click(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/mat-icon_keyboard_arrow_up'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/mat-icon_star 5'))

WebUI.check(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/div_Registration-checkbox'))

WebUI.verifyElementText(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/input_Email'), vEmail)

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/input_Contract Number'), '')

WebUI.setText(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/textarea_Message'), '')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/Page_Feedback 2/button_Send Message'))

