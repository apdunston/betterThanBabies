public class User {
  private String username;
  private String password;
  private String email;
  private String age;
  private String address;
  private String bank_number;
  private String checking;


  public void User(OurStuffInterface ourStuff, String username, String password, String email, String age, String address, String bank_number, String checking) {
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

  public Boolean isPassword(String password) {
    return (this.password == password);
  }

  public void persist() {
    // ... Save through the OurStuffInterface
  }

}
