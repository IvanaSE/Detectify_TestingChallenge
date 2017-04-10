package com.detectify.TestingChallenge;

import java.util.List;

public class Hook {
	private String url = "";
	private List<String> message_types = null;
	

	public Hook(String url, List<String> message_types) {
		this.url = url;
		this.message_types = message_types;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getMessage_types() {
		return message_types;
	}
	public void setMessage_types(List<String> message_types) {
		this.message_types = message_types;
	}
	
	public void addMessage_type(String message_type) {
		this.message_types.add(message_type);
	}

}
