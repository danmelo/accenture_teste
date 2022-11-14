package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class VehicleInsuranceApplication {

    WebDriver driver;

    //ENTER VEHICLE DATA TAB
    String MAKE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[1]/select[1]";
    String MODEL = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[2]/select[1]";
    String CYLINDERCAPACITY = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[3]/input[1]";
    String ENGINE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[4]/input[1]";
    String DATE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[5]/input[1]";
    String NUMBERSEATS = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[6]/select[1]";
    String HANDDRIVE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/p[1]/label[1]/span[1]";
    String NUMBERSEATS2 = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[8]/select[1]";
    String FUEL = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[9]/select[1]";
    String PAYLOAD = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[10]/input[1]";
    String TOTALWEIGHT = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[11]/input[1]";
    String LISTPRICE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[12]/input[1]";
    String LICENSEPLATENUMBER = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[13]/input[1]";
    String ANNUALMILEAGE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[14]/input[1]";
    String FIRSTBUTTONNEXT = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[15]/button[1]";


    //ENTER INSURANT DATA TAB
    String FIRSTNAME = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[1]/input[1]";
    String LASTNAME = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[2]/input[1]";
    String DATEOFBIRTH = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[3]/input[1]";
    String GENDER = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]";
    String STREETADDRESS = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[5]/input[1]";
    String COUNTRY = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[6]/select[1]";
    String ZIPCODE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[7]/input[1]";
    String CITY = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[8]/input[1]";
    String OCCUPATION = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[9]/select[1]";
    String HOBBIESOTHER = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[5]/span[1]";
    String WEBSITE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[11]/input[1]";
    String PICTURE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[12]/div[1]/input[1]";
    String OPENPICBUTTON = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[12]/div[1]/button[1]";
    String SECONDNEXTBUTTON = "//button[@id='nextenterproductdata']";


    //ENTER PRODUCT DATA TAB
    String PRODUCTSTARTDATE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[1]/input[1]";
    String INSURANCESUM = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[2]/select[1]";
    String MERITRATING = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[3]/select[1]";
    String DAMAGEINSURANCE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[4]/select[1]";
    String EUROPROTECTION = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]/span[1]";
    String COURTESYCAR = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[6]/select[1]";
    String THIRDNEXTBUTTON = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[7]/button[2]";


    //SELECT PRICE OPTION TAB
    String SELECTPRICEOPT = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[4]/span[1]";
    String FOURTHNEXTBUTTON = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[2]/div[2]/button[2]";


    //SEND QUOTE TAB
    String EMAIL = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[1]/input[1]";
    String PHONE = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[2]/input[1]";
    String USERNAME = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[3]/input[1]";
    String PASSWORD = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[4]/input[1]";
    String CONFIRMPASSWORD = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[5]/input[1]";
    String COMMENTS = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[6]/textarea[1]";
    String SENDBUTTON = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[7]/button[2]";

    public VehicleInsuranceApplication(WebDriver driverParametro){
        this.driver = driverParametro;
    }

    public void selectMake (){
        WebElement selectElement = driver.findElement(By.xpath(MAKE));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Ford");
    }

    public void selectModel (){
        WebElement selectElement = driver.findElement(By.xpath(MODEL));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Scooter");
    }
    public void selectCylinderCapacity(String cylinder){
        driver.findElement(By.xpath(CYLINDERCAPACITY)).sendKeys(cylinder);
    }

    public void selectEngine(String engine){
        driver.findElement(By.xpath(ENGINE)).sendKeys(engine);
    }
    public void selectDate(String date){
        driver.findElement(By.xpath(DATE)).sendKeys(date);
    }

    public void selectNumberOfSeats (){
        WebElement selectElement = driver.findElement(By.xpath(NUMBERSEATS));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("9");
    }

    public void selectHandDrive(){
        driver.findElement(By.xpath(HANDDRIVE)).click();
    }
    public void selectNumberOfSeats2 (){
        WebElement selectElement = driver.findElement(By.xpath(NUMBERSEATS2));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("3");
    }

    public void selectFuelType(){
        WebElement selectElement = driver.findElement(By.xpath(FUEL));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Gas");
    }

    public void selectPayload(String payload){
        driver.findElement(By.xpath(PAYLOAD)).sendKeys(payload);
    }

    public void selectTotalWeight(String totalWeight){
        driver.findElement(By.xpath(TOTALWEIGHT)).sendKeys(totalWeight);
    }

    public void selectListPrice(String listPrice) {
        int format = Integer.parseInt(listPrice);

            driver.findElement(By.xpath(LISTPRICE)).sendKeys(listPrice);
            Assert.assertTrue(format>=500 && format<= 100000);

    }

    public void selectLicenseNumber(String licenseNumber){
        driver.findElement(By.xpath(LICENSEPLATENUMBER)).sendKeys(licenseNumber);
        Assert.assertTrue(licenseNumber.length()<=10);

    }

    public void selectAnnualMileage(String annualMileage){
        int format = Integer.parseInt(annualMileage);
        driver.findElement(By.xpath(ANNUALMILEAGE)).sendKeys(annualMileage);
        Assert.assertTrue(format>=100 && format <= 100000 );
    }

    public void clickNextButton(){
        driver.findElement(By.xpath(FIRSTBUTTONNEXT)).click();
    }

    public void selectName(String name){
        driver.findElement(By.xpath(FIRSTNAME)).sendKeys(name);
    }

    public void selectLastName(String lastName){
        driver.findElement(By.xpath(LASTNAME)).sendKeys(lastName);
    }

    public void selectDateOfBirth(String dateOfBirth){
        driver.findElement(By.xpath(DATEOFBIRTH)).sendKeys(dateOfBirth);
    }

    public void selectGender(){
        driver.findElement(By.xpath(GENDER)).click();
    }

    public void selectStreetAddress(String streetAddress){
        driver.findElement(By.xpath(STREETADDRESS)).sendKeys(streetAddress);
    }

    public void selectCountry (){
        WebElement selectElement = driver.findElement(By.xpath(COUNTRY));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Brazil");
    }

    public void selectZipCode(String zipCode){
        driver.findElement(By.xpath(ZIPCODE)).sendKeys(zipCode);
    }

    public void selectCity(String city){
        driver.findElement(By.xpath(CITY)).sendKeys(city);
    }

    public void selectOccupation (){
        WebElement selectElement = driver.findElement(By.xpath(OCCUPATION));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Employee");
    }

    public void selectHobbies(){
        driver.findElement(By.xpath(HOBBIESOTHER)).click();
    }

    public void selectWebSite(String webSite){
        driver.findElement(By.xpath(WEBSITE)).sendKeys(webSite);
    }

