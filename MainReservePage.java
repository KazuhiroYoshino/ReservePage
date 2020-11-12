package webUiTestReserveApp;

import java.io.IOException;

public class MainReservePage {
	public static void main(String[] args) throws InterruptedException, IOException {
		String testCaseFilename;
		String resultFilename;

		WebTestReservePage reservePage = new WebTestReservePage();
		reservePage.open();

		testCaseFilename = "C:\\ReservePage\\TestConfig\\ReserveForm\\initCheck.csv";
		resultFilename = "C:\\ReservePageTestResults\\ReserveForm\\initCheckResult.csv";
		reservePage.initCheck(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		testCaseFilename = "C:\\ReservePage\\TestConfig\\ReserveForm\\reserveTestOldSite.csv";
		resultFilename = "C:\\ReservePageTestResults\\ReserveForm\\reserveTestOldSiteResult.csv";
		reservePage.reserveTest(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		testCaseFilename = "C:\\ReservePage\\TestConfig\\ReserveForm\\reserveErrorTestOldSite.csv";
		resultFilename = "C:\\ReservePageTestResults\\ReserveForm\\reserveErrorTestOldSiteResult.csv";
		reservePage.reserveTest(testCaseFilename, resultFilename);
		if(reservePage.reservePageError == 1) {
			System.exit(1);
		}

		reservePage.close();
	}
}
