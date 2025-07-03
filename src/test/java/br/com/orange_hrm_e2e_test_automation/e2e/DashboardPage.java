package br.com.orange_hrm_e2e_test_automation.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends PageObjects{

    public static final String URL_DASHBOARD = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    public DashboardPage(WebDriver browser) {
        super(browser);
    }

    public boolean isPaginaDashboard() {
        return browser.getCurrentUrl().equals(URL_DASHBOARD);
    }

    public String getNomeUsuario() {
        return browser.findElement(By.cssSelector(".oxd-userdropdown-name")).getText();
    }

    public boolean isVisivelAreaUsuario() {
        try {
            WebElement elemento = browser.findElement(By.cssSelector(".oxd-topbar-header-userarea"));
            return elemento.isDisplayed();
        } catch (NoSuchFieldError e){
            return false;
        }
    }
}
