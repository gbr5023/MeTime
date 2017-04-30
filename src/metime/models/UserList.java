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

import metime.controllers.SerializedDataCntl;
import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public final class UserList {

    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "users.ser";
    private ArrayList<User> theListOfUsers;

    public UserList() {
        theListOfUsers = SerializedDataCntl.getSerializedDataCntl().getUserList();
        if (theListOfUsers.isEmpty()) {
            buildTestUserList();
        }
    }

    public ArrayList<User> getListOfUsers() {
        return theListOfUsers;
    }

    public void buildTestUserList() {
        theListOfUsers = new ArrayList();
        for (int i = 0; i < 100; i++) {
            String firstName = "Jane";
            String lastName = "Doe" + i;
            String username = ("test" + i);
            char[] password = {'1', '2', '3', '4'};
            String email = "jdoe@email.com";
            User newUser = new User(firstName, lastName, username, password, email);
            System.out.println("New user " + username);
            theListOfUsers.add(newUser);
        }

        SerializedDataCntl.getSerializedDataCntl().setList(theListOfUsers, STORAGE_FILE_PATH);
    }

    public boolean authenticate(String usernameToCheck, char[] passwordToCheck) {
        for (int i = 0; i < theListOfUsers.size(); i++) {
            boolean nameMatch = usernameToCheck.equals(theListOfUsers.get(i).getUsername());
            boolean passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if (nameMatch && passwordMatch) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String username) {
        return theListOfUsers.stream().anyMatch((theUser) -> (theUser.getUsername().equals(username)));
    }

    public void add(User theUserToAdd) {
        theListOfUsers.add(theUserToAdd);
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfUsers, STORAGE_FILE_PATH);
    }
}
