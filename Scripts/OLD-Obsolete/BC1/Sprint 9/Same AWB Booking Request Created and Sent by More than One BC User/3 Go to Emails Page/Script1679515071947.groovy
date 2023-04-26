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

not_run: WebUI.switchToWindowTitle('Yahoo Indonesia | Berita, Keuangan dan Hiburan')

WebUI.navigateToUrl('yahoo.com')

WebUI.delay(10)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo Indonesia/a_Sign in'))

WebUI.delay(5)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_Masukkan Email'), vEmail)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/button_Berikutnya'))

WebUI.delay(5)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_Password'), 'Pa$5w0rd')

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo -masuk/input_aolcom_signin'))

WebUI.delay(10)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_Yahoo Indonesia/span_Mail'))

WebUI.delay(10)

WebUI.setText(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/input_Yahoo Mail_Search'), '312-15567926')

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/button_Search Email'))

WebUI.delay(5)

WebUI.click(findTestObject('OLD-Obsolete/Yahoo Email/Page_testingacc1025yahoocom - Yahoo Mail/ul_Yahoo Mail_pill-list hd'))

WebUI.delay(2)

WebUI.takeScreenshot()

