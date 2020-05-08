import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\kohcj\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30043\\1 Insert New Shipment\\SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)\\20190802_085102\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/AB CR30043/1 Insert New Shipment/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)', new TestCaseBinding('Test Cases/AB CR30043/1 Insert New Shipment/SN1_Insert New Shipment with Flight Number is 3 Character (3 Digits)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
