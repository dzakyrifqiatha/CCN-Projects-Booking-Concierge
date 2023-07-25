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

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/Qty_packages_UNID'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_New Booking'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__awbPrefix'), '618')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__origin'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__destination'), 'CGK')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__goodsDescription'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__pieces'), '2')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__weight'), '2')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__volume'), '2')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input__commodityInfo'), 'DGR')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_00927780'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/i_Operational_bx bx-search'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Search'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_0274'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code'), 'SHP01')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Account no_accountNo'), '1234567890')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name'), 'TEST SHIPPER')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address'), 'TEST ADDRESS')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), '92455')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Contact No_contactNo'), '655123456')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Fax No'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Fax No_faxNo'), '655123455')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Yes'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_77777781'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Consignee_ccn-CCNWCBCConsignee-AddButton'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code'), 'CNE1')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Account no_accountNo'), '123456781923')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name'), 'TEST COSIGNEE')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address'), 'TESTING ADDRESS')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), '')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode'), '92342')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Contact No_contactNo'), '655182738')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Fax No_faxNo'), '6551672738')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Yes'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/svg'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Theres no available AWB No. under 618 f_0d7603'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Consignee is created successfully'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_-_awbSuffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/a_20722015'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_SAVE'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Dangerous Goods Details_btn-close'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/svg_1'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Type_commodityType'), 'TEST')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_For insurance purpose_commodityDescription'), 'TEST INSURANCE')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Goods Value(SGD)_goodsValue'), '12')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Code_code_1'), 'SHP')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Name_name_1'), 'TEST SHIPPER')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/Qty_packages_UNID'), 
    'testtestbc2@hotmail.com')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Address_address_1'), 'TESTING ADDRESS')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_City_city_1'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_State_state_1'), 'SIN')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Country_country_1'), 'SG')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Postal Code_postalCode_1'), '123123')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Get Quote'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Something went wrong.Please contact sys_fefb56'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Insurance DetailsCommodity TypeGoods De_89d0a1'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/search_suffix'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Type_uld'), 'FLA')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_ULD Contour_contour'), 'l')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Num of ULD_number'), '2')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Weight Per ULD (kg)_weight'), '3')

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Commodity Code_commodityCode'), 'ACP')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Save_1'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/td_FLA'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/button_Send Request'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/div_Dangerous Goods Information_CCNBC-Dange_a89f46'))

WebUI.setText(findTestObject('Object Repository/NEW/dev_BC/Booking/input_UNID_unidSerNum'), '1723')

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_Proper Shipping Name_properShippingName'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_PG_packingGroup'))

WebUI.click(findTestObject('Object Repository/NEW/dev_BC/Booking/input_The value cannot higher than 0_netQua_c862a7'))

