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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.firefox.FirefoxBinary as FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

/*This test script:
 - Opens the browser of choice: Chrome, Firefox or Edge
 - Driver opened by Katalon is used in Selenium.
 - Takes the Query from input excel and fetches data from Neo4j database.
   Saves the results from neo4j and application in the same name mentioned in the input excel.
 - Clicks on the Cases button in the Navbar of ICDC's homepage.
 - Clicks on the Filter 'Breed' from left pane
 - Selects the specific check box from 'Breed' filter.
 - Reads the results displayed for the selected filter (from all the pages in UI) and saves in the excel mentioned in Input file
 - Reads Neo4j DB using the query from Input file and saves the data in the excel mentioned in Input file
 - Reads Neo4j excel and Webdata excel as lists and compares the data.
 */
WebUI.closeBrowser()


WebUI.openBrowser('')

WebUI.maximizeWindow()


CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('TC05_Bento_MultiFilter_Diagnosis-Recurrence-TumorSize-Chemo-ERStatus.xlsx')

WebUI.waitForElementClickable(findTestObject('Object Repository/Bento/NavBar/Bento_Cases-Btn'),5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/NavBar/Bento_Cases-Btn')


WebUI.waitForElementClickable(findTestObject('Object Repository/Bento/Cases_page/Filter/FilterByCases_Facet'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/FilterByCases_Facet')


WebUI.waitForElementClickable(findTestObject('Object Repository/Bento/Cases_page/Filter/Diagnosis/DIAGNOSIS_Ddn'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Diagnosis/DIAGNOSIS_Ddn')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Diagnosis/MucinousCollCarcinoma_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Diagnosis/DIAGNOSIS_Ddn')
 
 
WebUI.waitForElementVisible(findTestObject('Object Repository/Bento/Cases_page/Filter/Recurrence Score/RecurrScore_Ddn'), 3)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Recurrence Score/RecurrScore_Ddn')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Recurrence Score/51_to_100_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Recurrence Score/RecurrScore_Ddn')

WebUI.waitForElementVisible(findTestObject('Object Repository/Bento/Cases_page/Filter/TumorSize/TumorSize_Ddn'), 3)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/TumorSize/TumorSize_Ddn')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/TumorSize/Above_4_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/TumorSize/TumorSize_Ddn')

WebUI.waitForElementVisible(findTestObject('Object Repository/Bento/Cases_page/Filter/Chemotherapy/Chemotherapy_Ddn'), 3)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Chemotherapy/Chemotherapy_Ddn')
//this is for bento qa  change input excel
//CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Chemotherapy/OtherTreatment_Chkbx')
//this is for bento perf
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Chemotherapy/DoseDenseAC2WkCycle_Chkbx')
 
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/Chemotherapy/Chemotherapy_Ddn')


WebUI.waitForElementVisible(findTestObject('Object Repository/Bento/Cases_page/Filter/ERStatus/ERStatus_Ddn'), 3)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/ERStatus/ERStatus_Ddn')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/ERStatus/Negative_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/Filter/ERStatus/ERStatus_Ddn')


Thread.sleep(3000)

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.readStatBarBento'('Object Repository/Bento/StatBar/Bento_StatBar-Programs',
	'Object Repository/Bento/StatBar/Bento_StatBar-Arms', 'Object Repository/Bento/StatBar/Bento_StatBar-Cases', 'Object Repository/Bento/StatBar/Bento_StatBar-Samples',
	'Object Repository/Bento/StatBar/Bento_StatBar-Assays', 'Object Repository/Bento/StatBar/Bento_StatBar-Files')

//clicking the Cases tab
WebUI.waitForElementPresent(findTestObject('Object Repository/Bento/Cases_page/BentoResults_Cases_Tab'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Bento/Cases_page/BentoResults_Cases_Tab')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.multiFunction'('Bento',GlobalVariable.G_StatBar_Cases, 'Object Repository/Bento/Cases_page/Bento_CasesTable',
	'Object Repository/Bento/Cases_page/Bento_CasesTableHeader', 'Object Repository/Bento/Cases_page/Bento_CasesTabNextBtn', GlobalVariable.G_WebTabnameCases,
	GlobalVariable.G_CypherTabnameCases, GlobalVariable.G_QueryCasesTab)

 
WebUI.closeBrowser()
