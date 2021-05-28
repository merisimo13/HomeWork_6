import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utills.ChromeRun;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GoTbilisi extends ChromeRun {
    @Test
    public void Firstpage(){
        $(byText("Welcome to Georgia")).waitUntil(Condition.visible, 3000);
        $(".cta__text").click();
        String expetedResult = "Old City. New City.".toUpperCase();
        Assert.assertEquals(expetedResult,$("h1").getText());



    }
}
