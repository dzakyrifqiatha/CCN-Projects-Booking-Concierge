import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlDev2)

WebUI.maximizeWindow()

not_run: WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.authenticate('http://89.108.108.225:4200/login', 'booking', 'e4g2qpTkeAQH8syehyPLBe5ab', 3)

