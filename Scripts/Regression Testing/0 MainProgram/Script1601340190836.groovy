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

'need to convert Globalvariable to integer for suite running, somehow it get read a decimal\r\n'
GlobalVariable.G_TestRowNo = ((Test_No) as Integer)

CustomKeywords.'ccnpackage.LogResults.searchresult'(Test_No, 'ok')

if (Test_Reg_Email == 'Yes') {
    WebUI.callTestCase(findTestCase('Regression Testing/1 Registration'), [('Test_No') : findTestData('Regression').getValue(
                'Test_No', GlobalVariable.G_TestRowNo), ('Reg_Email') : findTestData('Regression').getValue('Reg_Email', 
                GlobalVariable.G_TestRowNo), ('Reg_Name') : findTestData('Regression').getValue('Reg_Name', GlobalVariable.G_TestRowNo)
            , ('Reg_Password') : findTestData('Regression').getValue('Reg_Password', GlobalVariable.G_TestRowNo), ('Reg_ConfPassword') : findTestData(
                'Regression').getValue('Reg_ConfPassword', GlobalVariable.G_TestRowNo), ('Reg_Company') : findTestData('Regression').getValue(
                'Reg_Company', GlobalVariable.G_TestRowNo), ('Reg_Contact') : findTestData('Regression').getValue('Reg_Contact', 
                GlobalVariable.G_TestRowNo), ('Reg_popup') : findTestData('Regression').getValue('Reg_popup', GlobalVariable.G_TestRowNo)
            , ('Reg_popup_invalid_email') : findTestData('Regression').getValue('Reg_popup_invalid_email', GlobalVariable.G_TestRowNo)
            , ('Reg_popup_invalid_name') : findTestData('Regression').getValue('Reg_popup_invalid_name', GlobalVariable.G_TestRowNo)
            , ('Reg_popup_invalid_password') : findTestData('Regression').getValue('Reg_popup_invalid_password', GlobalVariable.G_TestRowNo)
            , ('Reg_popup_invalid_contact') : findTestData('Regression').getValue('Reg_popup_invalid_contact', GlobalVariable.G_TestRowNo)
            , ('d_Reg_popup') : '', ('d_Reg_popup_invalid_email') : '', ('d_Reg_popup_invalid_name') : '', ('d_Reg_popup_invalid_password') : ''
            , ('d_Reg_popup_invalid_contact') : ''], FailureHandling.CONTINUE_ON_FAILURE)
}

if (Test_Log_Email == 'Yes') {
    WebUI.callTestCase(findTestCase('Regression Testing/2 Login'), [('Test_No') : findTestData('Regression').getValue('Test_No', 
                GlobalVariable.G_TestRowNo), ('Log_Email') : findTestData('Regression').getValue('Log_Email', GlobalVariable.G_TestRowNo)
            , ('Log_Password') : findTestData('Regression').getValue('Log_Password', GlobalVariable.G_TestRowNo), ('d_Log_popup') : ''], 
        FailureHandling.CONTINUE_ON_FAILURE)
}

if (Test_C_Airline == 'Yes') {
    WebUI.callTestCase(findTestCase('Regression Testing/3.2 CreateAirline'), [('Test_No') : findTestData('Regression').getValue('Test_No', GlobalVariable.G_TestRowNo)
            , ('Airline_Code') : findTestData('Regression').getValue('Airline_Code', GlobalVariable.G_TestRowNo), ('Airline_Prefix') : findTestData('Regression').getValue('Airline_Prefix', GlobalVariable.G_TestRowNo)
            , ('Airline_Station') : findTestData('Regression').getValue('Airline_Station', GlobalVariable.G_TestRowNo), ('Airline_Email') : findTestData('Regression').getValue('Airline_Email', GlobalVariable.G_TestRowNo)
            , ('Airline_Remarks') : findTestData('Regression').getValue('Airline_Remarks', GlobalVariable.G_TestRowNo), ('Airline_CEDI') : findTestData('Regression').getValue('Airline_CEDI', GlobalVariable.G_TestRowNo)
            , ('Airline_CEmail') : findTestData('Regression').getValue('Airline_CEmail', GlobalVariable.G_TestRowNo), ('Airline_popup') : findTestData('Regression').getValue('Airline_popup', GlobalVariable.G_TestRowNo)
            , ('d_Airline_popup') : ''], FailureHandling.STOP_ON_FAILURE)
}

