/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

/**
 *
 * @author Gisward
 */
public class Contact extends Person
{
    String contactFirstName;
    String lastName;
    String fullName;
    int phone;
    String email;
    
    public Contact(String newFirstName, String newLastName, int newPhone, String newEmail)
    {
        super(newFirstName, newLastName, newPhone, newEmail);
    }
    
    @Override
    public String getFirstName()
    {
        return super.getFirstName();
    }
    
    @Override
    public void setFirstName(String newFirstName)
    {
        super.setFirstName(newFirstName);
    }
    
    @Override
    public String getLastName()
    {
        return super.getLastName();
    }
    
    @Override
    public void setLastName(String newLastName)
    {
        super.setLastName(newLastName);
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
    public void setPhone(int newPhone)
    {
        super.setPhone(newPhone);
    }
    
    @Override
    public String getEmail()
    {
        return super.getEmail();
    }
    
    @Override
    public void setEmail(String newEmail)
    {
        super.setEmail(newEmail);
    }
}
