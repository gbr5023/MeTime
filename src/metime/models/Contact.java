/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.models;

/**
 *
 * @author Gisward
 */
public class Contact extends Person {

    public Contact(String newFirstName, String newLastName, String newPhone, String newEmail) {
        super(newFirstName, newLastName, newPhone, newEmail);
    }

    /*
    
    ***** Accessor methods *****
    
     */
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /*
    
    ***** Mutator methods *****
    
     */
    @Override
    public void setFirstName(String newFirstName) {
        super.setFirstName(newFirstName);
    }

    @Override
    public void setLastName(String newLastName) {
        super.setLastName(newLastName);
    }

    @Override
    public void setPhone(String newPhone) {
        super.setPhone(newPhone);
    }

    @Override
    public void setEmail(String newEmail) {
        super.setEmail(newEmail);
    }
}
