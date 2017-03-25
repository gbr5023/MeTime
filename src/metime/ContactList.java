/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class ContactList 
{
    private ArrayList<Contact> theListOfContacts;
    
    public ContactList()
    {
        // Do this if there are no real users
        if(this.theListOfContacts == null){
            buildTestContactList();
        }
    }
    
    public ArrayList<Contact> getListOfContacts()
    {
        if(this.theListOfContacts == null){
            buildTestContactList();
        }
        return this.theListOfContacts;
    }
    
    public void buildTestContactList()
    {
        this.theListOfContacts = new ArrayList();
        for(int i = 0; i < 100; i++)
        {
            String firstName = "Jane";
            String lastName = "Doe" + i;
            int phone = 1234567;
            String email = "jdoe@email.com";
            Contact newContact = new Contact(firstName, lastName, phone, email);
            theListOfContacts.add(newContact);
        }
    }
    /* just copied from UserList class, but use the same logic to search for contacts
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck)
    {
        boolean authenticated = false;
        boolean nameMatch = false;
        boolean passwordMatch = false;
        for(int i = 0; i < theListOfUsers.size(); i++){
            nameMatch = usernameToCheck.equals(theListOfUsers.get(i).getUsername());
            passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if(nameMatch && passwordMatch){
                authenticated = true;
                break;
            }
        }
        return authenticated;
    }
*/
}
