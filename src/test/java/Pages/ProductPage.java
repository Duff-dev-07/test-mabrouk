package Pages;

import Helper.Config;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
    @FindBy(xpath ="/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[2]/div[3]/span")
    List<WebElement> product_colors;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[1]/div[3]/span/ul/li/div/span")
    List<WebElement> product_sizes;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a")
    WebElement add_to_cart_btn;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]/a[2]")
    WebElement view_cart_btn;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[4]/div/div/main/article/div/div/div/div/div/div/div[1]/div/div/div[1]/div/form/div[1]/div/div[2]/div[1]/div/a")
    WebElement product_name_in_cart;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[4]/div/div/main/article/div/div/div/div/div/div/div[1]/div/div/div[1]/div/form/div[1]/div/div[2]/div[2]/p[1]/span")
    WebElement product_color_in_cart;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div[4]/div/div/main/article/div/div/div/div/div/div/div[1]/div/div/div[1]/div/form/div[1]/div/div[2]/div[2]/p[2]/span")
    WebElement product_size_in_cart;

    public ProductPage() {
        PageFactory.initElements(Config.driver, this);
    }

    public void select_color_and_size(String product_color, String product_size) throws Exception {
        try {
            for(WebElement color:product_colors) {
                if(product_color.equalsIgnoreCase(color.getDomAttribute("data-option"))) {
                    color.click();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            for(WebElement size:product_sizes) {
                if(size.getText().contains(product_size)) {
                    size.click();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        Config.attent(2);

        add_to_cart_btn.click();
    }

    public void open_cart() {
        Config.attent(3);
        view_cart_btn.click();
    }

    public void check_product_in_cart(String product_name, String product_size, String product_color) {
        Assert.assertTrue(product_name_in_cart.getText().contains(product_name));
        Assert.assertEquals(product_size_in_cart.getText(), product_size);
        Assert.assertEquals(product_color_in_cart.getText(), product_color);
    }
}
