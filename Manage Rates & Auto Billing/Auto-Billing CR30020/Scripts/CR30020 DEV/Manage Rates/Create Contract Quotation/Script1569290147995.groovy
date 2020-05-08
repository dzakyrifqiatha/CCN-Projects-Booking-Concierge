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

WebUI.callTestCase(findTestCase('CR30020 DEV/Login/1 Login DEV (Airline)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/MR'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Contract Quotation'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/btn_Add Record'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Customer Code'), 'AZISIN01')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Shipper Consignee'), '*')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Currency'), 'SGD')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Effective Date'), '01/07/2019')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Expiry Date'), '31/12/2019')

WebUI.verifyElementChecked(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Freight'), 
    5)

WebUI.verifyElementChecked(findTestObject('Page_Manage Rates/Contract Quotation/Add Contaact Quotation/checkbox_Airline Related'), 
    5)

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Overseas Handling'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Local Handling'))

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/tab_Freight'))

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/btn_Add Record Freight'))

WebUI.switchToWindowTitle('Freight - Edit Record')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/ipnut_Carrier Code'), 
    'SQ')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Origin'), 
    'SIN')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Destination'), 
    'KUL')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Cargo Class'), 
    'GEN')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Currency'), 
    'SGD')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Weight UOM'), 
    'KGM')

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/btn_Add Record'))

WebUI.switchToWindowTitle('Freight Weight Break Details')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Rate Class'), 
    'M')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_IATA Rate'), 
    '95')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Sales Amount'), 
    '33.25')

not_run: WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/btn_Save'))

WebUI.switchToWindowTitle('Freight - Edit Record')

