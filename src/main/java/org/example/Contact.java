package org.example;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private List<String> messages;

	public Contact(String phoneNumber, String firstName, String lastName) {
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.messages = new ArrayList<>();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addMessage(String message){
		messages.add(message);
	};

	public String getFirstMessage() {
		return messages.size() > 0 ? messages.get(1) : "No messages.";
	}

	public String getSecondMessage() {
		return messages.size() > 1 ? messages.get(2) : "No second message.";
	}

	public List<String> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"phoneNumber='" + phoneNumber + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", messages=" + messages +
				'}';
	}
}
