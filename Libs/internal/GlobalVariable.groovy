package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable holds the location of the input excel file which has the locators to be read from</p>
     */
    public static Object G_InputExcelFileName
     
    /**
     * <p>Profile QA_BENTO_Docker : This is the path where the browserdriver is stored - for Chromedriver, Geckodrive, IEdriver etc</p>
     */
    public static Object G_BrowserDriverPath
     
    /**
     * <p></p>
     */
    public static Object G_Browser
     
    /**
     * <p>Profile QA_BENTO_Docker : This can be modified to any environment - qa&#47;dev&#47;staging</p>
     */
    public static Object G_Urlname
     
    /**
     * <p></p>
     */
    public static Object G_Object
     
    /**
     * <p></p>
     */
    public static Object G_Action
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable stores the Neo4J database's server url at runtime</p>
     */
    public static Object G_server
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable stores the Neo4J database's username at runtime</p>
     */
    public static Object G_UserId
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable stores the Neo4J database's password at runtime</p>
     */
    public static Object G_Password
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable stores the path of the output file onto which the data is written from Ne04j</p>
     */
    public static Object G_ResultPath
     
    /**
     * <p></p>
     */
    public static Object G_Page
     
    /**
     * <p></p>
     */
    public static Object G_propertyName
     
    /**
     * <p></p>
     */
    public static Object G_propertyvalue
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable stores at runtime, the Cypher Query from Input Excel, used to fetch data from Neo4J for a specific criteria</p>
     */
    public static Object G_Query
     
    /**
     * <p></p>
     */
    public static Object G_Run
     
    /**
     * <p></p>
     */
    public static Object G_Function
     
    /**
     * <p></p>
     */
    public static Object G_Environment
     
    /**
     * <p></p>
     */
    public static Object G_locateby
     
    /**
     * <p></p>
     */
    public static Object G_locatorvalue
     
    /**
     * <p></p>
     */
    public static Object G_CaseData
     
    /**
     * <p></p>
     */
    public static Object G_cannine_caseTbl
     
    /**
     * <p></p>
     */
    public static Object G_cannine_caseHdr
     
    /**
     * <p></p>
     */
    public static Object G_cannine_caseTblBdy
     
    /**
     * <p></p>
     */
    public static Object G_cannine_NxtBtn
     
    /**
     * <p></p>
     */
    public static Object G_DBdata
     
    /**
     * <p></p>
     */
    public static Object G_WebExcel
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable holds the value of the filename of the input file attached to each test case</p>
     */
    public static Object G_input_file
     
    /**
     * <p></p>
     */
    public static Object G_rowcount
     
    /**
     * <p>Profile QA_BENTO_Docker : This contains the name of the element as stored in Katalon's obj rep</p>
     */
    public static Object G_ObjectType
     
    /**
     * <p>Profile QA_BENTO_Docker : This is for Katalon </p>
     */
    public static Object G_dbexcel
     
    /**
     * <p>Profile QA_BENTO_Docker : This is the value for Bento</p>
     */
    public static Object G_rowcount_Katalon
     
    /**
     * <p></p>
     */
    public static Object G_CypherTabnameCases
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable holds the value of Trials count from Stat Bar in UI.</p>
     */
    public static Object G_TStatBar_Trials
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable holds the value of Cases count from Stat Bar in UI.</p>
     */
    public static Object G_TStatBar_Cases
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable holds the value of Files count from Stat Bar in UI.</p>
     */
    public static Object G_TStatBar_Files
     
    /**
     * <p></p>
     */
    public static Object G_StatTabname
     
    /**
     * <p></p>
     */
    public static Object G_WebTabnameCases
     
    /**
     * <p>Profile QA_BENTO_Docker : This is the count from case details table</p>
     */
    public static Object G_rowcountFiles
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable contains the output tab name for stat bar counts from the case details page of a specific case ID</p>
     */
    public static Object G_CaseDetailStatTabname
     
    /**
     * <p>Profile QA_BENTO_Docker : This variable contains the neo4j query to fetch case detail level stat data</p>
     */
    public static Object G_CaseDetailQ
     
    /**
     * <p></p>
     */
    public static Object G_MainPgNextBtn
     
    /**
     * <p></p>
     */
    public static Object G_CaseDetailsQFirstPart
     
    /**
     * <p></p>
     */
    public static Object G_CaseDetailsQSecondPart
     
    /**
     * <p></p>
     */
    public static Object G_caseDetailsTabName
     
    /**
     * <p></p>
     */
    public static Object G_QueryCasesTab
     
    /**
     * <p>Profile QA_BENTO_Docker : This is added temporarily to check db connection in docker</p>
     */
    public static Object G_inputTabName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_InputExcelFileName = selectedVariables['G_InputExcelFileName']
            G_BrowserDriverPath = selectedVariables['G_BrowserDriverPath']
            G_Browser = selectedVariables['G_Browser']
            G_Urlname = selectedVariables['G_Urlname']
            G_Object = selectedVariables['G_Object']
            G_Action = selectedVariables['G_Action']
            G_server = selectedVariables['G_server']
            G_UserId = selectedVariables['G_UserId']
            G_Password = selectedVariables['G_Password']
            G_ResultPath = selectedVariables['G_ResultPath']
            G_Page = selectedVariables['G_Page']
            G_propertyName = selectedVariables['G_propertyName']
            G_propertyvalue = selectedVariables['G_propertyvalue']
            G_Query = selectedVariables['G_Query']
            G_Run = selectedVariables['G_Run']
            G_Function = selectedVariables['G_Function']
            G_Environment = selectedVariables['G_Environment']
            G_locateby = selectedVariables['G_locateby']
            G_locatorvalue = selectedVariables['G_locatorvalue']
            G_CaseData = selectedVariables['G_CaseData']
            G_cannine_caseTbl = selectedVariables['G_cannine_caseTbl']
            G_cannine_caseHdr = selectedVariables['G_cannine_caseHdr']
            G_cannine_caseTblBdy = selectedVariables['G_cannine_caseTblBdy']
            G_cannine_NxtBtn = selectedVariables['G_cannine_NxtBtn']
            G_DBdata = selectedVariables['G_DBdata']
            G_WebExcel = selectedVariables['G_WebExcel']
            G_input_file = selectedVariables['G_input_file']
            G_rowcount = selectedVariables['G_rowcount']
            G_ObjectType = selectedVariables['G_ObjectType']
            G_dbexcel = selectedVariables['G_dbexcel']
            G_rowcount_Katalon = selectedVariables['G_rowcount_Katalon']
            G_CypherTabnameCases = selectedVariables['G_CypherTabnameCases']
            G_TStatBar_Trials = selectedVariables['G_TStatBar_Trials']
            G_TStatBar_Cases = selectedVariables['G_TStatBar_Cases']
            G_TStatBar_Files = selectedVariables['G_TStatBar_Files']
            G_StatTabname = selectedVariables['G_StatTabname']
            G_WebTabnameCases = selectedVariables['G_WebTabnameCases']
            G_rowcountFiles = selectedVariables['G_rowcountFiles']
            G_CaseDetailStatTabname = selectedVariables['G_CaseDetailStatTabname']
            G_CaseDetailQ = selectedVariables['G_CaseDetailQ']
            G_MainPgNextBtn = selectedVariables['G_MainPgNextBtn']
            G_CaseDetailsQFirstPart = selectedVariables['G_CaseDetailsQFirstPart']
            G_CaseDetailsQSecondPart = selectedVariables['G_CaseDetailsQSecondPart']
            G_caseDetailsTabName = selectedVariables['G_caseDetailsTabName']
            G_QueryCasesTab = selectedVariables['G_QueryCasesTab']
            G_inputTabName = selectedVariables['G_inputTabName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
