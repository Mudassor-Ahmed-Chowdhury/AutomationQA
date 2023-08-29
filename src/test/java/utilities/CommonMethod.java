package utilities;

import basedriver.base_browser;

public class CommonMethod extends base_browser {
	public static void timeout() throws InterruptedException {
		Thread.sleep(3000);
	}
	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}

}
