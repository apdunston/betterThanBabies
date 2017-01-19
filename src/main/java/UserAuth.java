public class UserAuth extends AUserAuth {
  private IOurStuff ourStuff;

  public UserAuth(IOurStuff ourStuff) {
    this.ourStuff = ourStuff;
  }

  public static Boolean authenticate(String username, String password) {
    User = ourStuff.getUser(username);
    return user.getPassword() == password;
  }
}
