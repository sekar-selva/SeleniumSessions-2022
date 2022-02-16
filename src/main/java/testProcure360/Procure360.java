package testProcure360;

public class Procure360 {

	public static void main(String[] args) {
		String browserName = "chrome";
		Procure360_Common cm = new Procure360_Common();
		cm.launchBrowser(browserName);
		cm.getUrl("http://65.1.183.131/Procure360/#/login");

	}

}
