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

WebUI.click(findTestObject('Page_BCPortalAdminApp/a_CONFIGURATIONS'))

WebUI.click(findTestObject('Page_BCPortalAdminApp/a_equalizerDensity Group'))

WebUI.click(findTestObject('Page_BCPortalAdminApp/button_refresh - DG'))

WebUI.click(findTestObject('Page_BCPortalAdminApp/button_add - DG'))

WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_AWB Prefix - DG'), DG_Prefix)

if (WebUI.verifyElementPresent(findTestObject('Page_BCPortalAdminApp/span_popup'), 3, FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_BCPortalAdminApp/span_popup'), findTestData('Regression - BC Portal Admin').getValue(
            'DG_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.verifyElementText(findTestObject(null), '')

