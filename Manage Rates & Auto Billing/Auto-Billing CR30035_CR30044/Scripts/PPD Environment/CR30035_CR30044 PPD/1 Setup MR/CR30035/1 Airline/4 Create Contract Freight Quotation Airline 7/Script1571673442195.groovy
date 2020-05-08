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

WebUI.callTestCase(findTestCase('PPD Environment/Login PPD/1 Login PPD (Airline)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

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

WebUI.focus(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Customer Code'))

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Customer Code'), 'AZISIN01')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Customer Code - found'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.focus(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Shipper Consignee'))

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Shipper Consignee'), '*')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_ShipperConsignee - found'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.focus(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Currency'))

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Currency'), 'SGD')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Currency - found'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Effective Date'), '1/8/2019')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/input_Expiry Date'), '30/11/2019')

WebUI.delay(3)

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Airline Related'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Local Handling'))

WebUI.uncheck(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/checkbox_Overseas Handling'))

for (def row = 1; row <= findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/btn_Add Record Freight'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Carrier Code'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vCarrierCode, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Carrier Code - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Origin'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vOrigin, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Origin - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Destination'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vDestination, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Destination - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Cargo Class'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vCargoClass, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Cargo Class - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Currency'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vCurrency, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Currency - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_WeightUOM'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vWeightUOM, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_WeightUOM - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/input_Flight Number'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vFlightNumber, row))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/btn_Add Record'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Rate Class'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vRateClass, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Rate Class - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_ULD Class'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vULDClass, row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_ULD Class - found'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Weight Break'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vWeightBreak, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_IATA Rate'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vIATA, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Cost Amount'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vCostAmount, row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/input_Sales Amount'), 
        findTestData('CR30035/1 Airline/4 Freight Contract Quotation').getValue(vSalesAmount, row))

    WebUI.delay(2)

    not_run: WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/Add Record/btn_Save'))
}

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Manage Rates/Contract Quotation/Add Contract Quotation/Freight - Add Record/btn_Save'))

