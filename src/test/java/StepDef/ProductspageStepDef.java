package StepDef;

import Helper.Config;
import Helper.Utlis;
import Pages.ProductsPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProductspageStepDef {
    @Given("utlisateur est sur la page Chemises & Blouses")
    public void utlisateur_est_sur_la_page_chemises_blouses() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.setBinary(System.getenv("HELIUM_BINARY"));
        Config.driver = new ChromeDriver(options);

        Config.driver.get(Utlis.getProperty("produitsMabrouk"));
    }
    @When("utilisateur clique sur le produit {string}")
    public void utilisateur_clique_sur_le_produit(String product_name) {
        ProductsPage product = new ProductsPage();
        product.click_on_product(product_name);
    }
    @Then("la page du produit {string} est affiche")
    public void la_page_du_produit_est_affiche(String product_name) {
        ProductsPage product = new ProductsPage();
        product.check_product_name(product_name);
        Config.driver.quit();
    }

}
