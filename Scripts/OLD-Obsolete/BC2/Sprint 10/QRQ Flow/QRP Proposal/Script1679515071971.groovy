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

WebUI.callTestCase(findTestCase('OLD-Obsolete/Authentication Login/Login - Quotation Proposal'), [('Log_Email') : 'testingdevbc2@gmail.com'
        , ('Log_Password') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/span_First QRP Record'))

WebUI.delay(0)

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/button_add Rate'))

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/div_Rate - Rate Type Dropdown'))

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/span_Rate - Dropdown - Freight'))

WebUI.setText(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/input_Rate - Amount'), '')

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/button_Rate - Save'))

WebUI.click(findTestObject('OLD-Obsolete/Page_QuotationRequestFrontend/Page_QuotationProposalFrontend/button_Submit QRP'))

