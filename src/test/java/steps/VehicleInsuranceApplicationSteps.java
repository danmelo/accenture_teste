package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.VehicleInsuranceApplication;

import java.util.concurrent.TimeUnit;

public class VehicleInsuranceApplicationSteps {

    WebDriver driver;

    VehicleInsuranceApplication VehicleInsuranceApplication;


    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        VehicleInsuranceApplication = new VehicleInsuranceApplication(driver);
        driver.manage().window().maximize();

    }

    @After
    public void after() throws InterruptedException {
        //Thread.sleep(15000);
        driver.close();
    }

    @Dado("que eu esteja na pagina inicial:{string}")
    public void queEstejaNaPaginaInicial(String url) {
        driver.get(url);
    }

    @E("preencha os dados do veiculo")
    public void preenchaDadosDoVeiculo() {
        VehicleInsuranceApplication.selectMake();
        VehicleInsuranceApplication.selectModel();
        VehicleInsuranceApplication.selectDate("11/12/2022");
        VehicleInsuranceApplication.selectNumberOfSeats();
        VehicleInsuranceApplication.selectHandDrive();
        VehicleInsuranceApplication.selectNumberOfSeats2();
        VehicleInsuranceApplication.selectFuelType();


    }

    @E("insiro um valor valido para cylinder capacity")
        public void insiroUmValorValidoParaCylinderCapacity(){
        VehicleInsuranceApplication.selectCylinderCapacity("2000");
    }

    @E("insiro um valor valido de engine performance")
        public void insiroUmValorValidoDeEnginePerformance(){
            VehicleInsuranceApplication.selectEngine("1000");
        }

    @E("insiro um valor de payload entre 1 e 1000")
        public void insiroUmValorDePayloadEntre1E1000(){
        VehicleInsuranceApplication.selectPayload("1000");
    }

    @E("insiro um valor entre 100 e 50000 de total weight")
        public void insiroUmValorEntre100E50000DeTotalWeight(){
        VehicleInsuranceApplication.selectTotalWeight("50000");
    }

    @E("insiro um valor válido no List Price")
        public void insiroUmValorValidoNoListPrice(){
        VehicleInsuranceApplication.selectListPrice("500");
    }

    @E("insiro um numero de ate 10 caracteres no license plate number")
        public void insiroUmNumeroDeAte10CaracteresNoLicensePlateNumber(){
        VehicleInsuranceApplication.selectLicenseNumber("0123456789");

    }

    @E("insiro um valor entre 100 e 100000 no annual mileage")
        public void insiroUmValorEntre100E100000NoAnnualMileage(){
        VehicleInsuranceApplication.selectAnnualMileage("100000");
    }

    @E("clique no botao next")
    public void cliqueNoBotaoNext() {
        VehicleInsuranceApplication.clickNextButton();
    }

    @E("preencha o formulario Insurant Data")
    public void preenchaOFormularioInsurantData() {
        VehicleInsuranceApplication.selectName("Daniel");
        VehicleInsuranceApplication.selectLastName("Melo");
        VehicleInsuranceApplication.selectDateOfBirth("08/29/1985");
        VehicleInsuranceApplication.selectGender();
        VehicleInsuranceApplication.selectStreetAddress("Avenida João XXIII 237");
        VehicleInsuranceApplication.selectCountry();
        VehicleInsuranceApplication.selectZipCode("08780830");
        VehicleInsuranceApplication.selectCity("Mogi das Cruzes");
        VehicleInsuranceApplication.selectOccupation();
        VehicleInsuranceApplication.selectHobbies();
        VehicleInsuranceApplication.selectWebSite("www.linkedin.com");
//      VehicleInsuranceApplication.uploadPicture();
     }

        @E("clique no segundo botao next")
        public void cliqueNoSegundoBotaoNext () {
            VehicleInsuranceApplication.nextButtonInsurantData();
        }

    @E("preencha o formulario Enter Product Data")
    public void preenchaOFormularioEnterProductData() {
        VehicleInsuranceApplication.startDate("01/14/2023");
        VehicleInsuranceApplication.insuranceSum();
        VehicleInsuranceApplication.meritRating();
        VehicleInsuranceApplication.damageInsurance();
        VehicleInsuranceApplication.optionalProducts();
        VehicleInsuranceApplication.courtesyCar();

    }

    @E("clique no terceiro botao next")
    public void cliqueNoTerceiroBotaoNext() {
        VehicleInsuranceApplication.thirdNextButton();
    }

    @E("seleciono o Option Price")
    public void selecionoOOptionPrice(){
        VehicleInsuranceApplication.selectPriceOption();
    }

    @E("clico no botao next do Price Option")
    public void clicoNoBotaoNextDoPriceOption() {
        VehicleInsuranceApplication.fourthNextButton();
    }

    @E("preencho os dados de Send Quote")
    public void preenchoOsDadosDeSendQuote() {
        VehicleInsuranceApplication.enterEmail("danmelorayder@gmail.com");
        VehicleInsuranceApplication.enterPhone("55555550");
        VehicleInsuranceApplication.enterUsername("danmelo1985");
        VehicleInsuranceApplication.enterComments("Teste");
    }

    @E("crio uma senha forte")
        public void crioUmaSenhaForte(){
            VehicleInsuranceApplication.creatPassword("123Dan", "123Dan");
        }


    @Quando("eu clico no botao send")
    public void clicoNoBotaoSend() {
        VehicleInsuranceApplication.sendQuote();
    }

    @Então("a mensagem de sucesso é exibida")
    public void aMensagemDeSucessoÉExibida() throws InterruptedException {
        VehicleInsuranceApplication.confirmacaoEnvio();
    }
}