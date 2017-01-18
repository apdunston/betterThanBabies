public class Hello {
  public static void main(String[] args) {
    System.out.println("Better than babies is the best group!");

    MessageHandler handler = new MessageHandler();
    Request request = handler.getRequest();

    Response response = processRequest(request);

    handler.sendResponse(response);
  }

  public Response processRequest(Request request) {
  	


  	return null;
  }
}