//    public void uploadPicture() throws InterruptedException {
//        driver.findElement(By.xpath(OPENPICBUTTON)).click();
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath(PICTURE)).sendKeys("C:/Users/Daniel Melo/OneDrive/Imagens/Natasha convite.jpg");
//        Thread.sleep(2000);
////
////
//        //driver.findElement(By.xpath(PICTURE)).sendKeys(picture);
//    }
    public void nextButtonInsurantData(){
        driver.findElement(By.xpath(SECONDNEXTBUTTON)).click();
        }

    public void startDate(String startDate){

        driver.findElement(By.xpath(PRODUCTSTARTDATE)).sendKeys(startDate);

    }

    public void insuranceSum (){
        WebElement selectElement = driver.findElement(By.xpath(INSURANCESUM));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("35.000.000,00");
    }

    public void meritRating (){
        WebElement selectElement = driver.findElement(By.xpath(MERITRATING));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Bonus 7");
    }

    public void damageInsurance (){
        WebElement selectElement = driver.findElement(By.xpath(DAMAGEINSURANCE));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("Full Coverage");
    }

    public void optionalProducts(){
        driver.findElement(By.xpath(EUROPROTECTION)).click();
    }

    public void courtesyCar(){
        WebElement selectElement = driver.findElement(By.xpath(COURTESYCAR));
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText("No");
    }

    public void thirdNextButton(){
        driver.findElement(By.xpath(THIRDNEXTBUTTON)).click();
    }

    public void selectPriceOption(){
        driver.findElement(By.xpath(SELECTPRICEOPT)).click();
    }

    public void fourthNextButton(){
        driver.findElement(By.xpath(FOURTHNEXTBUTTON)).click();
    }

    public void enterEmail(String email){
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void enterPhone(String phone){
        driver.findElement(By.xpath(PHONE)).sendKeys(phone);
    }

    public void enterUsername(String username){
        driver.findElement(By.xpath(USERNAME)).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(By.xpath(PASSWORD)).sendKeys(password);
    }

    public void confirmPassword(String confirmPassword){
        driver.findElement(By.xpath(CONFIRMPASSWORD)).sendKeys(confirmPassword);
    }

    public void enterComments(String comments){
        driver.findElement(By.xpath(COMMENTS)).sendKeys(comments);
    }

    public void sendQuote() {
        driver.findElement(By.xpath(SENDBUTTON)).click();

    }

    public void confirmacaoEnvio() throws InterruptedException {
        Thread.sleep(15000);
        driver.switchTo().activeElement();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[7]/div[1]/button[1]")).click();
    }


}













