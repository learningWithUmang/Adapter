public class bankAdapter<B> implements BankAPI {

    //Not going to work!!!!!!!!!

    B api;

    public bankAdapter(B api){ //YesBank, ICICBank
        this.api = api;
    }


    @Override
    public void sendMoney(String from, String to, int amount) {
        /*
        if else conditions
         */

    }

    @Override
    public void registerAccount(String accNo) {

    }

    @Override
    public long getBalance(String accNo) {
        return 0;
    }
}
