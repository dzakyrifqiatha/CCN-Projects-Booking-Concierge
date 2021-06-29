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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://booking:e4g2qpTkeAQH8syehyPLBe5ab@89.108.108.225:4200/dashboard')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Email Address_email'), 
    'testingdev222@yopmail.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_My Airlines_mat-input-2'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/a_New Booking'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-4'), var_awbPrefix)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_-_mat-input-35'), var_awbSuffix)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-36'), var_origin)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-37'), var_destination)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-38'), var_goodsDesc)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-39'), var_pieces)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-40'), var_weight)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-41'), var_volume)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-47'), var_fnPrefix)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-49'), var_fDate)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-50'), 
    var_fBoardPoint)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-51'), 
    var_fOffPoint2)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_BBB_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-55'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-54'), var_fDate)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Remarks_mat-input-46'), 
    'test conf - KK HN')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Send Request'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_exit_to_app'))

WebUI.switchToWindowTitle('YOPmail - Disposable Email Address')

WebUI.navigateToUrl('yopmail.com/en/')

WebUI.setText(findTestObject('Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    'testingdev221')

WebUI.click(findTestObject('Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_sbut'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.click(findTestObject('Page_YOPmail - Inbox/a_Go to Booking'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-12'), var_fnSuffix2)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-5'), var_fBoardPoint2)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_BBB_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_KK'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_FRA'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_NN_mat-input-6'), var_fnPrefix3)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-7'), var_fnSuffix3)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-10'), 
    var_fOffPoint3)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_NN_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_HN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Add remarks here_mat-input-0'), 
    'test conf - KK HN - updated @bove schedule')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Submit'))

