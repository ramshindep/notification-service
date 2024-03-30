package org.dnyanyog.enums;

public enum ErrorCodes {
  EMAIL_SUCCESS("Success", "Notification Sent Successfully", "0000");

  private final String status;
  private final String message;
  private final String code;

  ErrorCodes(String status, String message, String code) {
    this.status = status;
    this.message = message;
    this.code = code;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public String getCode() {
    return code;
  }
}
