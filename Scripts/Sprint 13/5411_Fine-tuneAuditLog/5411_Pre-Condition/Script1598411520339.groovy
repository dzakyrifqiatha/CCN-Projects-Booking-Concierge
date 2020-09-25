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

//create group start
WebUI.click(findTestObject('Page_Booking Concierge Homepage/Navbar/span_Group Management'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Group Management/a_Create Group'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Group Management/input__Group Name'), vGroupName)

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), vGroupMember1)

WebUI.focus(findTestObject('Page_Group Management/input__Group Name'))

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), vGroupMember2)

WebUI.focus(findTestObject('Page_Group Management/input__Group Name'))

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), vGroupMember3)

WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

WebUI.click(findTestObject('Page_Group Management/span_Origin_tag'))

WebUI.setText(findTestObject('Page_Group Management/input_Origin_tag value'), vRuleOrigin)

WebUI.click(findTestObject('Page_Group Management/mat-icon_done rules row'))

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 13\\5411_Create Group.png')

WebUI.click(findTestObject('Page_Group Management/button_Save Group'))

if (WebUI.verifyElementText(findTestObject('Object Repository/Page_Booking Concierge Homepage/verification/popup_success'), 
    'Group created successfully')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Create Group Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 13\\5411_Create Group Success.png')

//create group end
//create Booking Record 1
WebUI.switchToWindowTitle('Booking Concierge Dashboard')

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix1)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vRuleOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination1)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc1)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces1)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix2)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vRuleOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination2)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc2)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces2)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

WebUI.delay(5)

//Logout BC
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), vGroupMember1)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

//Login to Group Member 2 account
WebUI.delay(2)

WebUI.waitForPageLoad(10)

//Create Booking Record 3
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix3)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vRuleOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination3)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc3)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces3)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

//Create Booking Record 3 end
WebUI.delay(5)

//Logout BC
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Email Address_email (Common Login)'), vGroupMember2)

WebUI.setText(findTestObject('Page_BC Common Login Page/input_Password_password (Common Login)'), 'password')

WebUI.click(findTestObject('Page_BC Common Login Page/button_Sign in (Common Login)'))

//Login to Group Member 3 account
WebUI.delay(2)

WebUI.waitForPageLoad(10)

//Create Booking Record 4
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_New Booking'))

WebUI.click(findTestObject('Page_Booking Concierge Homepage/mat-option_New Booking'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-AWB Prefix'), vPrefix)

WebUI.setText(findTestObject('Page_Create New Booking/input_-_mat-input-AWB Suffix'), vSuffix4)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Origin'), vRuleOrigin)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Destination'), vDestination4)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Good Description'), vGoodsDesc4)

WebUI.setText(findTestObject('Page_Create New Booking/input__mat-input-Pieces'), vPieces4)

WebUI.click(findTestObject('Page_Create New Booking/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create New Booking/Page_Save Booking/button_Record Booking'))

//Create Booking Record 4 end
WebUI.click(findTestObject('Page_Booking Concierge Homepage/span_Sign out exit_to_app'))

