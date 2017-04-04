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
public abstract class Person implements PersonInfo
{
    String firstName;
    String lastName;
    String fullName;
    String username;
    char[] password;
    int phone;
    String email;
    
    public Person()
    {
        
    }
    
    public Person(String newFirstName, String newLastName, int newPhone, String newEmail)
    {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.phone = newPhone;
        this.email = newEmail;
    }
    
    @Override
    public String getFirstName()
    {
        return this.firstName;
    }
    
    @Override
    public String getLastName()
    {
        return this.lastName;
    }
    
    @Override
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public char[] getPassword()
    {
        return this.password;
    }
    
    @Override
    public int getPhone()
    {
        return this.phone;
    }
    
    @Override
    public String getEmail()
    {
        return this.email;
    }
    
    @Override
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    @Override
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    
    @Override
    public void setFullName()
    {
        this.fullName = this.firstName + " " + this.lastName;
    }
    
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    
    public void setPassword(char[] newPassword)
    {
        this.password = newPassword;
    }
    
    @Override
    public void setPhone(int newPhone)
    {
        this.phone = newPhone;
    }
    
    @Override
    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }
}
