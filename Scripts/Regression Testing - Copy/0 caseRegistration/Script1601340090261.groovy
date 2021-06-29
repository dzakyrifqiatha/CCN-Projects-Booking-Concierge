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

WebUI.callTestCase(findTestCase('Authentication Login/Login - New DEV Server'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.waitForPagLoad)

/*
 * Registration Failed - Checking fields error message
 */
'Case 1 : Registration Failed - Checking all the fields error message'
WebUI.callTestCase(findTestCase('BC1/Sprint 1/Registration Process/2 Registration Failed - Check Field'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ccnpackage.LogResults.searchresult'('Checking all the fields error messages - Success', 'Yes')

WebUI.refresh()

WebUI.waitForPageLoad(GlobalVariable.waitForPagLoad)

/*
 * Registration Success - Success create an account
 */
'Case 2 : Registration Sucess - Success create an account'
WebUI.callTestCase(findTestCase('BC1/Sprint 1/Registration Process/0 Registration Success'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ccnpackage.LogResults.searchresult'('Create an account - Success', 'Yes')

WebUI.refresh()

WebUI.waitForPageLoad(GlobalVariable.waitForPagLoad)

WebUI.callTestCase(findTestCase('BC1/Sprint 1/Registration Process/1 Registration Failed - Email Existed'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ccnpackage.LogResults.searchresult'('Unable to create an account due to email already existed - Success', 
    'Yes')

WebUI.callTestCase(findTestCase('Open New Tab'), [('path') : 'www.yopmail.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.waitForPagLoad)

WebUI.setText(findTestObject('Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    GlobalVariable.vEmailSuccess)

