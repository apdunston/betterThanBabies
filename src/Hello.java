public class Hello {
  public static void main(String[] args) {
    // Save users
    // Authorize users
    // Say a cool message.
    IOurStuff ourStuff = new OurStuffFlatFile("our_stuff.txt");
    User adrian = new User("adunston", "untune infantry discard pedestal", "adunston@netsertive.com", "37", "a place", "12345", "54321");
    ourStuff.persistUser(adrian);

    IOurStuff ourStuff = new OurStuffFlatFile("our_stuff.txt");
    IUserAuth auth = new UserAuth(ourStuff);
    Boolean answer = auth.authenticate("adunston", "untune infantry discard pedestal");

    System.out.println("Did you authenticate? " + answer.toString());

    System.out.println("Better than babies is the best group!");

    // MessageHandler handler = new MessageHandler();
    // Request request = handler.getRequest();
    //
    // Response response = processRequest(request);
    //
    // handler.sendResponse(response);
  }

  // public Response processRequest(Request request) {
  //
  //
  //
  // 	return null;
  // }
}
