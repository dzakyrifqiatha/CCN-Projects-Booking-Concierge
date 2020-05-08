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

WebUI.callTestCase(findTestCase('DEV Environment/Login DEV/1 Login DEV (GSA)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/MR'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Sell Rate'))

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

for (def row = 1; row <= 3; row++) {
    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/btn_Add Record Airline Related'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Carrier Code_cbAirlineID'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vCarrierCode, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Charge Code_cbChargeCode'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vChargeCode, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Cargo Class_cbCargoClass'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vCargoClass, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Handling Code_cbHandlingCode'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vHandlingCode, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Weight UOM_cbWeightUOM'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vWeightUOM, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Weight Type_cbWeightType'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vWeightType, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Sectors_SectorsbtnAdd'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_ImportExport_cbImportExport'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vImportExport, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Origin_cbOriginDestination'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vOriginDestination, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Rate Type_cbRateType'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vRateType, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_MinStd Cost Amount'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vMinStdCostAmount, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_MinStd Sell Amt_txtMinStdSellAmount'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vMinStdAmount, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Search for Country or City_txtCityKeyword'), 
        'MANILA')

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Search for Country or City_btnCitySearch'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/span_Weight Break Details'))

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_btnAddWeightBreakDetails'))

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_WeightBreak'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vWeightBreak, row))

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_Amount'), 
        findTestData('CR30035/3 GSA/5 Airline Related Charge').getValue(vAmount, row))
}

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Airline Related - Add Record/Page_/input_No records to display_btnSave (1)'))

