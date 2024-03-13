Incomplete Data Rule
This rule checks if any of the required fields (mode, subject, body, to) in the NotificationRequest object are null. If any of these fields are null, it creates a NotificationResponse object with the corresponding error status, code, and message indicating incomplete data.

Invalid Mode Rule
This rule verifies if the mode specified in the NotificationRequest object is valid. It checks if the mode is not null and if it matches any of the values defined in the EmailConstant enum. If the mode is invalid, it generates a NotificationResponse object with an error status, code, and message indicating an invalid mode.
