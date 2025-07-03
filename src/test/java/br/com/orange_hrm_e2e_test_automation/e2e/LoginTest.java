package br.com.orange_hrm_e2e_test_automation.e2e;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @BeforeEach
    public void beforeEach(){
        this.loginPage = new LoginPage();
    }

    @AfterEach
    public void afterEach(){
        loginPage.quit();
    }

    @Test
    public void deveRealizarLogin(){
        dashboardPage = loginPage.preencherFormularioEEnviar();

        Assertions.assertTrue(dashboardPage.isPaginaDashboard());
        Assertions.assertEquals("manda user", dashboardPage.getNomeUsuario());
        Assertions.assertTrue(dashboardPage.isVisivelAreaUsuario());
    }

}
