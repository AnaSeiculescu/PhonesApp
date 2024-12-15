package org.example;

interface Phone {

	void addContact(String id, String phoneNumber, String firstName, String lastName);

	void seeAllContacts();

	void sendMessage(String phoneNumber, String messageContent);

	void call(String phoneNumber);

	void viewHistory();
}
