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
public class User 
{
    private String username;
    private char[] password;
    
    public User(String newUsername, char[] newPassword)
    {
        this.username = newUsername;
        this.password = newPassword;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    
    public char[] getPassword()
    {
        return this.password;
    }
    
    public void setPassword(char[] newPassword)
    {
        this.password = newPassword;
    }
}
