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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bookingconcierge2.dev.ccn/')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Email Address_Sign in name'), 'testtestbc2@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Forgot your password_Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.sendKeys(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Forgot your password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/create_booking'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/a_New Booking'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__awbPrefix'), '618')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__origin'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__destination'), 'CGK')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__goodsDescription'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__pieces'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__weight'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__volume'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__commodityInfo'), 'DGR')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_20721971'))\

// Flight

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/i_Operational_bx bx-search'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Search'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_0950'))

// UNID

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/Add_DGR'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_UNID_unidSerNum'), '1990')

WebUI.sendKeys(findTestObject('Input'), Keys.chord('Text String',Keys.ENTER,Keys.TAB))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Proper Shipping Name_properShippingName'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/li_Benzaldehyde'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_PG_packingGroup'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/PG_III'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/input_PI_cargoPackingInstruction'), 'Y964')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_TI_transportIndex'), '1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/number_of_packages_UNID'), '1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Qty_packages_UNID'), '1')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

// Shipper

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/Add_Shipper'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code'), 'SHP1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Account no_accountNo'), '123123123')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name'), 'TESRT')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), '14312')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Contact No_contactNo'), '65278931')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Fax No_faxNo'), '65893847')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Yes'))

// Cosignee

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/Add_Cosignee'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code'), 'CNE2')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Account no_accountNo'), '12312312')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), '124231')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Contact No_contactNo'), '19203948')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Fax No_faxNo'), '15422123')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Yes'))


// Insurance

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/add_insurance'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/path'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Type_commodityType'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_For insurance purpose_commodityDescription'), 'TEST INSURANCE')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Goods Value(SGD)_goodsValue'), '12')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code_1'), 'SHP')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Name'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name_1'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address_1'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city_1'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state_1'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country_1'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode_1'), '154212')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Get Quote'))

// ULD

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Page_BC/Add_ULD'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Type_uld'), 'AAF')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Contour_contour'), 'QL')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Num of ULD_number'), '1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Weight Per ULD (kg)_weight'), '10')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Code_commodityCode'), 'RRY')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Save_1'))

// send booking

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Send Request'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Booking Request is sent'))

