package thirdParty.icicibank;

public class ICICIBankAPI {
    public void sendAssets(int amount, String to, String from){
        System.out.println("ICICI : Transferring money from " + from + " to " + to + " amount of " + amount);
    }
}
