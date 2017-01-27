public interface IUser {

  public void User(String username, String password, String email, String age, String address, String bank_number, String checking);
  public String username();
  public String password();
  public String serialize();
//  public static User deserialize(String stuff);

}
