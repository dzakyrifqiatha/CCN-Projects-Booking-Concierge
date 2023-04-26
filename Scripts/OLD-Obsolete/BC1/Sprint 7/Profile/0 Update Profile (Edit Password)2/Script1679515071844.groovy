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

WebUI.click(findTestObject('Page_Edit Profile/mat-icon_Profile'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Edit Profile/input_Enter Old Password'), findTestData('Profile/TestData_Profile').getValue(
        1, 1))

WebUI.setText(findTestObject('Page_Edit Profile/input_Enter New Password'), findTestData('Profile/TestData_Profile').getValue(
        2, 1))

WebUI.setText(findTestObject('Page_Edit Profile/input_Confirm New Password'), findTestData('Profile/TestData_Profile').getValue(
        2, 1))

WebUI.click(findTestObject('Page_Edit Profile/button_Save Edit Profile'))

WebUI.delay(5)

if (WebUI.verifyElementText(findTestObject('Page_Edit Profile/verification/popup_success'), 'User profile updated.')) {
    CustomKeywords.'ccnpackage.LogResults.searchresult'('Update User Profile Success', 'Yes')
}

WebUI.takeScreenshot('D:\\Works\\Cargo Community Network Pte Ltd\\Apps\\Booking Concierge\\Result Regression Testing\\v1\\Sprint 7\\Edit Profile - Success.png')
