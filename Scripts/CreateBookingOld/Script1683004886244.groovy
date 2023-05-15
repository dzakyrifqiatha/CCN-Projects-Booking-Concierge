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

WebUI.click(findTestObject('NEW/Page_Booking Concierge Dashboard/inputCreateBooking'))

WebUI.click(findTestObject('NEW/Page_Booking Concierge Dashboard/btnNewBooking'))

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_AWB Prefix'), '618')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_AWB Suffix'), '123456')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Origin'), 'SIN')

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - btn_search AWB Stock'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - Stock - div_1st AWB'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Destination'), 'CGK')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Goods Desc'), 'TESTING')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Pieces'), '12')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Weight'), '13')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Volume'), '14')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) input_Density Group'), '')

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Commodity Info'), 'DGR', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - Commodity - span_DGR  - DGR (GENERAL DANGEROUS GOODS)'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Commodity Item Number'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_SHC1'), 'RFL', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - SHC1 - span_RFL'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - DGR Alert - button_Ok'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_SHC2'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - input_Product'), '', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/0 Booking Details/0 (BD) - Product - span_AEROSPACE  - Transportstate-of-the-art aviationproducts worldwide'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - mat-card-title_Agent Information'), 
    'Agent Information')

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - Company Name'), 'DHL GLOBAL FORWARDING SINGAPORE PT')

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - Station'), 'SIN')

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - IATA Code'), '3231696')

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - CASS Code'), '0000')

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/1 Agent Information/1 (AI) - Account No'), '1234567')

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - button_add'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_UNID'), '', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - span_UNID 1st Row'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - span_Proper Shipping Name'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - span_Proper Shipping Name 1st Row'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - div_Packing Group'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - span_Packing Group 1st Row'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Class'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Subrisk 1'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Subrisk 2'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Subrisk 3'), '', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - btn_search PI'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - div_PI 1st Row'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_ERG'), '', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_SCC 1'), '', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_SCC 2'), '', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_SCC 3'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_TI'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_No of Packages'), '', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Qty Per Package'), '', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - input_Unit'), '', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/2 Dangerous Goods/2 (DG) - btn_Save DG'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - button_add Flights'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - input_Carrier Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - input_Flight No'), '123', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - input_Date'), '20-Mar-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - input_Departure'), 'SIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - input_Arrival'), 'CGK', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - div_Allocation Code'), 'NN', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - button_Save Flights'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/3 Flights/3 (Flights) - btn_search FS'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - input_FS_Carrier Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - input_FS_Flight Date'), '20-Mar-23', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - input_FS_Origin'), 'SIN', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - input_FS_Destination'), 'CGK', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - btn_SEARCH Flights'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/3 Flights/3 (FS) - div_FS 3rd Row'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - btn_add Shipper'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Account No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Name'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Address'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper City'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper State'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Country'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Postal Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Contact No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - input_Shipper Fax No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/4 Shipper/4 (Shipper) - btn_Save Shipper'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - btn_add Consignee'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Account No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Name'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Address'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee City'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee State'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Country'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Postal Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Contact No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - input_Consignee Fax No'), 'SQ', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/5 Consignee/5 (Consignee) - btn_Save Consignee'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - btn_add Insurance'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - h3_Insurance View modals'), 
    '', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Ccommodity Type'), 'A', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - span_Animal or vegetable fats'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Goods Desc'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Goods Value'), 'SQ', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Insured Value'), '', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper Company Name'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper Address'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper City'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper State'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper Country'), 'SQ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - input_Shipper Postal Code'), 'SQ', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('NEW/Page_Create Booking/6 Insurance/6 (Insurance) - btn_Get Quote'), FailureHandling.OPTIONAL)

