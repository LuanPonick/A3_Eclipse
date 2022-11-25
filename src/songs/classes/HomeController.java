package songs.classes;

import songs.windows.LoginRegister;
import songs.windows.OngsInformation;

public class HomeController {
	public static void TradeToOngsInformation() {
		OngsInformation ongsInformation = new OngsInformation();
		ongsInformation.setVisible(true);
		
	}
	public static void TradeToLoginRegister() {
		LoginRegister loginRegister = new LoginRegister();
		loginRegister.setVisible(true);
	}
}
