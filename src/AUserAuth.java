public abstract class AUserAuth {
  public abstract AUserAuth(OurStuffInterface ourStuff);
  public abstract Boolean authenticate(String username, String password);
}
