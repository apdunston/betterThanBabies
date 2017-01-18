public class Response {
	private int responseType;
	private PayloadInterface responsePayload;

	public Request(int requestType, PayloadInterface responsePayload) {
		this.requestType = requestType;
		this.responsePayload = responsePayload;
	}
}
