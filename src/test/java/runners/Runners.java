package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions","hooks"},   //stepdefinitions path
        tags = "@failed_scenario",
        dryRun = false
)
public class Runners {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
/*
*****Cucumber Kurulumu*****
-Cucumber page object model için olusturdugumuz klasörler :
 pages -> page objectler
 runners-> testcaseleri run etmek ve raporlar eklemek,feature file ile stepdefinitions lari birleştirmek için kullanilir.
 stepdefinitions-> java kodlari
 utilities -> reusable metotlar,driver,configreader...
 * -Cucumber feature klasörü
Tüm feature file lar bu klasöre gider
Tüm tescaseler gherken dilinde  bu klasörde yazilir.
* *****Cucumber Kurulumu*****
-Cucumber page object model icin olusturduugmunuz klasorler :
    pages -> page objectler
    runners -> test caseleri run etmek, raporlar eklemek, feature file ile step definitionslari birlestirmek icin
    stepdefinitions -> java kodlari
    utilities -> reusable metotlar, driver, configreader,..
-Cucumber feature klasoru
    Tum feature file lar bu klasore gider
    Tum test caseler gherken dilinde bu klasorde yazilir
-----------19 Subat 2023---------------------------
1. Feature file olustur: ilkfeaturefile.feature
2. Runner class'ini run et
3. Console'dan missing step definition'lari kopyala
4. stepdefinitions package'inda GoogleStepDefinitions class'i olustur ve oraya yapistir
 */
