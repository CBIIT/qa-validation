import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.io.IOException as IOException
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.ProfilesIni as ProfilesIni
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import java.util.Iterator as Iterator
import java.util.Set as Set
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.HashMap as HashMap
import java.util.Map as Map
import org.apache.commons.io.FileUtils as FileUtils
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.TakesScreenshot as TakesScreenshot
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.OutputType as OutputType
import org.openqa.selenium.Cookie as Cookie
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.closeBrowser()

//Step 1--------------------Opening the desired url ****************************************************************
System.out.println('This is base url: ' + GlobalVariable.baseUrl)
System.out.println('This is the suffix url: ' + sUrl)
Url = (GlobalVariable.baseUrl + sUrl)
GlobalVariable.fullUrl = Url
System.out.println('This is the full url: ' + GlobalVariable.fullUrl)
CustomKeywords.'ctdc.utilities.DataValidation.initDriver'()

//Step 2--------------------Verifying Target ID ****************************************************************
webTargID = WebUI.getText(findTestObject('Object Repository/MTP/TargetAssociationsPage/TargetID'))
System.out.println('This is the value of target ID obtained from UI :' + webTargID)
System.out.println('This is the value of target ID obtained from input test data :' + ipTargID)
WebUI.verifyMatch(ipTargID, webTargID, false)
System.out.println('Target ID in the UI matches with the input data')

//Step 3--------------------Verifying Target Name ****************************************************************
webTargName = WebUI.getText(findTestObject('Object Repository/MTP/TargetAssociationsPage/TargetName'))
System.out.println('This is the value of target Name obtained from UI :' + webTargName)
System.out.println('This is the value of target Name obtained from input test data :' + ipTargName)
WebUI.verifyMatch(ipTargName, webTargName, false)
System.out.println('Target Name in the UI matches with the input data')


//Step 4--------------------Verifying somaticAlt widget ****************************************************************
webSomAltWdgt = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/SomaticAlt_Wdgt'), 5)
System.out.println('This is the status of somatic alt widget obtained from UI :' + webSomAltWdgt)

webSomAltWdgtTxt = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/SomaticAlt_Wdgt'))
System.out.println('This is the text of somatic alt widget obtained from UI :' + webSomAltWdgtTxt)

