import org.testng.Assert;
import org.testng.annotations.Test;
import utills.ChromeRun;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GoEvent extends ChromeRun {
    @Test
    public void Event (){
        $(".menu-toggler__icon").click();
        $(byText("Events Calendar")).click();
        $(".ui-selectmenu-text").click();
        $("#ui-id-2").click();
        $(byName("from")).click();
        $(".ui-datepicker-next").click();
        $(byLinkText("13")).click();
        Assert.assertEquals("13/06/21",$("#from").getValue());

    }

}
