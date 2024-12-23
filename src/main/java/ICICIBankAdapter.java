import thirdParty.icicibank.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI{
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBankAPI.sendAssets(amount, to, from);
    }

    @Override
    public void registerAccount(String accNo) {

    }

    @Override
    public long getBalance(String accNo) {
        return 0;
    }
}
