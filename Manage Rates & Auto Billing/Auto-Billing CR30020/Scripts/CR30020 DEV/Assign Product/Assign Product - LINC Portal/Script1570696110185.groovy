import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CR30020 DEV/Login/1 Login DEV (Agent TST212)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Landing_Page/span_Setting'))

WebUI.click(findTestObject('Landing_Page/span_Product Management'))

WebUI.delay(5)

WebUI.click(findTestObject('Landing_Page/Product Management Setting/Page_CCNhub LINC/input_Product Management_ctl00ctl00ContentButtonsTopPlaceHolderbtnAssignProductToStation'))

WebUI.delay(5)

WebUI.click(findTestObject('Landing_Page/Product Management Setting/Page_CCNhub LINC/span_KUL(S)'))

WebUI.click(findTestObject('Landing_Page/Product Management Setting/Page_CCNhub LINC/li_KUL(S)'))

WebUI.check(findTestObject('Landing_Page/Product Management Setting/Page_CCNhub LINC/checkbox_Manage Air Cargo Rates'))

WebUI.click(findTestObject('Landing_Page/Product Management Setting/Page_CCNhub LINC/input_NA_ctl00ctl00ContentContentrwdAssignStationCbtnSave'))

