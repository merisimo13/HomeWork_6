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


    }
}
