import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlDevBC2)

WebUI.maximizeWindow()

not_run: WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.authenticate('http://89.108.108.225:4200/login', 'booking', 'e4g2qpTkeAQH8syehyPLBe5ab', 3)

WebUI.setText(findTestObject('OLD-Obsolete/BC/Page_CCN SSO Login Form/input_Email Address'), Log_Email)

WebUI.setText(findTestObject('OLD-Obsolete/BC/Page_CCN SSO Login Form/input_Password'), Log_Password)

WebUI.click(findTestObject('OLD-Obsolete/BC/Page_CCN SSO Login Form/button_Sign in'))

