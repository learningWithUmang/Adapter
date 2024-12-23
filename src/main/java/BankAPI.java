public interface BankAPI {
    void sendMoney(String from, String to, int amount);

    void registerAccount(String accNo);

    long getBalance(String accNo);
}
