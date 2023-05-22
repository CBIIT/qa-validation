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

System.out.println('This is the URL of the current page :' + WebUI.getUrl())

//Step 2--------------------Verifying Disease ID ****************************************************************
webDisID = WebUI.getText(findTestObject('Object Repository/MTP/DiseaseProfilePage/diseaseID'))

System.out.println('This is the value of Disease ID obtained from UI :' + webDisID)

System.out.println('This is the value of Disease ID obtained from input test data :' + ipDisID)

WebUI.verifyMatch(ipDisID, webDisID, false)

System.out.println('Disease ID in the UI matches with the input data')

//Step 3--------------------Verifying Disease Name ****************************************************************
webDisName = WebUI.getText(findTestObject('Object Repository/MTP/DiseaseProfilePage/diseaseName'))

System.out.println('This is the value of Disease Name obtained from UI :' + webDisName)

System.out.println('This is the value of Disease Name obtained from input test data :' + ipDisName)

WebUI.verifyMatch(ipDisName, webDisName, false)

System.out.println('Disease Name in the UI matches with the input data')

//Step 4--------------------Verifying Differential Expression widget ****************************************************************

WebUI.waitForElementVisible(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExp_Wdgt'), 20)
 webDiffExpWdgt = WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExp_Wdgt'), 
    10)

System.out.println('This is the status of Differential Expression widget obtained from UI :' + WebUI.verifyElementPresent(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExp_Wdgt'), 
    10))

webDiffExpWdgtTxt = WebUI.getText(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExp_Wdgt'))

System.out.println('This is the text of Differential Expression widget obtained from UI :' + webDiffExpWdgtTxt)

if ((webDiffExpWdgt == true) && (webDiffExpWdgtTxt == 'Available')) {
    System.out.println('Differential Expression widget is clickable. Data is available')

    WebUI.focus(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExpression'), FailureHandling.OPTIONAL)

    System.out.println('****Scrolled to Differential Expression widget****** ')

    WebUI.click(findTestObject('Object Repository/MTP/DiseaseProfilePage/diffExpression'))

    Thread.sleep(2000)

    webDiffExp = 'TRUE'

    System.out.println('This is the value of Differential Expression obtained from input test data :' + ipDiffExp)

    WebUI.verifyMatch(ipDiffExp, webDiffExp, false //if condition ends for gene expression widget
        ) //if condition ends for gene expression widget
} else {
    webDiffExp = 'FALSE'

    System.out.println('Data is not available for Differential Expression widget.')

    WebUI.verifyMatch(ipDiffExp, webDiffExp, false)

    
}

