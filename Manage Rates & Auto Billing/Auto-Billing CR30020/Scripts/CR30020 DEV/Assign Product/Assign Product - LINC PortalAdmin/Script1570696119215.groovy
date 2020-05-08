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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://devchbcps1portaladminweb.dev.ccn/PortalAdminWeb/Landing/Landing.aspx')

WebUI.setText(findTestObject(null), '')

WebUI.setText(findTestObject(null), '')

WebUI.click(findTestObject(null))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('LINCPortal Admin/a_Company Management'))

WebUI.delay(3)

WebUI.click(findTestObject('LINCPortal Admin/btn_Assign Product to Station'))

WebUI.setText(findTestObject('LINCPortal Admin/input_Company Code'), 'CCNBTH01')

not_run: WebUI.waitForJQueryLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('LINCPortal Admin/input_Company Code - found'))

WebUI.delay(3)

WebUI.setText(findTestObject('LINCPortal Admin/input_City'), 'KUL')

not_run: WebUI.waitForJQueryLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('LINCPortal Admin/input_City - found'))

WebUI.delay(3)

WebUI.setText(findTestObject('LINCPortal Admin/input_ProductPackage'), 'Manage Air Cargo Rates')

not_run: WebUI.waitForJQueryLoad(5)

WebUI.delay(2)

WebUI.click(findTestObject('LINCPortal Admin/input_ProductPackage - found'))

WebUI.delay(3)

WebUI.click(findTestObject('LINCPortal Admin/btn_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('LINCPortal Admin/a_Click Here to Configure'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.delay(5)

WebUI.click(findTestObject('LINCPortal Admin/Product Configuration/span_Language - English'))

WebUI.click(findTestObject('LINCPortal Admin/Product Configuration/btn_Move to Left'))

WebUI.setText(findTestObject('LINCPortal Admin/Product Configuration/input_Station Currency'), 'SGD')

WebUI.delay(3)

WebUI.click(findTestObject('LINCPortal Admin/Product Configuration/input_Station Currency - found'))

WebUI.delay(3)

WebUI.click(findTestObject('LINCPortal Admin/Product Configuration/btn_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('LINCPortal Admin/Product Configuration/btn_OK'))

WebUI.switchToWindowIndex(0)

