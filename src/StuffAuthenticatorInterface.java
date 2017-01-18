public interface StuffAuthenticatorInterface {
  public abstract StuffAuthenticatorInterface(OurStuffInterface ourStuff);
  public abstract authenticate(String username, String password);
}
