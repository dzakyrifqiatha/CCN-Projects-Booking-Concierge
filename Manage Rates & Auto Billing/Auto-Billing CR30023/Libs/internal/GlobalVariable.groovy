package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Message1
     
    /**
     * <p></p>
     */
    public static Object Message2
     
    /**
     * <p></p>
     */
    public static Object Message3
     
    /**
     * <p></p>
     */
    public static Object Message4
     
    /**
     * <p></p>
     */
    public static Object Message5
     
    /**
     * <p></p>
     */
    public static Object MAWBNumber_1
     
    /**
     * <p></p>
     */
    public static Object MAWBNumber_2
     
    /**
     * <p></p>
     */
    public static Object MAWBNumber_3
     
    /**
     * <p></p>
     */
    public static Object MAWBNumber_4
     
    /**
     * <p></p>
     */
    public static Object MAWBNumber_5
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            Message1 = selectedVariables['Message1']
            Message2 = selectedVariables['Message2']
            Message3 = selectedVariables['Message3']
            Message4 = selectedVariables['Message4']
            Message5 = selectedVariables['Message5']
            MAWBNumber_1 = selectedVariables['MAWBNumber_1']
            MAWBNumber_2 = selectedVariables['MAWBNumber_2']
            MAWBNumber_3 = selectedVariables['MAWBNumber_3']
            MAWBNumber_4 = selectedVariables['MAWBNumber_4']
            MAWBNumber_5 = selectedVariables['MAWBNumber_5']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
