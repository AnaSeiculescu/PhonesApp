package org.example;

interface Phone {

	void addContact(Integer id, String phoneNumber, String firstName, String lastName);

	void seeAllContacts();

	void sendMessage(String phoneNumber, String messageContent);

	void call(String phoneNumber);

	void viewHistory();

	public void getFirstContact();

	public void getLastContact();

	public void getFirstMessage(String phoneNumber);

	public void getSecondMessage(String phoneNumber);

	public void seeAllMessages(String phoneNumber);
}
