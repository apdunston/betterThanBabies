public interface MessageHandlerInterface {
  public abstract RequestInterface acceptRequest();
  public abstract void sendResponse(ResponseInterface response);
}
