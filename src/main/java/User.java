public class User {
  private String username;
  private String password;
  private String email;
  private String age;
  private String address;
  private String bank_number;
  private String checking;


  public void User(String username, String password, String email, String age, String address, String bank_number, String checking) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.age = age;
    this.address = address;
    this.bank_number = bank_number;
    this.checking = checking;
  }

  public String username() {
    return this.username;
  }

  public String password() {
    return this.password;
  }

  public String serialize() {
    // write all stuff to string
  }

  public static User deserialize(String stuff) {
    // pull values from string
    // return new User(...);
  }

}
