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

WebUI.navigateToUrl('https://docs.google.com/spreadsheets/d/1iz9UntAlvXTeVndbD7hc5vCSy3Uzs6Lvp06R_071XZw/edit#gid=2107184672')

WebUI.switchToWindowTitle('APL - Logistic Operation Portal')

WebUI.setText(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/input_Manajemen Role_ant-input ng-untouched_916618'), 
    '#')

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/button_Manajemen Role_ant-btn ant-input-sea_3e49f7'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/button_Detail'))

WebUI.click(findTestObject('Object Repository/Page_APL - Logistic Operation Portal/button_Edit'))

