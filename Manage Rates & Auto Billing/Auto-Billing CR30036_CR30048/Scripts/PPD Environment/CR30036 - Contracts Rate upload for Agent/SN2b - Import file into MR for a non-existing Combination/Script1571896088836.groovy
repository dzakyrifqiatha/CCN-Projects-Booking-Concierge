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

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(5)

WebUI.focus(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Freight - Contract'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/btn_Add Record'))

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Vendor Code'))

WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Vendor Code'), 'SQ')

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Vendor Code - found'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_ShipperConsignee'))

WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_ShipperConsignee'), 'SIN')

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_ShipperConsignee found SINDHL'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Currency'))

WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Currency'), 'SGD')

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_Currency - found'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_RadDatePicker_EffectiveDatedateInput'), '01/12/2019')

WebUI.setText(findTestObject('Page_Manage Rates/3 Freight - Contract/input_RadDatePicker_ExpiryDatedateInput'), '31/12/2019')

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_No records to display_btnImport'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/Import/btn_Browse File'))

CustomKeywords.'ccnpackage.UnorderedListnumber.uploadFile'(findTestObject('Page_Manage Rates/3 Freight - Contract/Import/btn_Browse File'), 
    'D:\\Work\\5 CCN\\Documents\\3 MR + AB\\CR30036_CR30048\\CR30048\\Test Data v1.0\\Upload to MR\\SN1a - CR30036R1C DHL Corrected-R.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/3 Freight - Contract/input_DropZone_btnUpload'))

