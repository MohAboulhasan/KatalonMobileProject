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

Mobile.startApplication('C:\\Users\\MABOULHASAN\\Downloads\\General-Store.apk', true)

Mobile.tap(findTestObject('Object Repository/GeneralStore/HomePage/android.widget.Spinner'), 0)

Mobile.scrollToText('Egypt')

Mobile.tap(findTestObject('Object Repository/GeneralStore/HomePage/android.widget.TextView - Egypt'), 0)

Mobile.sendKeys(findTestObject('Object Repository/GeneralStore/HomePage/android.widget.EditText - Enter name here'), 'Mohamed')

Mobile.tap(findTestObject('Object Repository/GeneralStore/HomePage/android.widget.Button - Lets  Shop'), 0)

Mobile.tap(findTestObject('Object Repository/GeneralStore/ProductsPage/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/GeneralStore/ProductsPage/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/GeneralStore/ProductsPage/android.widget.TextView - ADD TO CART (1)'), 0)

Mobile.tap(findTestObject('Object Repository/GeneralStore/ProductsPage/android.widget.ImageButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/GeneralStore/CartPage/android.widget.TextView - Air Jordan 4 Retro'), 
    'Air Jordan 4 Retro')

Mobile.verifyElementText(findTestObject('Object Repository/GeneralStore/CartPage/android.widget.TextView - Air Jordan 1 Mid SE'), 
    'Air Jordan 1 Mid SE')

Mobile.verifyElementText(findTestObject('Object Repository/GeneralStore/CartPage/android.widget.TextView -  280.97'), '$ 280.97')

Mobile.closeApplication()

