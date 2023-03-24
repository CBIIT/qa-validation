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

'Opens the browser of choice: Chrome, Firefox or Edge'
WebUI.closeBrowser()

'Driver opened by Katalon is used in Selenium from this step.'

 
'This step takes the Query from input excel and fetches data from Neo4j database. \r\nSaves the results from neo4j and application in the same name mentioned in the input excel. '
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('TC30_Canine_StudyMGT-StudyPart_Breed_Diagnosis_Sex.xlsx')   //changed for MGT

'Clicks on the Cases button in the Navbar of ICDC\'s homepage.'
WebUI.waitForElementPresent(findTestObject('Canine/NavBar/Canine_Cases_Btn'), 20)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Canine_PopUp_Continue_Btn')
System.out.println ("Closed the popup window");
WebUI.waitForElementPresent(findTestObject('Canine/NavBar/Canine_Cases_Btn'), 20)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Canine/NavBar/Canine_Cases_Btn')

'Clicks on the Filter \'Study\' from left pane'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/Study/Canine_Filter_Study')


'Selects the specific check box from \'Study\' filter.'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study-MGT01_Chkbx'), 30)  //changed for MGT
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study-MGT01_Chkbx'), 5)  //changed for MGT
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/Study/Canine_Filter_Study-MGT01_Chkbx') //changed for MGT
 
'Clicks on the Filter \'Study Participation\' from left pane'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/StudyParticipation/StudyParticipation_Ddn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/StudyParticipation/StudyParticipation_Ddn'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/StudyParticipation/StudyParticipation_Ddn')

'Selects the specific check box from \'Study Participation\' filter.'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/StudyParticipation/SingleStudy_Chkbx'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/StudyParticipation/SingleStudy_Chkbx'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/StudyParticipation/SingleStudy_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/StudyParticipation/StudyParticipation_Ddn')


WebUI.delay(3)
'Clicks on the Filter \'Breed\' from left pane'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Breed/BREED_Ddn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Breed/BREED_Ddn'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/Breed/BREED_Ddn')
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Breed/StaffordshireBullTerrier_Chkbx'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Breed/StaffordshireBullTerrier_Chkbx'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Breed/StaffordshireBullTerrier_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Breed/BREED_Ddn')
 

 
'Selects the specific check box from \'Diagnosis\' filter.'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Diagnosis/DIAGNOSIS_Ddn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Diagnosis/DIAGNOSIS_Ddn'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Diagnosis/DIAGNOSIS_Ddn')

WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Diagnosis/MammaryCancer_Chkbx'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Diagnosis/MammaryCancer_Chkbx'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Diagnosis/MammaryCancer_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/Diagnosis/DIAGNOSIS_Ddn')

WebUI.delay(3)

'Selects the specific check box from \'Sex\' filter.'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Sex/SEX_Ddn'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Sex/SEX_Ddn'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Sex/SEX_Ddn')

WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Sex/Female_Chkbx'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/Canine/Filter/Sex/Female_Chkbx'), 5)
WebUI.waitForElementClickable(findTestObject('Object Repository/Canine/Filter/Sex/Female_Chkbx'), 30)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTabCanineStat'('Object Repository/Canine/Filter/Sex/Female_Chkbx')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/Filter/Sex/SEX_Ddn')

//Reading statbar 
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.readStatBarCanine'('Object Repository/Canine/StatBar/Canine_StatBar-Programs','Object Repository/Canine/StatBar/Canine_StatBar-Studies',
	'Object Repository/Canine/StatBar/Canine_StatBar-Cases', 'Object Repository/Canine/StatBar/Canine_StatBar-Samples',
	'Object Repository/Canine/StatBar/Canine_StatBar-CaseFiles', 'Object Repository/Canine/StatBar/Canine_StatBar-StudyFiles')


////clicking the Cases tab
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/CanineResults_Cases_Tab'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/CanineResults_Cases_Tab')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.multiFunction'('ICDC', GlobalVariable.G_StatBar_Cases, 'Object Repository/Canine/Canine_CasesTable',
	'Object Repository/Canine/Canine_TableHeader', 'Object Repository/Canine/Canine_CasesTabNextBtn', GlobalVariable.G_WebTabnameCases,
	GlobalVariable.G_CypherTabnameCases, GlobalVariable.G_QueryCasesTab)


//clicking the Samples tab
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/CanineResults_Samples_Tab'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/CanineResults_Samples_Tab')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.multiFunction'('ICDC', GlobalVariable.G_StatBar_Samples, 'Object Repository/Canine/Canine_Samples_Table',
	'Object Repository/Canine/Canine_Samples_TableHdr', 'Object Repository/Canine/Canine_SamplesTabNextBtn', GlobalVariable.G_WebTabnameSamples,
	GlobalVariable.G_CypherTabnameSamples, GlobalVariable.G_QuerySamplesTab)
 
////clicking the Case Files tab
WebUI.waitForElementPresent(findTestObject('Canine/CanineResults_CaseFiles_Tab'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/CanineResults_CaseFiles_Tab')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.multiFunction'('ICDC', GlobalVariable.G_StatBar_Files, 'Object Repository/Canine/Canine_Files_Table',
	'Object Repository/Canine/Canine_Files_TableHdr', 'Object Repository/Canine/Canine_FilesTabNextBtn', GlobalVariable.G_WebTabnameFiles,
	GlobalVariable.G_CypherTabnameFiles, GlobalVariable.G_QueryFilesTab)

////clicking the Study Files tab
WebUI.waitForElementPresent(findTestObject('Canine/CanineResults_StudyFiles_Tab'), 5)
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.clickTab'('Object Repository/Canine/CanineResults_StudyFiles_Tab')
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.multiFunction'('ICDC', GlobalVariable.G_StatBar_StudyFiles, 'Object Repository/Canine/Canine_StudyFiles_Table',
	'Object Repository/Canine/Canine_StudyFiles_TableHdr', 'Object Repository/Canine/Canine_StudyFilesTabNextBtn', GlobalVariable.G_WebTabnameStudyFiles,
	GlobalVariable.G_CypherTabnameStudyFiles, GlobalVariable.G_QueryStudyFilesTab)

WebUI.closeBrowser()
 