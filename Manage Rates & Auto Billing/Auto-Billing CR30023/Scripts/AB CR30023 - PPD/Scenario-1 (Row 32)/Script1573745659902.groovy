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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

'Configurator2.0 Login'
WebUI.openBrowser('')

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('http://configurator2.ccn/')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtUserI'), 'dzaky')

WebUI.setText(findTestObject('Page_Configurator 2.0/input_ctl00MainContenttxtPassw'), 'mi8xLYNth')

WebUI.selectOptionByValue(findTestObject('Page_Configurator 2.0/select_Please select environme'), 'PPD', false)

WebUI.click(findTestObject('Page_Configurator 2.0/input_ctl00MainContentbtnSubmi'))

'Send Message'
WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.setText(findTestObject('Page_Configurator 2.0/MessageToSend'), GlobalVariable.Message1)

WebUI.click(findTestObject('Page_Configurator 2.0/MessageToSend - Submit'))

WebUI.click(findTestObject('Page_Configurator 2.0/Nav_Send Message Tab - Dev - Kelvin'))

WebUI.delay(3)

'LINC Login'
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://ppdlogin.ccnhub.com/LINC/')

WebUI.click(findTestObject('Page_CCNhub LINC/span_CCNhub LINC Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtEmail(real_input)'), 'SQ.DZAKY@CCNhub.com')

WebUI.focus(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_CCNhub LINC/input_ctl00ContentTxtPassword(real_input)'), 'password')

WebUI.click(findTestObject('Page_CCNhub LINC/span_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CCNhub LINC/button_ctl00ContentrwForceLogi'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Landing_Page/div_myAppAB1'))

WebUI.delay(10)

WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), '618-63687315')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), Keys.chord(Keys.RETURN))

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/clicksearch_MAWB Number'), FailureHandling.OPTIONAL)

//'In Object we have added one link now we are modifying that object'
//
//'by setting URL = http://www.societyhive.com/'
//urlToSearch = 'openShipmentDialog("db440400-11a2-4bcc-80da-821741778457",1)'
//
//l1: for (int j = 1; j <= 4; j++) {
//    'incrementing value by 1 in xpath format'
//
//    'for each displayed search result by google xpath format is same only the counter under div is changing (dont consider ad links)'
//    String xpathval = ((('//*[@id=' + '"gridPendingShipments"') + ']/div[2]/table/tbody/tr[') + j) + ']/td[2]/a'
//
//    'By using ModiyfyObjectPropery we are setting xpath runtime '
//    LinkToSearch = WebUI.modifyObjectProperty(findTestObject('Object Repository/resultPage/resultLink'), 'xpath', 'equals', 
//        xpathval, true)
//
//    'After setting xpath runtime we now then identifying href value for each link if it is equal to societyhive.com then we are clicking and coming out of the loop'
//
//    'by using getAttribute we are identifying the href value'
//    LinkVal = WebUI.getAttribute(LinkToSearch, 'onclick', FailureHandling.STOP_ON_FAILURE)
//
//    if (LinkVal == urlToSearch) {
//        WebUI.click(LinkToSearch, FailureHandling.STOP_ON_FAILURE)
//
//        Break l1
//    }
//}
not_run: WebUI.verifyElementVisible(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'))

not_run: WebUI.sendKeys(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/input_MAWB Number'), '618-63687315')

not_run: CustomKeywords.'ccnpackage.Searchlistandclick.selectValueFromUnorderedList'(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/clicksearch_MAWB Number'), 
    '618-63687315')

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/MAWBNumber-1'))

not_run: CustomKeywords.'ccnpackage.Searchlistandclick.selectValueFromUnorderedList'(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/dropDown_Cargo Class'), 
    'GEN')

WebUI.verifyElementText(findTestObject('Page_Auto-Billing/2 Section_Shipment Detail Dash/2.1 Pop Up Shipment Details/dropDown_Cargo Class'), 
    'GEN')

