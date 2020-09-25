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

//Login to Group Member 3 account
WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), vUserA)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.delay(2)

WebUI.waitForPageLoad(10)

//Scenario 1. Check the Audit Log for Record 1
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), vM1)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Transaction Date-Audit Log'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Audit Log'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 13\\5411_Scenario 1 - Success.png')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge Homepage/BC Table/button_Cancel Audit Log'))

//Scenario 2. Check the Audit Log for Record 1 after the record sent to Airline
WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Send Record'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/button_Yes Send Record'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Transaction Date-Audit Log'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Audit Log'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 13\\5411_Scenario 2 - Success.png')

WebUI.clearText(findTestObject('Page_Booking Concierge Homepage/input_Search'))

WebUI.delay(2)

//Scenario 3. Check the Audit Log for Record 3
WebUI.setText(findTestObject('Page_Booking Concierge Homepage/input_Search'), vM3)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Transaction Date-Audit Log'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/BC Table/td_Top Audit Log'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 13\\5411_Scenario 3 - Success.png')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), '')

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), '')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

WebUI.delay(0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/Navbar/span_Group Management'))

WebUI.delay(0)

WebUI.switchToWindowTitle('Group Management')

WebUI.delay(0)

WebUI.setText(findTestObject('Page_Group Management/input_Search Group'), '')

WebUI.delay(0)

WebUI.click(findTestObject('Page_Group Management/mat-icon_Delete Group (Owner)'))

