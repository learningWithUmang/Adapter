import thirdParty.yesbank.YesBankAPI;

public class YesBankAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBankAPI.transferMoney(from, to, amount);
    }

    @Override
    public void registerAccount(String accNo) {

    }

    @Override
    public long getBalance(String accNo) {
        return 0;
    }
}
