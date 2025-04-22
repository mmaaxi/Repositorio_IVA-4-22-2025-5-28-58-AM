package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("^El usuario exporta el reporte$")
    public void exportReport() {
        page.clickExportButton();
    }

    @When("^El usuario revisa el archivo Excel exportado$")
    public void reviewExportedExcel() {
        page.openExportedExcel();
    }

    @Then("^El Excel incluye las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido' con los respectivos montos$")
    public void validateColumnsInExcel() {
        Assert.assertTrue("IVA 0% column is missing", page.isColumnPresent("IVA 0%"));
        Assert.assertTrue("IVA exento column is missing", page.isColumnPresent("IVA exento"));
        Assert.assertTrue("IVA retenido column is missing", page.isColumnPresent("IVA retenido"));
    }
}