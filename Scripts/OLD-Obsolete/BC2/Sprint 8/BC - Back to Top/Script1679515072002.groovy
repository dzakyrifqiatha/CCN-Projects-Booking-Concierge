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

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('S8/Page_Booking Concierge Dashboard S8/button_arrow_drop_up Dashboard'))

WebUI.delay(0)

WebUI.delay(0)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/input_My Airlines_mat-input-2'))

WebUI.click(findTestObject('S8/Page_My airlines S8/button_arrow_drop_up My Airlines'))

WebUI.click(findTestObject('Page_BC My Airlines/button_Back'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/a_New Booking'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('S8/Page_Create Booking S8/button_arrow_drop_up Create Booking'))

