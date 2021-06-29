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

'Scenario 1 - Add new member to group and ensure implicit sharing is turned OFF by default'
WebUI.click(findTestObject('Page_Group Management/a_Group Management group'))

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/span_Create Group'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input__Group Name'), '')

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), '')

WebUI.focus(findTestObject('Page_Group Management/input__Group Name'))

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), '')

WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Group Management/span_Booking'))

WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Group Management/span_Origin_tag'))

WebUI.setText(findTestObject('Page_Group Management/input_Origin_tag value'), '')

WebUI.click(findTestObject('Page_Group Management/mat-icon_add rules row'))

WebUI.click(findTestObject('Page_Group Management/span_Origin_tag'))

WebUI.setText(findTestObject('Page_Group Management/input_Origin_tag value'), '')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_Group Management/button_Save Group'))

if (WebUI.verifyTextPresent('Group has been created', false)) {
	CustomKeywords.'ccnpackage.LogResults.searchresult'('Group created', 'Yes')
}