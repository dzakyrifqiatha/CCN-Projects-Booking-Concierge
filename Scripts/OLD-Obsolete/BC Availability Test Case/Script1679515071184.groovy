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

WebUI.callTestCase(findTestCase('OLD-Obsolete/BC1/Sprint 2/Login to Booking Concierge/0 Login Success'), [('vEmail') : 'testingbc1@hotmail.com'
        , ('vPass') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/img_My Bookings_logo-image'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/cube-navigator'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/mat-icon_info'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/mat-icon_settings'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/mat-icon_exit_to_app'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/h1_My Bookings'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/a_My Airlines'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_My Airlines_mat-form-field-flex ng-tns-c70-0'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_35Draft'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_220Sent'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_45Confirmed'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_22Rejected'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_3Cancelled'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_14Wait List'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/div_20Error'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/img_My Bookings_logo-image'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_AWB No'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Origin'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Destination'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Pieces'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Weight'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Goods Description'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Booking Status'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Last UpdatedDate Time (UTC   8)'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Created By'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Last Updated By'))

WebUI.verifyElementVisible(findTestObject('OLD-Obsolete/BC/BC Homepage/Page_Booking Concierge Dashboard/th_Airline Recipient'))

