package tests;
import org.testng.annotations.Test;

import Common.Actions;
import PageFunctions.*;

public class TestSample_1 extends Actions{

	@Test
	public static void test() {
//		Google_Home_page.enter_text_on_google_Home_page();
		Cisco_Login_page.Login_to_cisco();
	}
}
