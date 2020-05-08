import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'LINC Login'
WebUI.openBrowser('https://devlogin.ccnhub.com/LINC/')

not_run: WebUI.navigateToUrl('https://devlogin.ccnhub.com/LINC/')

WebUI.click(findTestObject('Page_CCNhub LINC/span_CCNhub LINC Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail(real_input)'), 'DHLSIN01.CCNUser1@CCNhub.com')

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword(real_input)'), 'password')

WebUI.click(findTestObject('Page_CCNhub LINC/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CCNhub LINC/button_ctl00ContentrwForceLogi'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

not_run: WebUI.delay(3)

not_run: WebUI.switchToWindowIndex(1)

