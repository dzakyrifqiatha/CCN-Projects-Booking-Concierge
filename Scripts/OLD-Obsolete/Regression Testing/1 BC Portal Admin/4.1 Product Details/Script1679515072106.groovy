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

WebUI.click(findTestObject('Page_BCPortalAdminApp/a_CONFIGURATIONS'))

WebUI.click(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/a_detailsProduct Detail'))

WebUI.click(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/button_refresh_ProductDetail'))

WebUI.click(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/button_add_ProductDetail'))

WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_AWBPrefix'), VAS_Prefix)

WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Code'), VAS_Services)

WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Origin'), VAS_Services)

WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)

if (ProductDetail_SHC == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
} else if (ProductDetail_SSR == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
} else if (ProductDetail_OSI == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
} else if (ProductDetail_SRI == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
}

if (ProductDetail_EDI == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
} else if (ProductDetail_Email == 'Yes') {
    WebUI.check(findTestObject('Sprint 5 (BC Portal Admin)/Page_BcAdminApp/input_AddProductDetail_Description'), VAS_Services)
}

if (WebUI.verifyElementPresent(findTestObject('Page_BCPortalAdminApp/span_popup'), 3, FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Page_BCPortalAdminApp/span_popup'), findTestData('Regression - BC Portal Admin').getValue(
            'VAS_popup', GlobalVariable.G_TestRowNo), FailureHandling.CONTINUE_ON_FAILURE)
}