if ((webSomAltWdgt == true) && (webSomAltWdgtTxt == 'Available')) {
    System.out.println('Somatic Alterations is clickable. Data is available')

    WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/SomaticAlt_Wdgt'))
    Thread.sleep(2000)
    webSomaticAlt = 'TRUE'
    System.out.println('This is the value of Somatic Alterations obtained from input test data :' + ipSomaticAlt)
    WebUI.verifyMatch(ipSomaticAlt, webSomaticAlt, false)

	
//Step 5--------------------Verifying snvByGene table **************************************************************** 
websnvByGeneTab = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/MTP/TargetProfilePage/snvByGene_tab'),'disabled', 5, FailureHandling.OPTIONAL)
System.out.println('This is the value of the disabled attribute for snvbyGene tab : ' + websnvByGeneTab)

    switch (websnvByGeneTab) {
		
        case 'false': //When the tab is enabled - which means the presence of 'disabled' attribute is false
            WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/snvByGene_tab'))
            Thread.sleep(2000)
			
            webPaginationSG = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/snvByGene_pagination'), 5, FailureHandling.OPTIONAL)
            System.out.println('This is the value of pagination presence for snvbyGene tab : ' + webPaginationSG)
			
            if (webPaginationSG == true) {
                //if the pagination is present-when there are >10 rows, then get the total count from the rows per page max number
                tempCount = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/snvByGene_Cnt'))
                System.out.println('This is the value of tempcount before extracting the rowcount :' + tempCount)
                websnvByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.CountRowsfromPagination'(tempCount)
                System.out.println('This is the value of snv by gene count extracted from pagination in UI :' + websnvByGeneCnt)
              }else if (webPaginationSG == false) {
				//if the pagination is missing when there are <=10 rows only, then count the rows manually
                websnvByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.countRows'('Object Repository/MTP/TargetProfilePage/SomAlt_snvByGene_TblBdy')
                System.out.println('This is the value of snv by gene count obtained from UI :' + websnvByGeneCnt)
              }
            
            System.out.println('This is the value of snv by gene count obtained from input test data :' + ipsnvByGene)
            WebUI.verifyMatch(ipsnvByGene, websnvByGeneCnt, false)
            break;
			
        case 'true': //When the tab is disabled  - which means the presence of 'disabled' attribute is true
            System.out.println('Snv By Gene Tab is not clickable. There is no data present for the tab.')
            websnvByGeneCnt = '0'
            System.out.println('This is the value of snv by gene count obtained from input test data :' + ipsnvByGene)
            WebUI.verifyMatch(ipsnvByGene, websnvByGeneCnt, false)
            break;
			
        default:
            System.out.println('Error in accessing Snv By Gene tab')
            break;
         }//switch ends for snvbygene tab
    

		 
//Step 6--------------------Verifying snvByVariant table****************************************************************
    websnvByVarTab = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/MTP/TargetProfilePage/snvByVar_tab'), 'disabled', 5, FailureHandling.OPTIONAL)
    System.out.println('This is the value of the disabled attribute for snvbyVariant tab : ' + websnvByVarTab)

    switch (websnvByVarTab) {
		
        case 'false' ://When the tab is enabled - which means the presence of 'disabled' attribute is false
            WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/snvByVar_tab'))
            Thread.sleep(2000)

            webPaginationSV = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/snvByVar_pagination'), 5, FailureHandling.OPTIONAL)
            System.out.println('This is the value of pagination presence for snvByVariant tab : ' + webPaginationSV)

            if (webPaginationSV == true) {
                //if the pagination is present-when there are >10 rows, then get the total count from the rows per page max number
                tempCount = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/snvByVar_Cnt'))
                System.out.println('This is the value of tempcount before extracting the rowcount :' + tempCount)
                websnvByVarCnt = CustomKeywords.'ctdc.utilities.DataValidation.CountRowsfromPagination'(tempCount)
                System.out.println('This is the value of snv by variant count extracted from pagination in UI :' + websnvByVarCnt)
             } else if (webPaginationSV == false) {
				 //if the pagination is missing when there are <=10 rows only, then count the rows manually
                websnvByVarCnt = CustomKeywords.'ctdc.utilities.DataValidation.countRows'('Object Repository/MTP/TargetProfilePage/SomAlt_snvByVar_TblBdy')
                System.out.println('This is the value of snv by variant count obtained from UI :' + websnvByVarCnt)
            }
            
            System.out.println('This is the value of snv by variant count obtained from input test data :' + ipsnvByVariant)
            WebUI.verifyMatch(ipsnvByVariant, websnvByVarCnt, false)
            break;
			
        case 'true' ://When the tab is disabled  - which means the presence of 'disabled' attribute is true
            System.out.println('Snv By Variant Tab is not clickable. There is no data present for the tab.')
            websnvByVarCnt = '0'
            System.out.println('This is the value of snv by variant count obtained from input test data :' + ipsnvByVariant)
            WebUI.verifyMatch(ipsnvByVariant, websnvByVarCnt, false)
            break;
			
        default:
            System.out.println('Error in accessing Snv By Variant tab')
            break;
      }// switch ends for snvbyvariant tab
    
  
	  
//Step 7--------------------Verifying cnvByGene ****************************************************************
 webcnvByGeneTab = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/MTP/TargetProfilePage/cnvByGene_tab'), 'disabled', 5, FailureHandling.OPTIONAL)
 System.out.println('This is the value of the disabled attribute for cnvbyGene tab : ' + webcnvByGeneTab)

    switch (webcnvByGeneTab) {
		
        case 'false': //When the tab is enabled - which means the presence of 'disabled' attribute is false
            WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/cnvByGene_tab'))
            Thread.sleep(2000)
			
            webPaginationCG = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/cnvByGene_pagination'), 5, FailureHandling.OPTIONAL)
            System.out.println('This is the value of pagination presence for cnvByGene tab : ' + webPaginationCG)
			
            if (webPaginationCG == true) {
                //if the pagination is present-when there are >10 rows, then get the total count from the rows per page max number
                tempCount = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/cnvByGene_Cnt'))
                System.out.println('This is the value of tempcount before extracting the rowcount :' + tempCount)
                webcnvByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.CountRowsfromPagination'(tempCount)
                System.out.println('This is the value of cnv by gene count extracted from pagination in UI :' + webcnvByGeneCnt)
              } else if (webPaginationCG == false) {
				  //if the pagination is missing when there are <=10 rows only, then count the rows manually
                webcnvByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.countRows'('Object Repository/MTP/TargetProfilePage/SomAlt_cnvByGene_TblBdy')
                System.out.println('This is the value of snv by variant count obtained from UI :' + webcnvByGeneCnt)
             }
            
            System.out.println('This is the value of cnv by gene count obtained from input test data :' + ipcnvByGene)
            WebUI.verifyMatch(ipcnvByGene, webcnvByGeneCnt, false)
            break;
			
        case 'true' ://When the tab is disabled  - which means the presence of 'disabled' attribute is true
            System.out.println('CNV By Gene Tab is not clickable. There is no data present for the tab.')
            webcnvByGeneCnt = '0'
            System.out.println('This is the value of cnv by gene count obtained from input test data :' + ipcnvByGene)
            WebUI.verifyMatch(ipcnvByGene, webcnvByGeneCnt, false)
            break;
			
        default:
            System.out.println('Error in accessing cnv By gene tab')
            break;
      }//switch ends for cnvbygene table
    
	  
	  
 //Step 8--------------------Verifying fusionByGene ****************************************************************
  webfusionByGeneTab = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/MTP/TargetProfilePage/fusionByGene_tab'), 'disabled', 5, FailureHandling.OPTIONAL)
    System.out.println('This is the value of the disabled attribute for fusionbygene tab : ' + webfusionByGeneTab)

    switch (webfusionByGeneTab) {
		
        case 'false': //When the tab is enabled - which means the presence of 'disabled' attribute is false
            WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/fusionByGene_tab'))
            Thread.sleep(2000)
            webPaginationFG = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/fusionByGene_pagination'), 5, FailureHandling.OPTIONAL)
            System.out.println('This is the value of pagination presence for fusionByGene tab : ' + webPaginationFG)

            if (webPaginationFG == true) {
                //if the pagination is present-when there are >10 rows, then get the total count from the rows per page max number
                tempCount = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/fusionByGene_Cnt'))
                System.out.println('This is the value of tempcount before extracting the rowcount :' + tempCount)
                webfusionByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.CountRowsfromPagination'(tempCount)
                System.out.println('This is the value of fusion by gene count extracted from pagination in UI :' + webfusionByGeneCnt)
               } else if (webPaginationFG == false) {
				   //if the pagination is missing when there are <=10 rows only, then count the rows manually
                webfusionByGeneCnt = CustomKeywords.'ctdc.utilities.DataValidation.countRows'('Object Repository/MTP/TargetProfilePage/SomAlt_fusionByGene_TblBdy')
                System.out.println('This is the value of snv by variant count obtained from UI :' + webfusionByGeneCnt)
              }
            
            System.out.println('This is the value of fusion by gene count obtained from input test data :' + ipfusionByGene)
            WebUI.verifyMatch(ipfusionByGene, webfusionByGeneCnt, false)
            break;
			
        case 'true': //When the tab is disabled  - which means the presence of 'disabled' attribute is true
            System.out.println('fusion By Gene Tab is not clickable. There is no data present for the tab.')
            webfusionByGeneCnt = '0'
            System.out.println('This is the value of fusion by gene count obtained from input test data :' + ipfusionByGene)
            WebUI.verifyMatch(ipfusionByGene, webfusionByGeneCnt, false)
            break;
			
        default:
            System.out.println('Error in accessing fusion By gene tab')
            break;
      } // switch ends for fusion by gene table
    
	  
	  
	  
  //Step 9--------------------Verifying fusion ****************************************************************
    webfusionTab = WebUI.verifyElementHasAttribute(findTestObject('Object Repository/MTP/TargetProfilePage/fusion_tab'), 'disabled', 5, FailureHandling.OPTIONAL)
    System.out.println('This is the value of the disabled attribute for fusion tab : ' + webfusionTab)

    switch (webfusionTab) {
		
        case 'false': //When the tab is enabled - which means the presence of 'disabled' attribute is false
            WebUI.click(findTestObject('Object Repository/MTP/TargetProfilePage/fusion_tab'))
            Thread.sleep(2000)
            webPaginationF = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/TargetProfilePage/fusion_pagination'), 5, FailureHandling.OPTIONAL)
            System.out.println('This is the value of pagination presence for fusion tab : ' + webPaginationF)

            if (webPaginationF == true) {
                //if the pagination is present-when there are >10 rows, then get the total count from the rows per page max number
                tempCount = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/fusion_Cnt'))
                System.out.println('This is the value of tempcount before extracting the rowcount :' + tempCount)
                webfusionCnt = CustomKeywords.'ctdc.utilities.DataValidation.CountRowsfromPagination'(tempCount)
                System.out.println('This is the value of fusion count extracted from pagination in UI :' + webfusionCnt)
              } else if (webPaginationF == false) {
				  //if the pagination is missing when there are <=10 rows only, then count the rows manually
				webfusionCnt = CustomKeywords.'ctdc.utilities.DataValidation.countRows'('Object Repository/MTP/TargetProfilePage/SomAlt_fusion_TblBdy')
                System.out.println('This is the value of fusion count obtained from UI :' + webfusionCnt)
              }
            
            System.out.println('This is the value of fusion count obtained from input test data :' + ipfusion)
            WebUI.verifyMatch(ipfusion, webfusionCnt, false)
            break;
			
        case 'true': //When the tab is disabled  - which means the presence of 'disabled' attribute is true
            System.out.println('fusion Tab is not clickable. There is no data present for the tab.')
            webfusionCnt = '0'
            System.out.println('This is the value of fusion count obtained from input test data :' + ipfusion)
            WebUI.verifyMatch(ipfusion, webfusionCnt, false)
            break;
			
        default:
            System.out.println('Error in accessing fusion tab')
            break;
			
      } //switch ends for fusion table******************************************************************************************************************** 
} else {   
    System.out.println('Data is not available for Somatic Alterations widget.')
} //if condition ends for somatic alterations widget


//Step 10--------------------Verifying GeneExp widget ****************************************************************
webGeneExpWdgt = WebUI.scrollToElement(findTestObject('Object Repository/MTP/TargetProfilePage/GeneExp_Wdgt'), 5, FailureHandling.OPTIONAL)
webGeneExpWdgtTxt = WebUI.getText(findTestObject('Object Repository/MTP/TargetProfilePage/GeneExp_Wdgt'))
System.out.println('This is the text of Gebe Expression widget obtained from UI :' + webGeneExpWdgtTxt)

if (webGeneExpWdgtTxt == 'OpenPedCan Gene Expression') {
	Thread.sleep(2000)
	webGeneExp = 'TRUE'
	System.out.println('This is the value of Gene Expression obtained from input test data :' + ipGeneExp)
	WebUI.verifyMatch(ipGeneExp, webGeneExp, false)
  }else{
	System.out.println('Data is not available for Gene Expression widget.')
  }//if condition ends for gene expression widget

 
WebUI.closeBrowser()


