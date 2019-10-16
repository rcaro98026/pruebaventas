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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://experts.shopify.com/services/visual-content-and-branding/take-product-photos')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/paginaventa/div_Products On White PhotographyChicago United StatesStarting price200 USDJobs completed10Rating50(10)'))

WebUI.click(findTestObject('Object Repository/paginaventa/button_Request a quote'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/paginaventa/input_Enter your store name_TextField3'), nombreus)

if (WebUI.verifyElementVisible(findTestObject('paginaventa/div_This store does not exist'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.delay(3)

    WebUI.click(findTestObject('paginaventa/button_cancelar'))

    WebUI.delay(3)

    WebUI.waitForPageLoad(3)
} else {
    WebUI.delay(3)

    WebUI.click(findTestObject('paginaventa/button_Log'))

    WebUI.waitForPageLoad(3)

    WebUI.navigateToUrl('https://experts.shopify.com/pow/take-product-photos')

    WebUI.delay(2)
}

