package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.swing.text.html.HTML;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON= Target.the("button that show us the form to login").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a"));
    public  static final Target  INPUT_USER = Target.the("where we put the username").located(By.xpath("//*[@id=\"username\"]"));
    public  static final Target INPUT_PASSWORD = Target.the("where we write the password").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target ENTER_BUTTON =   Target.the("where we click to log into the platform").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));

}
