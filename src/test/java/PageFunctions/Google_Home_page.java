package PageFunctions;

import Common.Actions;
import PageObjects.*;

public class Google_Home_page{
	
	public static void enter_text_on_google_Home_page() {
		Actions.enter_text(googleHomePage.searchBox,"test");
	}
	

}
