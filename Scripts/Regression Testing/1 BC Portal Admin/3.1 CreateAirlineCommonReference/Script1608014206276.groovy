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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.click(findTestObject('Page_BCPortalAdminApp/a_CONFIGURATIONS'))

WebUI.click(findTestObject('Page_BCPortalAdminApp/icon_refresh_Airline - ACR'))

WebUI.click(findTestObject('Page_BCPortalAdminApp/icon_add_Airline - ACR'))

WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_AirlineName - ACR'), ACR_Name)

WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_AirlineCode - ACR'), ACR_Code)

WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_AirlinePrefix - ACR'), ACR_Prefix)

WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_AirlineStation - ACR'), ACR_Origin_Station)

WebUI.click(findTestObject('Page_BCPortalAdminApp/div_ServiceType_BOOKING - ACR'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BCPortalAdminApp/span_ServiceType_BOOKING - ACR'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BCPortalAdminApp/div_SendMode_EMAIL - ACR'), FailureHandling.STOP_ON_FAILURE)

//EDI = findTestData('Regression - BC Portal Admin'.getValue("ACR_SendMode", "EDI"))
//
//Email = findTestData('Regression - BC Portal Admin'.getValue("ACR_SendMode", "Email"))
if (ACR_SendMode == 'EDI') {
    WebUI.click(findTestObject('Object Repository/Page_BCPortalAdminApp/span_SendMode_EDI - ACR'))

    WebUI.setText(findTestObject('Object Repository/Page_BCPortalAdminApp/input_SendMode_SystemBOX - ACR'), ACR_SystemBox)
} else if (ACR_SendMode == 'Email') {
    WebUI.click(findTestObject('Object Repository/Page_BCPortalAdminApp/span_SendMode_EMAIL - ACR'))

    WebUI.setText(findTestObject('Object Repository/Page_BCPortalAdminApp/input_SendMode_Email - ACR'), ACR_Email)
}

//WebUI.click(findTestObject('Page_BCPortalAdminApp/span_SendMode_EMAIL - ACR'), FailureHandling.STOP_ON_FAILURE)
//WebUI.setText(findTestObject('Page_BCPortalAdminApp/input_SendMode_Email - ACR'), ACR_Email)
//ACR_Toggle = findTestData('Regression'.getValue("ACR_Toggle", GlobalVariable.G_TestRowNo))
if ((ACR_Toggle == 'No') && (ACR_SendMode == 'Email')) {
    WebUI.click(findTestObject('Page_BCPortalAdminApp/span_ToggleEditable - ACR'))

    WebUI.click(findTestObject('Page_BCPortalAdminApp/button_Save_Airline - ACR'))
} else {
    WebUI.click(findTestObject('Page_BCPortalAdminApp/button_Save_Airline - ACR'))
}

//WebUI.click(findTestObject('Page_BCPortalAdminApp/button_Save_Airline - ACR'))
WebUI.waitForElementPresent(findTestObject('Page_BCPortalAdminApp/span_popup'), 3)

if (WebUI.verifyElementPresent(findTestObject('Page_BCPortalAdminApp/span_popup'), 3, FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_BCPortalAdminApp/span_popup'), findTestData('Regression - BC Portal Admin').getValue(
            'ACR_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
}

save_disabled = WebUI.getAttribute(findTestObject('Page_BCPortalAdminApp/button_Save_Airline - ACR'), 'disabled', FailureHandling.OPTIONAL)

if (save_disabled == 'true') {
    if (WebUI.verifyElementPresent(findTestObject('Page_BCPortalAdminApp/div_EmailError'), 1, FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Page_BCPortalAdminApp/div_EmailError'), findTestData('Regression - BC Portal Admin').getValue(
                'ACR_Error', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
    }
}

WebUI.click(findTestObject('Page_BCPortalAdminApp/icon_refresh_Airline - ACR'), FailureHandling.OPTIONAL)
