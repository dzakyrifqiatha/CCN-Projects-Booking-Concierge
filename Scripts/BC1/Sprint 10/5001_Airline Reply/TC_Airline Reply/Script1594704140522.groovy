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

WebUI.openBrowser('')

WebUI.navigateToUrl('www.yahoo.com')

WebUI.click(findTestObject('Yahoo Email/Page_Yahoo Indonesia/a_Sign in'))

WebUI.delay(5)

WebUI.setText(findTestObject('Yahoo Email/Page_Yahoo -masuk/input_Masukkan Email'), vEmail)

WebUI.click(findTestObject('Yahoo Email/Page_Yahoo -masuk/button_Berikutnya'))

WebUI.delay(5)

WebUI.setText(findTestObject('Yahoo Email/Page_Yahoo -masuk/input_Password'), vPassword)

WebUI.click(findTestObject('Yahoo Email/Page_Yahoo -masuk/input_aolcom_signin'))

WebUI.delay(10)

WebUI.click(findTestObject('Yahoo Email/Page_Yahoo Indonesia/span_Mail'))

WebUI.delay(10)

WebUI.setText(findTestObject('Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/input_Yahoo Mail_Search'), (vPrefix + 
    '-') + vSuffix)

WebUI.click(findTestObject('Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/button_Search Email'))

WebUI.delay(5)

WebUI.click(findTestObject('Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/ul_Yahoo Mail_pill-list hd'))

WebUI.click(findTestObject('Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/a_Go to Booking'))

WebUI.switchToWindowIndex(1)

WebUI.authenticate('', '', '', 0)

