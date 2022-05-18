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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://staging.radyalabs.id:7008/manajemen-role')

WebUI.setText(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/input_LOGISTIC OPERATION PORTAL_app_login_f_a564cc'), 
    'sa')

WebUI.setText(findTestObject('Page_APL - Logistic Operation Portal/input_LOGISTIC OPERATION PORTAL_ant-input n_179a44'), 
    'qwerty@123')

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/a_Manajemen Role'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/a_2'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/a_3'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/a_Detail_ant-pagination-item-link ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/a__ant-pagination-item-link ng-star-inserted'))

