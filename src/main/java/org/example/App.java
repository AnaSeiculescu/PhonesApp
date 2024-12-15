package org.example;

public class App 
{
    public static void main(String[] args) {

//        Phone phone= new Samsung(); // shouldn't compile

        Phone phone = new SamsungGalaxy6("587125458652325");

        phone.addContact("1", "0743005082", "Bogdan", "Pop");

        phone.addContact("2", "0743005888", "Alina", "Cazacu");

//        phone.getFirstContact();

//        phone.getLastContact();

// send a message to the first contact from the previously listed

// max number of characters - 100

        phone.sendMessage("0743005082", "Am ajuns acasa.");

//        phone.getFirstMessage("phone number");

//        phone.getSecondMessage("phone number");

// make a call to the second contact from the previously listed

        phone.call("0743005888");

        phone.viewHistory();
    }
}
