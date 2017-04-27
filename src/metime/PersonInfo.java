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
public interface PersonInfo 
{
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getFullName();
    public abstract String getPhone();
    public abstract String getEmail();
    
    public abstract void setFirstName(String newFirstName);
    public abstract void setLastName(String newLastName);
    public abstract void setPhone(String newPhone);
    public abstract void setEmail(String newEmail);
}
