public class UserAuth extends AUserAuth {
  private OurStuffInterface ourStuff;

  public UserAuth(OurStuffInterface ourStuff) {
    this.ourStuff = ourStuff;
  }

  public static Boolean authenticate(String username, String password) {
    User = ourStuff.getUser(username);
    return user.getPassword() == password;
  }
}
