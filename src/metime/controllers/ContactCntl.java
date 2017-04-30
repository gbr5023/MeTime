/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.controllers;

import metime.models.Contact;
import metime.models.ContactList;

/**
 *
 * @author Gisward
 */
public class ContactCntl {

    private final NavigationCntl parentNavigationCntl;
    private final ContactList theContactList;

    public ContactCntl(NavigationCntl newParentNavigationCntl) {
        this.theContactList = new ContactList();
        this.parentNavigationCntl = newParentNavigationCntl;
    }

    public ContactList getContactList() {
        return this.theContactList;
    }

    public void addContact(Contact theContactToAdd) {
        theContactList.add(theContactToAdd);
    }

    public NavigationCntl getParentNavigationCntl() {
        return this.parentNavigationCntl;
    }

    public void deleteContact(Contact theContactToEdit) {
        theContactList.delete(theContactToEdit);
    }

    public void saveContactList() {
        theContactList.save();
    }

    public Contact getContact(int theContactID) {
        return theContactList.get(theContactID);
    }
}
