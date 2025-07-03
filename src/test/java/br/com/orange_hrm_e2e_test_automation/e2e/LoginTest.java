package br.com.orange_hrm_e2e_test_automation.e2e;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeEach
    public void beforeEach(){
        this.loginPage = new LoginPage();
    }

    @AfterEach
    public void afterEach(){
        loginPage.quit();
    }



}
