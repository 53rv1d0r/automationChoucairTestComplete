package co.com.choucair.certification.proyectoBase.stepdefinitions;

import co.com.choucair.certification.proyectoBase.questions.Answer;
import co.com.choucair.certification.proyectoBase.tasks.Login;
import co.com.choucair.certification.proyectoBase.tasks.OpenUp;
import co.com.choucair.certification.proyectoBase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandro wants to learn automation at the Academy Choucair$")
    public void thanAlejandroWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
