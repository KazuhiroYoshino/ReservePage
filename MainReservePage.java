package reservePage;

import java.io.IOException;

public class MainReservePage {
	public static void main(String[] args) throws InterruptedException, IOException {
		String testCaseFilename;
		String resultFilename;

		WebTestReservePage reservePage = new WebTestReservePage();
		reservePage.open();

		testCaseFilename = "D:\\ReservePage\\TestConfig\\ReserveForm\\initCheck.csv";
		resultFilename = "D:\\ReservePageTestResults\\ReserveForm\\initCheckResult.csv";
		reservePage.initCheck(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		testCaseFilename = "D:\\ReservePage\\TestConfig\\ReserveForm\\reserveTestOldSite.csv";
		resultFilename = "D:\\ReservePageTestResults\\ReserveForm\\reserveTestOldSiteResult.csv";
		reservePage.reserveTest(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		testCaseFilename = "D:\\ReservePage\\TestConfig\\ReserveForm\\reserveErrorTestOldSite.csv";
		resultFilename = "D:\\ReservePageTestResults\\ReserveForm\\reserveErrorTestOldSiteResult.csv";
		reservePage.reserveTest(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		reservePage.close();
	}
}
