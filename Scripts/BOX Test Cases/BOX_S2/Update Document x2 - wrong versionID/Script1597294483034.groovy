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

response = WS.sendRequest(findTestObject('BOXService/Create Document', [('encodedContent') : findTestData('BOXService/TD_BoxDocument').getValue(
                1, 1), ('contentType') : findTestData('BOXService/TD_BoxDocument').getValue(2, 1), ('contentName') : findTestData(
                'BOXService/TD_BoxDocument').getValue(3, 1), ('tag1') : findTestData('BOXService/TD_BoxDocument').getValue(
                4, 1), ('tag2') : findTestData('BOXService/TD_BoxDocument').getValue(5, 1), ('tag3') : findTestData('BOXService/TD_BoxDocument').getValue(
                6, 1), ('tag4') : findTestData('BOXService/TD_BoxDocument').getValue(7, 1), ('tag5') : findTestData('BOXService/TD_BoxDocument').getValue(
                8, 1)]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def value1 = result.documentID

def value2 = result.documentVersionID

GlobalVariable.var_DocumentID = value1

GlobalVariable.var_DocumentVersionID = value2

println('DocumentID is set to :' + value1)

println('DocumentVersionID is set to :' + value2)

response = WS.sendRequest(findTestObject('BOXService/Update Document', [('documentID') : GlobalVariable.var_DocumentID, ('documentVersionID') : GlobalVariable.var_DocumentVersionID
            , ('encodedContent') : findTestData('BOXService/TD_BoxDocument').getValue(1, 1), ('contentType') : findTestData(
                'BOXService/TD_BoxDocument').getValue(2, 1), ('contentName') : findTestData('BOXService/TD_BoxDocument').getValue(
                3, 1), ('tag1') : findTestData('BOXService/TD_BoxDocument').getValue(4, 1), ('tag2') : findTestData('BOXService/TD_BoxDocument').getValue(
                5, 1), ('tag3') : findTestData('BOXService/TD_BoxDocument').getValue(6, 1), ('tag4') : findTestData('BOXService/TD_BoxDocument').getValue(
                7, 1), ('tag5') : findTestData('BOXService/TD_BoxDocument').getValue(8, 1)]))

def result2 = slurper.parseText(response.getResponseBodyContent())

def value3 = result2.documentID

def value4 = result2.documentVersionID

GlobalVariable.var_DocumentID = value3

println('DocumentID is set to :' + value3)

println('NEW DocumentVersionID is set to :' + value4)

response = WS.sendRequest(findTestObject('BOXService/Update Document', [('documentID') : GlobalVariable.var_DocumentID, ('documentVersionID') : GlobalVariable.var_DocumentVersionID
            , ('encodedContent') : findTestData('BOXService/TD_BoxDocument').getValue(1, 1), ('contentType') : findTestData(
                'BOXService/TD_BoxDocument').getValue(2, 1), ('contentName') : findTestData('BOXService/TD_BoxDocument').getValue(
                3, 1), ('tag1') : findTestData('BOXService/TD_BoxDocument').getValue(4, 1), ('tag2') : findTestData('BOXService/TD_BoxDocument').getValue(
                5, 1), ('tag3') : findTestData('BOXService/TD_BoxDocument').getValue(6, 1), ('tag4') : findTestData('BOXService/TD_BoxDocument').getValue(
                7, 1), ('tag5') : findTestData('BOXService/TD_BoxDocument').getValue(8, 1)]))

def result3 = slurper.parseText(response.getResponseBodyContent())

def value5 = result3.documentID

def value6 = result3.documentVersionID

GlobalVariable.var_DocumentID = value5

GlobalVariable.var_DocumentVersionID = value6

println('DocumentID is set to :' + value3)

println('NEW DocumentVersionID is set to :' + value4)

