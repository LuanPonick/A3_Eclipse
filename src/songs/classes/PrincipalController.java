package songs.classes;

import songs.windows.LoginRegister;

public class PrincipalController {
	public static void TradeToLoginRegister(){
		LoginRegister loginRegister = new LoginRegister();
		loginRegister.setVisible(true);
	}
}
