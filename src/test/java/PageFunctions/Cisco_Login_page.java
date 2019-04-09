package PageFunctions;

import Common.Actions;
import PageObjects.*;

public class Cisco_Login_page {
	
	public static void Login_to_cisco() {
		Actions.click_element(Cisco_Login_page_object.userIcon);
		Actions.click_element(Cisco_Login_page_object.loginButton);
		Actions.sleep();
		Actions.enter_text(Cisco_Login_page_object.userName,"lcmttest50");
		Actions.click_element(Cisco_Login_page_object.nextButton);
		Actions.sleep();
//		Actions.enter_text(Cisco_Login_page_object.passWord,"pass");
//		Actions.click_element(Cisco_Login_page_object.loginButton);
	}
	
	public static void create_new_account() {
		
	}
	
	public static void forgot_password() {
			
		}

}
