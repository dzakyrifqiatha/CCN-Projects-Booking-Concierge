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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_BcAdminApp/a_CONFIGURATIONS'))

WebUI.click(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/a_edit_noteBooking Template'))

WebUI.click(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/button_Booking Template_add'))

WebUI.setText(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/input_Booking Template_AWB Prefix'), '')

WebUI.setText(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/input_Booking Template_Station'), '')

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkOrigin'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkDestination'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkPieces'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkGoodsDesc'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkWeight'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkVolume'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkCommodityInfo'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkSHC'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkValueAdded'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkProductCode'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkFlight'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkDimension'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkULD'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkOSI'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkSSR'), 
    0)

WebUI.verifyElementChecked(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/div_Booking Template_chkTemperature'), 
    0)

WebUI.click(findTestObject('Page_BcAdminApp/Page_BcAdminApp Booking Template/button_Booking Tempate_Done'))

