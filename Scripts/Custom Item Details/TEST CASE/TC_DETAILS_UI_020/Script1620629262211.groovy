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

WebUI.callTestCase(findTestCase('Custom Item Details/UTILITIES/OPEN_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Item Details Objects/Page_diagnostics/a_Procure_Directly_From_Seller'), 0)

WebUI.click(findTestObject('Item Details Objects/Page_diagnostics/a_Procure_Directly_From_Seller'))

WebUI.verifyElementPresent(findTestObject('Login Page/Page_diagnostics/div_Login_Page'), 0)

WebUI.callTestCase(findTestCase('Custom Item Details/UTILITIES/LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Custom Item Details/UTILITIES/ITEM_DETAIL_PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Staging Objects/Page_diagnostics/a_ADD TO CART'))

WebUI.verifyElementPresent(findTestObject('Cart/Page_diagnostics/div_VIEW_CART_Area'), 0)

WebUI.verifyElementClickable(findTestObject('Page_diagnostics/Cart_icon'))

WebUI.callTestCase(findTestCase('Custom Item Details/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

