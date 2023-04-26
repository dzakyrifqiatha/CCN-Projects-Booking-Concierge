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

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-4'), var_awbPrefix)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_-_mat-input-5'), var_awbSuffix)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-6'), var_origin)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-8'), 'test cancel')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-24'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-24'), var_fnDate)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-26'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-26'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/td_A10001A'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_NN_mat-input-27'), '')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-28'), var_fnSuffix2)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/tr_A10001ADD-MMM-YYAAABBBNN done clear'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-29'), var_fDate2)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-31'), 
    var_fOffPoint2)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_NN_mat-input-32'), var_fnPrefix3)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-33'), var_fnSuffix3)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-34'), var_fDate3)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_NN_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Remarks_mat-input-16'), 
    'test @locationcode cancellation')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-8'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_OriginDestinationGoods Description Allo_84cce3'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Send Request'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_exit_to_app'))

WebUI.switchToWindowTitle('YOPmail - Disposable Email Address')

WebUI.navigateToUrl('yopmail.com/en/')

WebUI.setText(findTestObject('OLD-Obsolete/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    'testingdev221')

WebUI.click(findTestObject('OLD-Obsolete/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_sbut'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_test locationcode cancellation (27-May-2_004a1a'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.click(findTestObject('Page_YOPmail - Inbox/a_Go to Booking'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_clear'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_add'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-1'), var_fnPrefix4)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-2'), var_fnSuffix4)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-3'), var_fDate4)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_DD-MMM-YY_mat-input-4'), 
    var_fBoardPoint4)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_AAA_mat-input-5'), var_fOffPoint4)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_BBB_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_KK'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Add remarks here_mat-input-0'), 
    'booked to XX0123 flight on 04-Jun-20')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Submit'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.setText(findTestObject('Page_YOPmail - Inbox/input_what is email alias_login'), 'testingdev222')

WebUI.click(findTestObject('Page_YOPmail - Inbox/span_Checkfornewmails'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_booked to XX0123 flight on 04-Jun-20 (27_a2a22b'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/img_w-100 h-100'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Email Address_email_1'), 
    'testingdev222@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Password_password_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_CONFIRMED'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_123 - 12364645'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_KK_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_XX'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Remarks_mat-input-22'), 
    'book X1 instead')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Send Request'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_SENT'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_exit_to_app'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.setText(findTestObject('Page_YOPmail - Inbox/input_what is email alias_login'), 'testingdev221')

WebUI.click(findTestObject('Page_YOPmail - Inbox/span_Checkfornewmails'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_book X1 instead (27-May-2020 0952 UTC)'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.click(findTestObject('Page_YOPmail - Inbox/a_Go to Booking_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_BBB_mat-select-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_CN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Add remarks here_mat-input-0'), 
    'cancellation confirmed')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/img_w-100 h-100'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.setText(findTestObject('Page_YOPmail - Inbox/input_what is email alias_login'), 'testingdev222')

WebUI.click(findTestObject('Page_YOPmail - Inbox/span_Checkfornewmails'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/p_Your booking request for 123-12364645 has_8ac5df'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_cancellation confirmed (27-May-2020 0956 UTC)'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Email Address_email_1'), 
    'testingdev222@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Password_password_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_CANCELLED'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_123 - 12364645'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_KK_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_NN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Remarks_mat-input-22'), 
    'Book X1 even pending @@')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Send Request'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_SENT'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_exit_to_app'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.setText(findTestObject('Page_YOPmail - Inbox/input_what is email alias_login'), 'testingdev221')

WebUI.click(findTestObject('Page_YOPmail - Inbox/span_Checkfornewmails'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_Book X1 even pending  (27-May-2020 1008 UTC)'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.click(findTestObject('Page_YOPmail - Inbox/a_Go to Booking_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input__mat-input-1'), var_fnPrefix5)

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-2'), var_fnSuffix5)

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_A1_mat-input-3'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/div_NN_mat-select-arrow_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_HN'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/mat-icon_done'))

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/textarea_Add remarks here_mat-input-0'), 
    'Pending')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/img_w-100 h-100'))

WebUI.switchToWindowTitle('YOPmail - Inbox')

WebUI.setText(findTestObject('Page_YOPmail - Inbox/input_what is email alias_login'), 'testingdev222')

WebUI.click(findTestObject('Page_YOPmail - Inbox/span_Checkfornewmails'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/p_Your booking request for 123-12364645 has_aeae1e'))

WebUI.click(findTestObject('Page_YOPmail - Inbox/td_Pending (27-May-2020 1012 UTC)'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Email Address_email_1'), 
    'testingdev222@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/input_Password_password_1'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Booking Concierge/Page_Booking Concierge/p_WAIT LIST'))

