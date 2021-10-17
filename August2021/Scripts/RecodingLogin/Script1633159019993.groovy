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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://testautomasi.com/')

WebUI.click(findTestObject('Object Repository/Page_Home -/a_Log InRegister As Student'))

WebUI.setText(findTestObject('Object Repository/Page_Profile  Dashboard -/input_Username or email_username'), 'fullstackdemo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile  Dashboard -/input_Password_password'), 'ng/5wRifzKnlh5WWSdkr/A==')

WebUI.click(findTestObject('Object Repository/Page_Profile  Dashboard -/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Profile  Dashboard -/strong_fullstackdemo'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
