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


RunConfiguration.setExecutionSettingFile('C:\\Users\\DZAKYR~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\AB CR30043\\2 Send FWB Message\\SN7_Send FWB Message with Flight Number is 2 Character (2 digits)\\20190826_142145\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/AB CR30043/2 Send FWB Message/SN7_Send FWB Message with Flight Number is 2 Character (2 digits)', new TestCaseBinding('Test Cases/AB CR30043/2 Send FWB Message/SN7_Send FWB Message with Flight Number is 2 Character (2 digits)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
