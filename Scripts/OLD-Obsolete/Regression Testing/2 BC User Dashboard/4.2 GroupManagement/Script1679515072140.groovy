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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.click(findTestObject('Page_Booking Concierge Dashboard/a_Group Management group'))

WebUI.switchToWindowTitle('Group Management')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Group Management/a_Create Group'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Page_Group Management/input__Group Name'), Group_Name)

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), Group_Member1)

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), Group_Member2)

WebUI.setText(findTestObject('Page_Group Management/input_Group Members'), Group_Agent_SystemBox)

WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

if (Group_Rules == 'Yes') {
    WebUI.click(findTestObject('Page_Group Management/mat-icon_add Rules'))

    if (Group_Rules_DType == 'Booking') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_Booking'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.click(findTestObject('Page_Group Management/span_Origin_tag'))

        WebUI.setText(findTestObject('Page_Group Management/input_Origin_tag value'), Group_Rules_Origin)

        WebUI.click(findTestObject('Page_Group Management/mat-icon_done rules row'))
    }
    
    if (Group_Rules_DType == 'Email') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_Email'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Email_From'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Email_Subject'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Filename'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Filetype'), 2)
    }
    
    if (Group_Rules_DType == 'Upload') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_Upload'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Description'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Filename'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Filetype'), 2)
    }
    
    if (Group_Rules_DType == 'TNPermit') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_TNPermit'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_DclrtnType'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FileName'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FileType'), 2)
    }
    
    if (Group_Rules_DType == 'Caremap') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_Caremap'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_AWBNumber'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_docID'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FltrDate'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FltrHour'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FltrMin'), 2)
    }
    
    if (Group_Rules_DType == 'Telegram') {
        WebUI.click(findTestObject('Page_Group Management/div_Document Type Dropdown'))

        WebUI.click(findTestObject('Page_Group Management/span_Telegram'))

        WebUI.click(findTestObject('Page_Group Management/div_Key Tag Rules'))

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_Description'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FileName'), 2)

        WebUI.verifyElementPresent(findTestObject('Page_Group Management/Email/Tag_Rules_FileType'), 2)
    }
}

if (Group_Share == 'Yes') {
    WebUI.verifyElementChecked(findTestObject('Page_Group Management/div_Share my records_toogle'), 3)
}

WebUI.click(findTestObject('Page_Group Management/button_Save Group'))

