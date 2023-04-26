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

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - Quotation Request'), [('Log_Email') : 'testingbc1@hotmail.com'
        , ('Log_Password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.callTestCase(findTestCase('OLD-Obsolete/BC2/Sprint 10/QRQ Flow/QRQ Request'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.callTestCase(findTestCase('Open New Tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - BC2.0'), [('Log_Email') : 'testingbc1@hotmail.com', ('Log_Password') : 'password'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.verifyElementText(findTestObject('OLD-Obsolete/BC/BC Homepage/BC Table/span_AWB row 1'), ' 160 - 89433245 ')

