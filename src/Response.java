public class Response {
	private int responseType;
	private PayloadInterface responsePayload;

	public Response(int responseType, PayloadInterface responsePayload) {
		this.responseType = responseType;
		this.responsePayload = responsePayload;
	}

	public int getResponseType() {
		return responseType;
	}

	public PayloadInterface getResponsePayload() {
		return responsePayload;
	}
}
