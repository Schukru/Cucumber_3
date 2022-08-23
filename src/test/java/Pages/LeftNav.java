package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;


    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement feeName;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement feeCode;

    @FindBy(css = "ms-text-field[formcontrolname='budgetAccountIntegrationCode']>input")
    private WebElement integrationCode;

    @FindBy(css = "input[id='ms-integer-field-0']")
    private WebElement priority;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceexamsone;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setuptwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceexamstwo;

    @FindBy(css = "ms-text-field>input")
    private WebElement nameInput;

    @FindBy(xpath = "//div/span[text()='Academic Period']")
    private WebElement AcademicPeriod;

    @FindBy(xpath = "//mat-option/span[contains(text(),'2021-2022')]")
    private WebElement period1;

    @FindBy(xpath = "//div/span[text()='Grade Level']")
    private WebElement GradeLevel;

    @FindBy(xpath = "(//mat-option/span[@class='mat-option-text'])[2]")
    private WebElement level1;


    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "fees" : myElement =fees; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "entranceexamsone" : myElement =entranceexamsone; break;
            case "setuptwo" : myElement =setuptwo; break;
            case "entranceexamstwo" : myElement =entranceexamstwo; break;
            case "AcademicPeriod" : myElement =AcademicPeriod; break;
            case "period1" : myElement =period1; break;
            case "GradeLevel" : myElement =GradeLevel; break;
            case "level1" : myElement =level1; break;
        }

        clickFunction(myElement);
    }
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "feeName" : myElement =feeName; break;
            case "feeCode" : myElement =feeCode; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priority" : myElement =priority; break;
            case "nameInput" : myElement =nameInput; break;
        }

        sendKeysFunction(myElement, value);
    }

}
