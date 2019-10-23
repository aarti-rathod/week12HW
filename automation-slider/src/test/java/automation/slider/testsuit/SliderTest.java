package automation.slider.testsuit;

import automation.slider.pages.MainPage;
import automation.slider.testbase.TestBase;
import org.testng.annotations.Test;

/*
Test Cases
 */
public class SliderTest extends TestBase {
    MainPage mainPage =new MainPage();
    @Test
    public void userShouldAbleToMoveSliderSuccessfully(){
        mainPage.clickToSkipSignIn();
        mainPage.mouseHoverOnWidgets();
        mainPage.selectSliderFromList();
        mainPage.moveSliderToTheTgt();
    }
}
