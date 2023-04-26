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

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - BQ2.0'), [('Log_Email') : 'testingdevbc2@gmail.com', ('Log_Password') : 'password'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/a_Booking row 1'))

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/button_add Flight'))

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/div_Click here to save flight entry'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/a_Next'))

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/div_Click here to delete all the details in this row'), 5)

WebUI.verifyElementPresent(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/a_Back'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/BQ/Page_BCBookingQueue/BQ Tooltip/a_Done'))

