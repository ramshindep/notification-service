package org.dnyanyog.dto;



import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Component
public class NotificationData {
	
	private String mode;
	 @NotNull(message = "Subject cannot be null")
	private String subject;
	 @NotNull(message = "body cannot be null")
	private String body;
	
	private String footer;
	@Email(message = " must be a valid email address")
	private String from;
	@Email(message = "must be a valid email address")
	private String to;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
}
