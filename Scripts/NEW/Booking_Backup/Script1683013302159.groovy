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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://bookingconcierge2ppd.ccnhub.com/')
//
//WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Email Address_Sign in name'), 'testtestbc2@hotmail.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Forgot your password_Password'), '8SQVv/p9jVScEs4/2CZsLw==')
//
//WebUI.sendKeys(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Forgot your password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/create_booking'))

WebUI.click(findTestObject('Object Repository/li_New Booking'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__awbPrefix'), '618')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__origin'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__destination'), 'BKK')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__goodsDescription'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__pieces'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__weight'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__volume'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__commodityInfo'), 'GEN')

WebUI.click(findTestObject('Object Repository/span_awbSuffix is a required field_awb-lookup-button'))

WebUI.click(findTestObject('Object Repository/a_00000011'))

// Flight
WebUI.click(findTestObject('Object Repository/span_Operational_ccn-wc-bc-flight-section-search'))

WebUI.setText(findTestObject('Object Repository/input_Carrier Code_carrierCode'), 'SQ')

WebUI.click(findTestObject('Object Repository/button_Search'))

WebUI.click(findTestObject('Object Repository/a_SQ0714'))

// UNID
WebUI.click(findTestObject('Object Repository/span_Dangerous Goods Information_ccn-wc-bc-dangerous-goods-add-icon'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_UNID_unidSerNum'), '1990')

WebUI.sendKeys(findTestObject('Input'), Keys.chord('Text String', Keys.ENTER, Keys.TAB))

WebUI.click(findTestObject('Object Repository/input_Proper Shipping Name_properShippingName'))

WebUI.click(findTestObject('Object Repository/li_Benzaldehyde'))

WebUI.click(findTestObject('Object Repository/input_PG_packingGroup'))

WebUI.click(findTestObject('Object Repository/li_III'))

WebUI.setText(findTestObject('Object Repository/input_PI_cargoPackingInstruction'), 'Y964')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_TI_transportIndex'), '1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/number_of_packages_UNID'), '1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Qty_packages_UNID'), '1')

WebUI.click(findTestObject('Object Repository/button_SAVE'))

// Shipper
WebUI.click(findTestObject('Object Repository/span_Shipper_CCNWCBCShipperMetaID'))

WebUI.setText(findTestObject('Object Repository/shipper/input_Code_code'), 'SHP1')

WebUI.setText(findTestObject('Object Repository/shipper/input_Account no_accountNo'), '123123123')

WebUI.setText(findTestObject('Object Repository/shipper/input_Name_name'), 'TESRT')

WebUI.setText(findTestObject('Object Repository/shipper/input_Address_address'), 'TEST')

WebUI.setText(findTestObject('Object Repository/shipper/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/shipper/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/shipper/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/shipper/input_Postal Code_postalCode'), '14312')

WebUI.setText(findTestObject('Object Repository/shipper/input_Contact No_contactNo'), '65278931')

WebUI.setText(findTestObject('Object Repository/shipper/input_Fax No_faxNo'), '65893847')

WebUI.click(findTestObject('Object Repository/shipper/button_Save'))

WebUI.click(findTestObject('Object Repository/button_Yes'))

// Cosignee
WebUI.click(findTestObject('Object Repository/Cos/span_Consignee_CCNWCBCConsigneeMetaID'))

WebUI.setText(findTestObject('Object Repository/Cos/input_Code_code'), 'CNE2')

WebUI.setText(findTestObject('Object Repository/Cos/input_Account no_accountNo'), '12312312')

WebUI.setText(findTestObject('Object Repository/Cos/input_Name_name'), 'TEST')

WebUI.setText(findTestObject('Object Repository/Cos/input_Address_address'), 'TEST')

WebUI.setText(findTestObject('Object Repository/Cos/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/Cos/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/Cos/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/Cos/input_Postal Code_postalCode'), '124231')

WebUI.setText(findTestObject('Object Repository/Cos/input_Contact No_contactNo'), '19203948')

WebUI.setText(findTestObject('Object Repository/Cos/input_Fax No_faxNo'), '15422123')

WebUI.click(findTestObject('Object Repository/Cos/button_Save'))

WebUI.click(findTestObject('Object Repository/Cos/button_Yes'))

// ULD
WebUI.click(findTestObject('Object Repository/uld/span_Unit Loading Device_unit-loading-device-section'))

WebUI.click(findTestObject('Object Repository/uld/input_ULD Type_uld'))

WebUI.click(findTestObject('Object Repository/uld/li_AAA'))

WebUI.click(findTestObject('Object Repository/uld/input_ULD Contour_contour'))

WebUI.click(findTestObject('Object Repository/uld/li_Q6'))

WebUI.setText(findTestObject('Object Repository/uld/input_Num of ULD_number'), '1')

WebUI.setText(findTestObject('Object Repository/uld/input_Weight Per ULD (kg)_weight'), '10')

WebUI.click(findTestObject('Object Repository/uld/input_Commodity Code_commodityCode'))

WebUI.click(findTestObject('Object Repository/uld/li_RFS'))

WebUI.click(findTestObject('Object Repository/uld/button_Save'))

// send booking
WebUI.click(findTestObject('Object Repository/button_Send Request'))

//close
WebUI.closeBrowser()

