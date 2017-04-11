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
public final class ContactList 
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "contacts.ser";
    private ArrayList<Contact> theListOfContacts;
    
    public ContactList()
    {
        theListOfContacts = SerializedDataCntl.getSerializedDataCntl().getList(STORAGE_FILE_PATH);
        if(this.theListOfContacts.isEmpty()){
            buildTestContactList();
        }
    }
    
    public void setListOfContacts(ArrayList<Contact> theContactList){
        theListOfContacts = theContactList;
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
        
        theListOfContacts.add(new Contact("Jane", "Doe", 1234567, "jdoe@email.com"));
        theListOfContacts.add(new Contact("John", "Edwards", 9876543, "jedwards@email.com"));
        theListOfContacts.add(new Contact("Justin", "Rosenthal", 2468024, "jrosenthal@email.com"));
        theListOfContacts.add(new Contact("Dana", "Shalit", 1357913, "dshalit@email.com"));
        theListOfContacts.add(new Contact("Giselle", "Redila", 1470147, "gredila@email.com"));

        
        System.out.println();
        System.out.println("For testing purposes: ");
        for(int i = 0; i < this.theListOfContacts.size(); i++)
        {
            System.out.println(this.theListOfContacts.get(i).getFullName() + ", Phone: " + 
                    this.theListOfContacts.get(i).getPhone() + ", Email: " +
                    this.theListOfContacts.get(i).getEmail());
        }
        /*
        for(int i = 0; i < 100; i++)
        {
            String firstName = "Jane";
            String lastName = "Doe" + i;
            int phone = 1234567;
            String email = "jdoe@email.com";
            Contact newContact = new Contact(firstName, lastName, phone, email);
            this.theListOfContacts.add(newContact);
        }
        */
        
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfContacts, STORAGE_FILE_PATH);
    }
    
    public void add(Contact theContactToAdd){
        theListOfContacts.add(theContactToAdd);
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfContacts, STORAGE_FILE_PATH);
    }
    
    /* just copied from UserList class, but use the same logic to search for contacts */
    public Contact searchContactName(String nameToSearch)
    {
        //boolean nameMatch;
        boolean firstNameMatch;
        boolean lastNameMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            firstNameMatch = contactToSearch.getFirstName().contains(nameToSearch);
            lastNameMatch = contactToSearch.getLastName().contains(nameToSearch);
            //nameMatch = contactToSearch.getFullName().contains(nameToSearch);
            if(firstNameMatch == true || lastNameMatch == true)
            {
                return contactToSearch;
            }
        }
        
        return null;
    }
    
    public Contact searchContactPhone(int phoneToSearch)
    {
        boolean phoneMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            phoneMatch = contactToSearch.getPhone() == phoneToSearch;
            if(phoneMatch){
                return contactToSearch;
            }
        }
        
        return null;
    }
    
    public Contact searchContactEmail(String emailToSearch)
    {
        boolean emailMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            emailMatch = contactToSearch.getEmail().equalsIgnoreCase(emailToSearch);
            if(emailMatch){
                return contactToSearch;
            }
        }
        
        return null;
    }
}
