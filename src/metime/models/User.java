/**
 * Overview
 * This is the second of five sprints you will implement towards completing your group project application prototype. 
 * In this sprint you will choose one of your four use cases for implementation. When completed, the functionality of 
 * the sprint should closely resemble the use case specification written earlier in the semester.
 * 
 * You should use Java FX/FXML for this sprint implementation. As discussed in the lesson on FX/FXML, 
 * there is a learning curve associated with moving from the Swing GUI Library but it will pay off as you work through 
 * the rest of the application.
 * 
 * Activity Description
 * This is a group assignment.
 * In this sprint your application should launch, authenticate a user against a list of test users, and, 
 * if the user is authenticated, open a navigation window where the user can choose what they want to do next. 
 * You did this part in the first sprint.
 * The use should then be able to navigate to one of the four use cases you defined as the scope of the application. 
 * The functionality should match or extend what you defined in the use case specification.
 * Make sure your application runs without error and be sure to include any required username and password information 
 * as a note on your Canvas submission.
 */
package metime.models;

/**
 *
 * @author Gisward
 */
public class User extends Person
{
    private String firstName;
    private String lastName;
    private String username;
    private char[] password;
    private String email;
    
    public User(String newFirstName, String newLastName, String newUsername, char[] newPassword, String newEmail)
    {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.username = newUsername;
        this.password = newPassword;
        this.email = newEmail;
    }
    
    @Override
    public String getFirstName()
    {
        return this.firstName;
    }
    
    @Override
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    @Override
    public String getLastName()
    {
        return this.lastName;
    }
    
    @Override
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    
    @Override
    public String getUsername()
    {
        return this.username;
    }
    
    @Override
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    
    @Override
    public char[] getPassword()
    {
        return this.password;
    }
    
    @Override
    public void setPassword(char[] newPassword)
    {
        this.password = newPassword;
    }
    
    @Override
    public String getEmail()
    {
        return this.email;
    }
    
    @Override
    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }
}
