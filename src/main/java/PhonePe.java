import thirdParty.icicibank.ICICIBankAPI;
import thirdParty.yesbank.YesBankAPI;

public class PhonePe {
    public static BankAPI api = new ICICIBankAdapter();

    public static void main(String[] args) {
        /*
        transfer money
         */
        //yesBankAPI.transferMoney("umang", "Ishwarya", 2000);
        //iciciBankAPI.sendCurrency(2000, "ishwarya", "umang");

        api.sendMoney("Umang", "Ishwarya", 50000);
    }
}
