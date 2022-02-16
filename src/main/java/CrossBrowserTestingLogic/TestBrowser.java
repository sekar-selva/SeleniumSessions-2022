package CrossBrowserTestingLogic;

public class TestBrowser {

	public static void main(String[] args) throws Exception {
		
		SwtichcaseBrowser sw = new SwtichcaseBrowser();
		sw.launch_Browser();
		sw.passUrl("https://www.kotak.com/en/home.html");
		sw.maximixeBrowser();
		String title =sw.getPageTitle();
		if (title.contains("Kotak")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Wrong title is present");
		}
		sw.closeBrowser();

	}

}
