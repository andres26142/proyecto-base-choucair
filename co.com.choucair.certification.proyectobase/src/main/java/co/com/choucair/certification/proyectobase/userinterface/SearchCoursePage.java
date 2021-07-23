package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target CERTIFICATIONS_BUTTON = Target.the("button that lead us to the courses page").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/div[1]/a"));
    public static final Target SEARCH_BOX = Target.the("box where we type the course name").located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target INPUT_BUTTON = Target.the("button where we click on to search for the course").located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target NAME_COURSE = Target.the("extract the course's name").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));
}
