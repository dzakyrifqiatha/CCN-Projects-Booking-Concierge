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

WebUI.callTestCase(findTestCase('PPD Environment/Login PPD/1 Login PPD (Agent)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/div_myAppRMS3'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Buy Rate'))

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Freight Blocked Space - Fixed'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Freight Blocked Space - Fixed'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/input_Add Record'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/input_CustomerCode'), vCustomerVendorCode)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/input_ShipperConsignee'), vShipperConsignee)

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Contract Number_ctl00ctl00ContentPlaceHolderSubPageContenttxtContactNumber'), 
    vContractNumber)

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/textarea_Header Remarks_ctl00ctl00ContentPlaceHolderSubPageContenttxtHeaderRemark'), 
    '')

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Currency_ctl00ctl00ContentPlaceHolderSubPageContentcboCurrency'), 
    vCurrency)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_RadDatePicker_ctl00ctl00ContentPlaceHolderSubPageContenttxtEffectiveDatedateInput'), 
    vEffectiveDate)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_RadDatePicker_ctl00ctl00ContentPlaceHolderSubPageContenttxtExpiryDatedateInput'), 
    vExpiryDate)

WebUI.delay(3)

for (def row = 1; row <= findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Freight Sectors_ctl00ctl00ContentPlaceHolderSubPageContentFreightSectorsbtnAdd'))

    WebUI.delay(10)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Carrier Code_cbAirlineID'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Carrier Code', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Carrier Code - found'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Flight Number'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Flight Number', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Origin_cbOrigin'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Origin', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Origin - found'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Destination_cbDestination'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Destination', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Destination - found'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Via_cbVia'), 
        '')

    not_run: WebUI.delay(3)

    not_run: WebUI.setText(findTestObject(null), '')

    not_run: WebUI.delay(2)

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Aircraft Model_cbAircraftModel'), 
        '')

    not_run: WebUI.delay(3)

    not_run: WebUI.setText(findTestObject(null), '')

    not_run: WebUI.delay(2)

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Allotment ID_txtAllotmentID'), 
        '')

    not_run: WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Currency_cbCurrency'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Currency', row))

    WebUI.delay(3)

    not_run: WebUI.click(findTestObject(null), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Weight UOM_cbWeightUOM'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Weight UOM', row))

    WebUI.delay(3)

    not_run: WebUI.click(findTestObject(null), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Cargo Class_cbCargoClass'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Cargo Class', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Cargo Class - found'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Allocated Weight_txtAllocatedWeight'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Allocated Weight', row))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate Per KGM_txtRatePerKGM'), 
        findTestData('CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Rate Per KGM', row))

    WebUI.delay(3)

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/textarea_Remarks_txtRemark'), 
        '')

    not_run: WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_ULD Details_btnAdd'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_ULD Code'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('ULD Code', row))

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_PivotWeight'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Pivot Weight'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Pivot Weight', row))

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_RateperULD'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate per ULD'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Rate Per ULD', row))

    not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_OverPivotWeightRate'))

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Over Pivot Weight Rate'), 
        '')

    not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_RateperSpillover'))

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate per SpillOver'), 
        '')

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_Quantity'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Quantity'), findTestData(
            'CR30035/2 Agent/2 Blocked Space (Fixed) Quotation').getValue('Quantity', row))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Pivot Weight_btnSave'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_No records to display_ctl00ctl00ContentPlaceHolderSubPageContentbtnSave'))

