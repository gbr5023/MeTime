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
public class Contact extends Person
{
    public Contact(String newFirstName, String newLastName, int newPhone, String newEmail)
    {
        super(newFirstName, newLastName, newPhone, newEmail);
    }

    public Contact(String newContactFirstName, String newContactLastName, String newContactPhone, String newContactEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    
    ***** Accessor methods *****
    
    */
    @Override
    public String getFirstName()
    {
        return super.getFirstName();
    }
    
    @Override
    public String getLastName()
    {
        return super.getLastName();
    }
    
    @Override
    public String getFullName()
    {
        return super.getFullName();
    }
    
    @Override
    public int getPhone()
    {
        return super.getPhone();
    }
    
    @Override
    public String getEmail()
    {
        return super.getEmail();
    }
    
    /*
    
    ***** Mutator methods *****
    
    */
    @Override
    public void setFirstName(String newFirstName)
    {
        super.setFirstName(newFirstName);
    }   
    
    @Override
    public void setLastName(String newLastName)
    {
        super.setLastName(newLastName);
    } 
    
    @Override
    public void setPhone(int newPhone)
    {
        super.setPhone(newPhone);
    }
    
    @Override
    public void setEmail(String newEmail)
    {
        super.setEmail(newEmail);
    }
}
