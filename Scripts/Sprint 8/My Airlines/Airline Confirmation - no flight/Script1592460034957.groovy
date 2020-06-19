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

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_My Airlines_mat-input-17'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/a_testconf'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-19'), findTestData(
        'Booking/TestData_Booking').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_-_mat-input-20'), findTestData(
        'Booking/TestData_Booking').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-21'), findTestData(
        'Booking/TestData_Booking').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-22'), findTestData(
        'Booking/TestData_Booking').getValue(4, 1))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div__mat-form-field-flex'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-23'), 'test noflight')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-24'), findTestData(
        'Booking/TestData_Booking').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-25'), findTestData(
        'Booking/TestData_Booking').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-26'), findTestData(
        'Booking/TestData_Booking').getValue(8, 1))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-32'), findTestData(
        'Booking/TestData_Flight').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-34'), findTestData(
        'Booking/TestData_Flight').getValue(3, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-60'), 
    findTestData('Booking/TestData_Flight').getValue(4, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-36'), 
    findTestData('Booking/TestData_Flight').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_NN_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_create'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_NN_mat-input-37'), '')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-38'), findTestData(
        'Booking/TestData_Flight').getValue(2, 2))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-39'), findTestData(
        'Booking/TestData_Flight').getValue(3, 2))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-45'), 
    findTestData('Booking/TestData_Flight').getValue(4, 2))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-56'), 
    findTestData('Booking/TestData_Flight').getValue(5, 2))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_NN_mat-select-arrow_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_NN_mat-input-47'), findTestData(
        'Booking/TestData_Flight').getValue(1, 3))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-48'), findTestData(
        'Booking/TestData_Flight').getValue(2, 3))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-49'), findTestData(
        'Booking/TestData_Flight').getValue(3, 3))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-50'), 
    findTestData('Booking/TestData_Flight').getValue(4, 3))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_CMT_mat-input-62'), 
    findTestData('Booking/TestData_Booking').getValue(13, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_CMT_mat-input-63'), 
    findTestData('Booking/TestData_Booking').getValue(14, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_CMT_mat-input-64'), 
    findTestData('Booking/TestData_Booking').getValue(15, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AA1_mat-input-66'), 
    findTestData('Booking/TestData_Booking').getValue(16, 1))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AA1_mat-input-67'), 
    findTestData('Booking/TestData_Booking').getValue(17, 1))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Remarks_mat-input-31'), 
    'test no flight')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Send Request'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_exit_to_app'))

WebUI.switchToWindowTitle('YOPmail - Disposable Email Address')

WebUI.navigateToUrl('yopmail.com/en/')

WebUI.setText(findTestObject('Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    'testingdev221')

WebUI.click(findTestObject('Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_sbut'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_test no flight (26-May-2020 0906 UTC)'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.click(findTestObject('Page_YOPmail - Inbox/a_Go to Booking'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-card-title_Flights'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Add remarks here_mat-input-0'), 
    'no flight available')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Submit'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Email Address_email_1'), 
    'testingdev222@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Password_password_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_WAIT LIST'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_123 - 12345550'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_AB-ABC testingdev221yopmailcom  no fli_1303c8'))

