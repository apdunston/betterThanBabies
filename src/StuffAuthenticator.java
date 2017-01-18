public class StuffAuthenticator implements StuffAuthenticatorInterface {
  private OurStuffInterface ourStuff;

  public StuffAuthenticatorInterface(OurStuffInterface ourStuff) {
    this.ourStuff = ourStuff;
  }

  public authenticate(String username, String password) {
    ourStuff.isLogin(username, password);
  }
}
