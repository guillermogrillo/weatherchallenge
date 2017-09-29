package com.weather.challenge.util;

public class BaseResponse<T> {

	private int result;
	private String description;
	private T data;

	public BaseResponse(int result, String description) {
		this.result = result;
		this.description = description;
	}

	public BaseResponse() {
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
