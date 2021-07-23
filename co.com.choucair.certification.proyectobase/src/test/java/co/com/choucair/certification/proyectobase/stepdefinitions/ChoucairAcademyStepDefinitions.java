package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that julian wants to learn automation at the academy Choucair$")
    public void thatJulianWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^he searches for the course on the Choucair academy platform$")
    public void heSearchesForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse()))));
    }
}
