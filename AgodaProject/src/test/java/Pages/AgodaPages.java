package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class AgodaPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By searchHotel = By.cssSelector("input.SearchBoxTextEditor.SearchBoxTextEditor--autocomplete");
    static By choseAmsterdam = By.xpath("//li[@data-text='Amsterdam']");

    static By startDate = By.xpath("//span[@data-selenium-date='2024-06-01']");
    static By endDate = By.xpath("//button[@data-element-name='occupancy-selector-panel-children' and @aria-label='Add']");

    static By closePopup = By.cssSelector("button.ab-close-button");
    static By addChild = By.xpath("//button[@data-element-name='occupancy-selector-panel-children' and @aria-label='Add']");
    static By choseChildsAgeList = By.xpath("//select[@data-selenium='dropdownInput']");
    static By childAge = By.xpath("//option[@value='14']");
    static By searchButton = By.xpath("//span[text()='SEARCH']");

    static By distanceFilter = By.xpath("//a[@data-element-name='search-sort-distance-landmark']");
    static By centralOption = By.xpath("//span[text()='Amsterdam Centraal Railway Station']");
    static By accomadationType = By.id("filter-menu-AccomdType");
    static By accomation = By.xpath("//span[@class='filter-item-content' and text()='Hotel']");

    static  By hotelStarSelection = By.xpath("//span[text()='Star rating']");

    static  By hotelStar = By.xpath("span.filter-item-info.StarRating-5");

    static By faciliesOption= By.id("filter-menu-Facilities");

    static By poolFacilities = By.id("//span[text()='Swimming pool']");

    static By familyfriendlyOptions = By.xpath("//span[text()='Family/child friendly']");

    static By distanceToCenter = By.id("filter-menu-CityCenterDistance");

    static By cityCenter = By.xpath("//span[text()='Inside city center']");

    static By hotelPrice = By.cssSelector("aside.List.PropertyCard__Prices");

    static By rooms = By.xpath("//div[@id='hotelNavBar']//button[@data-href='#property-room-grid-root']");

    static By parentNChild = By.xpath("//span[@class='Capacity-iconGroup']/i[@class='ficon ficon-adults-one ficon-24 ChildRoomsList-capacityIcon']");

    static  By bookNow = By.cssSelector("button.ChildRoomsList-bookButtonInput");

    static By fullName = By.id("firstName_lastName");
    static By email = By.id("email");
    static  By retypeEmail = By.id("retypeEmail");
    static  By nextStep = By.xpath("//button[@data-action='nextPage']");

    static By cartPage = By.xpath("//h6[text()='We are holding your price…']");

    static  By adultValueCheck = By.xpath("//span[@data-selenium='adultValue' and @data-value='2']");
    static  By childValueCheck = By.xpath("//span[@data-selenium='childValue' and @data-value='1']");



    static JavascriptExecutor jsx = (JavascriptExecutor) driver;

    public AgodaPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    public static void HomePage() {

    }

    public static void otelAramaAlani() {
        elementHelper.click(searchHotel);
    }

    public static void ulkeYazmaAlani() throws InterruptedException {
        elementHelper.findElement(searchHotel).sendKeys("Amsterdam");
        Thread.sleep(7);
        elementHelper.findElement(choseAmsterdam).click();
    }

    public static void baslangıcTarihineTıkla() {
        elementHelper.click(startDate);
    }

    public static void bitisTarihiTikla() {
        elementHelper.click(endDate);
    }

    public static void closePopup(){
        elementHelper.click(closePopup);

    }
    public static  void childOptions(){
        elementHelper.click(addChild);
    }

    public static void addChildAge() throws InterruptedException {
        elementHelper.click(childAge);
        Thread.sleep(3);
        elementHelper.click(choseChildsAgeList);
    }

    public static void clickSearch(){
        elementHelper.click(searchButton);
    }

    public static void choseDistance() throws InterruptedException {
        elementHelper.click(distanceFilter);
        Thread.sleep(3);
        elementHelper.click(centralOption);
    }

    public static void choseAccomationType(){

        jsx.executeScript("window.scrollBy(0,450)","");
        elementHelper.click(accomadationType);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(accomation);

    }


    public static void  choseHotelRate(){
        jsx.executeScript("window.scrollBy(0,450)","");
        elementHelper.click(hotelStarSelection);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(hotelStar);
    }

    public static void propertiesFacility(){
        WebElement element = By.id("filter-menu-Facilities").findElement(driver);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(poolFacilities);
        elementHelper.click(familyfriendlyOptions);
    }

    public static void distanceToCenter(){
        WebElement element = By.id("filter-menu-CityCenterDistance").findElement(driver);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(cityCenter);
    }

    public static void hotelprice(){
        elementHelper.click(hotelPrice);
    }
// son sekme
    public static void rooms(){
        elementHelper.click(rooms);
    }

    public static void parentnChild(){
        assertTrue(driver.findElement(By.xpath("//span[@class='Capacity-iconGroup']/i[@class='ficon ficon-adults-one ficon-24 ChildRoomsList-capacityIcon']")).isDisplayed());
    }

    public static void bookNow(){
        elementHelper.click(bookNow);
    }

    public static void fullName() throws InterruptedException {
        elementHelper.findElement(searchHotel).sendKeys("Excellence Testinium");


    }






}
