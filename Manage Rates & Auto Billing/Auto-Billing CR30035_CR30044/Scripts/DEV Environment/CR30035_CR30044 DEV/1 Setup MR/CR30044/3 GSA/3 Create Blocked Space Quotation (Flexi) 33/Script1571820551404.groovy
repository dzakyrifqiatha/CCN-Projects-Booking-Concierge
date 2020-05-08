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

WebUI.verifyElementVisible(findTestObject('Page_Manage Rates/1 Navbar/a_Blocked Space Quotation (Flexi)'))

WebUI.click(findTestObject('Page_Manage Rates/1 Navbar/a_Blocked Space Quotation (Flexi)'))

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

for (def row = 15; row <= 2; row++) {
    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Freight Sectors_ctl00ctl00ContentPlaceHolderSubPageContentFreightSectorsbtnAdd'))

    WebUI.delay(10)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Carrier Code_cbAirlineID'), 
        vCarrierCode)

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Carrier Code - found'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Flight Number'), vFilghtNumber)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Origin_cbOrigin'), vOrigin)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Origin - found'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Destination_cbDestination'), 
        vDestination)

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
        vCurrency2)

    WebUI.delay(3)

    not_run: WebUI.click(findTestObject(null), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Weight UOM_cbWeightUOM'), 
        vWeightUOM)

    WebUI.delay(3)

    not_run: WebUI.click(findTestObject(null), FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Cargo Class_cbCargoClass'), 
        vCargoClass)

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Cargo Class - found'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Allocated Weight_txtAllocatedWeight'), 
        vAllocatedWeight)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate Per KGM_txtRatePerKGM'), 
        vRatePerKGM)

    WebUI.delay(3)

    not_run: WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/textarea_Remarks_txtRemark'), 
        '')

    not_run: WebUI.delay(3)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_ULD Details_btnAdd'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_ULD Code'), vULDCode)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_PivotWeight'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Pivot Weight'), vPivotWeight)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_RateperULD'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate per ULD'), vRatePerULD)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_RatePerExcessWeight'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate Per Excess Weight'), 
        vRatePerExcessWeight)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_RateperSpillover'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Rate per SpillOver'), 
        vRatePerSpillover)

    WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/td_Quantity'))

    WebUI.setText(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Quantity'), vQuantity)

    WebUI.delay(3)

    not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_Pivot Weight_btnSave'))
}

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_Manage Rates/3 Blocked Space Quotation (Fixed)/Page_/input_No records to display_ctl00ctl00ContentPlaceHolderSubPageContentbtnSave'))

