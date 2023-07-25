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

WebUI.openBrowser('')
WebUI.navigateToUrl('https://bookingconcierge2ppd.ccnhub.com/')
WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/login/input_email'),'testtestbc2@hotmail.com'.trim())
WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/login/input_password'), 'password'.trim())
WebUI.click(findTestObject('Object Repository/NEW/dev_BC/login/button_Sign in'))
WebUI.verifyElementPresent(findTestObject('Object Repository/NEW/dev_BC/login/BC_logo'),0)

WebUI.click(findTestObject('Object Repository/button_My Airlines'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/MyAirline/CreateAirline_button'))

WebUI.setText(findTestObject('Object Repository/input__carrierCode'), 'MM')

WebUI.setText(findTestObject('Object Repository/input__carrierPrefix'), '323')

WebUI.setText(findTestObject('Object Repository/input__station'), 'SIN')

WebUI.setText(findTestObject('Object Repository/number_of_packages_UNID'), 'test@hotmail.com')

WebUI.sendKeys(findTestObject('Object Repository/number_of_packages_UNID'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/save_airline'))

WebUI.closeBrowser()

