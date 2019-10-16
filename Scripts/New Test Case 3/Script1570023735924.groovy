import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://experts.shopify.com/services/visual-content-and-branding/take-product-photos')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Object Repository/paginaventa/div_preciominimo'))

WebUI.click(findTestObject('Object Repository/paginaventa/div_preciomax'))

WebUI.click(findTestObject('Object Repository/paginaventa/div_preciomax'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/paginaventa/select_SelectPaises'), country, true)

WebUI.delay(2)

WebUI.click(findTestObject('paginaventa/span_See all'))

WebUI.delay(2)

new_btn = WebUI.modifyObjectProperty(findTestObject('paginaventa/span_English'), 'text', 'equals', idioma, true)

WebUI.delay(2)

WebUI.click(new_btn)

//WebUI.click(findTestObject('paginaventa/span_English'))
WebUI.click(findTestObject('Object Repository/paginaventa/button_Apply filters'))

WebUI.delay(3)

WebUI.closeBrowser()

