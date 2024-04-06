package practiceSession;

public class AccountMain {

	public static void main(String[] args) {

		AccountHolderDetails ahd = new AccountHolderDetails();

		ahd.customerName = "Tom Philips";
		ahd.accountType = "Chequing";

		ahd.minimumBalance = 500;
		ahd.accountBalance = 0;

		ahd.isAcctBalanceGreaterThanOrEqualtToMinBalance();
		ahd.isAcctBalanceGreaterThanZero();
		ahd.validateAccountHasMinBalance();
	}

}
