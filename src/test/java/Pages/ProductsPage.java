package Pages;

import Helper.Config;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
    @FindBy(xpath ="/html/body/div[5]/div[3]/div[4]/main/div/div[4]/div/ul/li/div/div[2]/div[4]/div[1]/h6/a")
    List<WebElement> products;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/h1")
    WebElement product_name;


    public ProductsPage() {
        PageFactory.initElements(Config.driver, this);
    }

    public void click_on_product(String product_name) {
        try {
            for(WebElement product:products) {
                if(product.getText().contains(product_name)) {
                    product.click();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void check_product_name(String product) {
        Assert.assertEquals(product_name.getText(), product);
    }
}
