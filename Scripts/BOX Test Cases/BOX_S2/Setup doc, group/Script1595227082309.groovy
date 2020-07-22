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

response = WS.sendRequest(findTestObject('BOXService/Start Box', [('var_email') : 'abraham_farrendy@ccn.com.sg']))

WS.verifyElementPropertyValue(response, 'email', 'abraham_farrendy@ccn.com.sg')

WS.verifyElementPropertyValue(response, 'action', 'START')

response = WS.sendRequest(findTestObject('BOXService/Create Document'))

WS.verifyElementPropertyValue(response, 'encodedContent', 'AA1,BB3,CC2,DD4')

WS.verifyElementPropertyValue(response, 'contentType', 'TEST_ContentType')

WS.verifyElementPropertyValue(response, 'contentName', 'TEST_DEL')

WS.verifyElementPropertyValue(response, 'tags', ["key:TEST_DELETE","key:TEST_DEL"])

response = WS.sendRequest(findTestObject('BOXService/Create Group'))

WS.verifyElementPropertyValue(response, 'groupName', 'group4')

WS.verifyElementPropertyValue(response, 'contacts', ["abraham_farrendy@ccn.com.sg","songmy@ccn.com.sg"])

WS.verifyElementPropertyValue(response, 'tags', [])

WS.verifyElementPropertyValue(response, 'contentType', 'TEST_ContentType')

