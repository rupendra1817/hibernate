package in.tecmentor.model;

public class CustomResponse {
	private Object data;
	private String responseMsg;
	private String responseCode;

	public CustomResponse(Object data, String responseMsg, String responseCode) {
		super();
		this.data = data;
		this.responseMsg = responseMsg;
		this.responseCode = responseCode;
	}

	public CustomResponse(String responseMsg, String responseCode) {
		super();
		this.responseMsg = responseMsg;
		this.responseCode = responseCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
