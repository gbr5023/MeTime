/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.models;

import metime.controllers.SerializedDataCntl;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public final class ContactList {

    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "contacts.ser";
    
    private ArrayList<Contact> theListOfContacts;

    public ContactList() {
        theListOfContacts = SerializedDataCntl.getSerializedDataCntl().getContactList();
        if (this.theListOfContacts.isEmpty()) {
            buildTestContactList();
        }
    }
    
    public void save() {
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfContacts, STORAGE_FILE_PATH);    
    }

    public void setListOfContacts(ArrayList<Contact> theContactList) {
        theListOfContacts = theContactList;
    }

    public void buildTestContactList() {
        this.theListOfContacts = new ArrayList();

        // Not using add() method in order to save time saving
        theListOfContacts.add(new Contact("Jane", "Doe", "1234567", "jdoe@email.com"));
        theListOfContacts.add(new Contact("John", "Edwards", "9876543", "jedwards@email.com"));
        theListOfContacts.add(new Contact("Justin", "Rosenthal", "2468024", "jrosenthal@email.com"));
        theListOfContacts.add(new Contact("Dana", "Shalit", "1357913", "dshalit@email.com"));
        theListOfContacts.add(new Contact("Giselle", "Redila", "1470147", "gredila@email.com"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfContacts.size(); i++) {
            System.out.println(this.theListOfContacts.get(i).getFullName() + ", Phone: "
                    + this.theListOfContacts.get(i).getPhone() + ", Email: "
                    + this.theListOfContacts.get(i).getEmail());
        }

        save();
    }

    public void add(Contact theContactToAdd) {
        theListOfContacts.add(theContactToAdd);
        save();
    }

    /* just copied from UserList class, but use the same logic to search for contacts */
    public int searchContactName(String nameToSearch) {
        for (int i = 0; i < this.theListOfContacts.size(); i++) {
            if (this.theListOfContacts.get(i).getFullName().toLowerCase().contains(nameToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public int searchContactPhone(String phoneToSearch) {
        boolean phoneMatch;

        for (int i = 0; i < this.theListOfContacts.size(); i++) {
            phoneMatch = this.theListOfContacts.get(i).getPhone().equals(phoneToSearch);
            if (phoneMatch) {
                return i;
            }
        }

        return -1;
    }

    public int searchContactEmail(String emailToSearch) {
        for (int i = 0; i < this.theListOfContacts.size(); i++) {
            if (this.theListOfContacts.get(i).getEmail().toLowerCase().contains(emailToSearch.toLowerCase())) {
                return i;
            }
        }

        return -1;
    }

    public void delete(Contact theContactToEdit) {
        boolean removed = theListOfContacts.remove(theContactToEdit);
        System.out.println("REMOVED : " + removed);
        save();
    }

    public Contact get(int theContactID) {
        return theListOfContacts.get(theContactID);
    }
}
