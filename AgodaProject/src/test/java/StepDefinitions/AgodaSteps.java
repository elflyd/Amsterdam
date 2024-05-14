package StepDefinitions;

import Pages.AgodaPages;
import Util.DriverFac;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class AgodaSteps {
    WebDriver driver = DriverFac.getDriver();
    AgodaPages agodaPages = new AgodaPages(driver);
    @Given("User go to  HomePage")
    public void userIsOnHomepage() {
        AgodaPages.HomePage();
    }

    @When("Click search Hotel")
    public void otelAramaAlani() {
        AgodaPages.otelAramaAlani();
    }

    @When("Search Location for vacation")
    public void hollandaSec() throws InterruptedException {
        AgodaPages.ulkeYazmaAlani();
    }

    @When("Choose start - end date")
    public void geziBaslangıcVeBitisTarihiSecilir() throws InterruptedException {
        AgodaPages.baslangıcTarihineTıkla();
        Thread.sleep(3);
        AgodaPages.bitisTarihiTikla();
    }


    @When("Close info pop-up")
    public void closeInfoPopUp() {
       AgodaPages.closePopup();
    }

    @When("Add child option")
    public void addChildOption() {
        AgodaPages.childOptions();
    }

    @When("Choose child's age")
    public void chooseChildSAge() {
        try {
            AgodaPages.addChildAge();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Click search button")
    public void clickSearchButton() {
        AgodaPages.clickSearch();
    }

    @When("Click distance options and chose nearest to the central")
    public void choseDistanceOption(){
        try {
            AgodaPages.choseDistance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Check the page is open as filtered")
    public void checkThePageIsOpenWithFilter() {
    }

    @When("Scroll until find Accomadation Filter and Chose Hotel")
    public void swipeUntilFindAccomadationFilterAndChoseHotel() {
        AgodaPages.choseAccomationType();
    }

    @When("Scroll until find Star Rating Filter Chose Hotel Star Rate")
    public void swipeUntilFindStarRatingFilterChoseHotelStarRate() {
        AgodaPages.choseHotelRate();

    }

    @When("Scroll until find Property facilities and Chose")
    public void swiperUntilFindPropertyFacilitiesAndChose() {
        AgodaPages.propertiesFacility();
    }

    @When("Scroll until find distance and Chose")
    public void scrollUntilFindDistanceAndChose() {


    }

    @When("Click Hotel price")
    public void clickHotelPrice() {
    }

    @Then("Go to previous page")
    public void goToPreviousPage() {
    }

    @When("Click room tab")
    public void clickRoomTab() {
    }

    @When("Click book now")
    public void clickBookNow() {
    }

    @Then("Enter name & surname, email")
    public void enterNameSurnameEmail() {
    }

    @When("Click next step")
    public void clickNextStep() {
    }

    @And("Check the cart page")
    public void checkTheCartPage() {
    }
}
      
