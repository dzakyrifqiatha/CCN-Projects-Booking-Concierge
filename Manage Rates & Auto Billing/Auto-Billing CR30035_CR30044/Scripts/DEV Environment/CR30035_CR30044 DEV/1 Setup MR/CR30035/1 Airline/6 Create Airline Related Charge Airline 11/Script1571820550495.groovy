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

WebUI.callTestCase(findTestCase('DEV Environment/Login DEV/1 Login DEV (Airline)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/MR'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Contract Quotation'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Contract Quotation'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/2 Adhoc Quotation/btn_Add Record Adhoc'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Customer Code'), 'AZISIN01')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Shipper Consignee'), '*')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Currency'), 'SGD')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Effective Date'), '1/8/2019')

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Expiry Date'), '30/11/2019')

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Freight'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Local Handling'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Overseas Handling'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_As Charged'))

for (def row = 1; row <= findTestData('CR30035/1 Airline/6 Airline Related Charge').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/btn_Add Record Airline Related'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Carrier Code_cbAirlineID'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Carrier Code', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Charge Code_cbChargeCode'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Charge Code', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Cargo Class_cbCargoClass'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Cargo Class', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Handling Code_cbHandlingCode'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Handling Code', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Weight UOM_cbWeightUOM'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Weight UOM', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Weight Type_cbWeightType'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Weight Type', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Sectors_SectorsbtnAdd'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_ImportExport_cbImportExport'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Import/Export', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Origin_cbOriginDestination'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Origin/Destination', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Rate Type_cbRateType'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Rate Type', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_MinStd Sell Amt_txtMinStdSellAmount'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Min/Std Amount', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Search for Country or City_txtCityKeyword'), 
        'MANILA')

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Search for Country or City_btnCitySearch'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/span_Weight Break Details'))

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_btnAddWeightBreakDetails'))

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_WeightBreak'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Weight Break', row))

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Amount'), 
        findTestData('CR30035/1 Airline/6 Airline Related Charge').getValue('Amount', row))

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_No records to display_btnSave (1)'))
}

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/btn_Save'))

