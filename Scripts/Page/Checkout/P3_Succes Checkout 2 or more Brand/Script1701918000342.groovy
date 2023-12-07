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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Page/Login/Login'), [('username') : Username, ('password') : Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Add - add-to-cart-sauce-labs-backpack'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/add-to-cart-sauce-labs-bike-light'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Cart'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/checkout'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/First_name'), FirstName)

WebUI.setText(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Last_name'), LastName)

WebUI.setText(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Zip_Code'), PostalCode)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Continue'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Repo - Yusuf/Chart_Checkout_Logout/Finish'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

