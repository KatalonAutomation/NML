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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://arl-dev.netlify.com/about/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_About African Rainbow Life/a_About'))

WebUI.click(findTestObject('Object Repository/Page_About African Rainbow Life/a_About us'))

WebUI.click(findTestObject('Object Repository/Page_About African Rainbow Life/p_About Us'))

WebUI.verifyTextPresent('About Us', false)

WebUI.verifyTextPresent('Mission & Vision', false)

WebUI.verifyTextPresent('Our Values', false)

WebUI.verifyTextPresent('Our Shareholders', false)

WebUI.verifyTextPresent('INNOVATION', false)

WebUI.verifyTextPresent('COMMITMENT', false)

WebUI.verifyTextPresent('FINANCIAL INCLUSION', false)

WebUI.verifyTextPresent('African Rainbow Life was formed with the backing of three shareholders', false)

WebUI.verifyTextPresent('Company', false)

WebUI.verifyTextPresent('About ARL', false)

WebUI.verifyTextPresent('Careers', false)

WebUI.verifyTextPresent('Our Offerings', false)

WebUI.verifyTextPresent('Life Cover', false)

WebUI.verifyTextPresent('Help', false)

WebUI.verifyTextPresent('Get in touch', false)

WebUI.scrollToElement(findTestObject('Page_About African Rainbow Life/a_Terms Of Use'), 0)

WebUI.verifyLinksAccessible(['https://arl-dev.netlify.com/images/arl-ts-and-cs.pdf'], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

