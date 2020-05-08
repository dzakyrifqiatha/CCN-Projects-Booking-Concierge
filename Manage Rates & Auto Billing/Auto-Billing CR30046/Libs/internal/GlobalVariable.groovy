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
    public static Object Message6
     
    /**
     * <p></p>
     */
    public static Object Message7
     
    /**
     * <p></p>
     */
    public static Object Message8
     
    /**
     * <p></p>
     */
    public static Object Message9
     
    /**
     * <p></p>
     */
    public static Object Message10
     
    /**
     * <p></p>
     */
    public static Object Message11
     
    /**
     * <p></p>
     */
    public static Object Message12
     
    /**
     * <p></p>
     */
    public static Object Message13
     
    /**
     * <p></p>
     */
    public static Object Message14
     
    /**
     * <p></p>
     */
    public static Object Message15
     

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
            Message6 = selectedVariables['Message6']
            Message7 = selectedVariables['Message7']
            Message8 = selectedVariables['Message8']
            Message9 = selectedVariables['Message9']
            Message10 = selectedVariables['Message10']
            Message11 = selectedVariables['Message11']
            Message12 = selectedVariables['Message12']
            Message13 = selectedVariables['Message13']
            Message14 = selectedVariables['Message14']
            Message15 = selectedVariables['Message15']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
