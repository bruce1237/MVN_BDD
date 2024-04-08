package hellocucumber;

import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.*;
import hellocucumber.MyDate;

public class Friday {

    private String actualAnswer;
    private MyDate myDate;

    @Given("today is {string}")
    public void todayIsSunday(String date){
        this.myDate = new MyDate();
        this.myDate.setDate(date);
    }

    @When("I ask whether it's Friday yet")
    public void IaskWhetherisFridayYet(){
        this.actualAnswer = this.myDate.isFriday();
    }

    @Then("I should be told {string}")
    public void IShouldBeTold(String answer){
        assertEquals(answer, this.actualAnswer);
    }

    @When("I ask whether it's Sunday yet")
    public void isSundayYet(){
        this.actualAnswer = myDate.isSunday(this.myDate.wDate);
    }
}