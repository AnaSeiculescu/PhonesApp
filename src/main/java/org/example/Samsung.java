package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Samsung implements Phone {
	private final int batteryLife;
	private final String color;
	private final String material;
	private final String IMEI;

	private final Map<Integer, Contact> contacts;
	private final List<String> callHistory;

	public Samsung(int batteryLife, String IMEI, String color, String material) {
		this.batteryLife = batteryLife;
		this.IMEI = IMEI;
		this.color = color;
		this.material = material;
		this.contacts = new HashMap<>();
		this.callHistory = new ArrayList<>();
	}

	public void addContact(Integer id, String phoneNumber, String firstName, String lastName) {
		if (contacts.containsKey(id)) {
			System.out.println("Contact ID already exists.");
		} else {
			contacts.put(id, new Contact(phoneNumber, firstName, lastName));
		}
	}

	public Contact getContactById(int id) {
		return contacts.get(id);
	}

	public void seeAllContacts() {
		System.out.println("Your contacts are: " + "\n");
		if (contacts.isEmpty()) {
			System.out.println("Your contact list is empty.");
		} else {
			for (Map.Entry entry : contacts.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

	public void sendMessage(String phoneNumber, String messageContent) {
		if (messageContent.length() > 500) {
			System.out.println("The message has too many characters.");
		}

		for (Contact contact : contacts.values()) {
			if (contact.getPhoneNumber().equals(phoneNumber)) {
				contact.addMessage(messageContent);
				return;
			}
		}
		System.out.println("Contact not found!");
	}

	public void seeAllMessages(HashMap<String, Contact> contacts, String contactId) {
		Contact contact = contacts.get(contactId);

		if (contact != null) {
			System.out.println("Messages for " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber() + ":");
			for (String message : contact.getMessages()) {
				System.out.println(message);
			}
		} else {
			System.out.println("Contact with ID " + contactId + " not found.");
		}
	}

	public void call(String phoneNumber) {
		for (Contact contact : contacts.values()) {
			if (contact.getPhoneNumber().equals(phoneNumber)) {
				callHistory.add("Called: " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
				return;
			}
		}
		System.out.println("Contact not found.");
	}

	public void viewHistory() {
		if (callHistory.isEmpty()) {
			System.out.println("No call history.");
		} else {
			for (String call : callHistory) {
				System.out.println(call);
			}
		}
	}

	public void getFirstContact() {
		if (contacts.isEmpty()) {
			System.out.println("Your contact list is empty.");
		} else {
			for (Map.Entry entry : contacts.entrySet()) {
				if (entry.getKey() == "1") {
					System.out.println("Your first contact is: " + entry);
				}
			}
		}
	}

	public void getLastContact() {
		int maxId = -1;
		Contact lastContact = null;

		for (Map.Entry<Integer, Contact> entry : contacts.entrySet()) {
			if (entry.getKey() > maxId) {
				maxId = entry.getKey();
				lastContact = entry.getValue();
			}
		}
		System.out.println("Your last contact is: " + lastContact);
	}

	public void getFirstMessage(String phoneNumber) {
		for (Contact contact : contacts.values()) {
			if (contact != null && contact.getPhoneNumber().equals(phoneNumber)) {
				String firstMessage =  contact.getMessages().size() > 0 ? contact.getMessages().get(0) : "No messages.";
				System.out.println("First message is :" + firstMessage);
			}
		}
		System.out.println("The contact whom message you are requesting is not in your list, or the list empty.");
	}

	public void getSecondMessage(String phoneNumber) {
		for (Contact contact : contacts.values()) {
			if (contact != null && contact.getPhoneNumber().equals(phoneNumber)) {
				String secondMessage =  contact.getMessages().size() > 1 ? contact.getMessages().get(1) : "No second message.";
				System.out.println("Second message is: " + secondMessage);
			}
		}
		System.out.println("The contact whom message you are requesting is not in your list, or the list empty.");
	}
}
