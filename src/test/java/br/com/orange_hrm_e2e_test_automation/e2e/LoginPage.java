package br.com.orange_hrm_e2e_test_automation.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObjects{

    public LoginPage() {
        super(null);
        browser.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public DashboardPage preencherFormularioEEnviar() {
        browser.findElement(By.name("username")).sendKeys("Admin");
        browser.findElement(By.name("password")).sendKeys("admin123");
        browser.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();

        return new DashboardPage(browser);
    }
}
