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

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_My Sales Agent'))

'New Request\r\n'
WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/div_New Request'))

WebUI.delay(0)

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Destination'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Goods Desc'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Pieces'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Weight'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_AWB Prefix'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_AWB Suffix'), '')

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/button_add Flight'))

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Flight - Carrier Code'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Flight - Flight No'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Flight - Flight Date'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Flight - Departure'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Flight - Arrival'), '')

'save flight\r\n'
WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/button_Flight - Save'))

WebUI.delay(0)

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/button_add Dimension'))

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Dimension - Length'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Dimension - WIdth'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Dimension - Height'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Dimension - Pieces'), '')

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/input_Dimension - Weight'), '')

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/button_Dimension - Save'))

WebUI.delay(0)

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/button_Send Request'))

