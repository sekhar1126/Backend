package com.crm.app.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponseDTO {

	private  String apiPath;
	private HttpStatus errorCode;
	private String errorMsg;
	private LocalDateTime errorTime;
	public ErrorResponseDTO(String apiPath, HttpStatus errorCode, String errorMsg, LocalDateTime errorTime) {
		super();
		this.apiPath = apiPath;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorTime = errorTime;
	}
	public ErrorResponseDTO() {
		super();
	}
	public String getApiPath() {
		return apiPath;
	}
	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}
	public HttpStatus getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public LocalDateTime getErrorTime() {
		return errorTime;
	}
	public void setErrorTime(LocalDateTime errorTime) {
		this.errorTime = errorTime;
	}
	@Override
	public String toString() {
		return "ErrorResponseDTO [apiPath=" + apiPath + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg
				+ ", errorTime=" + errorTime + "]";
	}
	
}
