public class Request {
	private int requestType;
	private PayloadInterface requestPayload;

	public Request(int requestType, PayloadInterface requestPayload) {
		this.requestType = requestType;
		this.requestPayload = requestPayload;
	}

	public getRequestType() {
		return requestType;
	}

	public getRequestPayload() {
		return requestPayload;
	}
}
