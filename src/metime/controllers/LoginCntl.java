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
package metime.controllers;

import metime.models.User;
import metime.views.LoginUI;
import metime.models.UserList;
import metime.views.RegisterUI;

/**
 *
 * @author Gisward
 */
public final class LoginCntl {

    private final UserList theUserList;
    private final LoginUI theLoginUI;

    private static String CUR_USERNAME;

    public LoginCntl() {
        System.out.println("Made it to LoginCntl");
        System.out.println("Username: test1");
        System.out.println("Password: 1234");
        theLoginUI = new LoginUI(this);
        this.theUserList = new UserList();
    }

    public static String getCurrentUser() {
        return CUR_USERNAME.toLowerCase();
    }

    public void requestLoginUI() {
        theLoginUI.setVisible(true);
    }

    public NavigationCntl requestNavigationCntl() {
        theLoginUI.dispose();
        return new NavigationCntl();
    }

    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck) {
        boolean auth = theUserList.authenticate(usernameToCheck, passwordToCheck);

        if (auth) {
            CUR_USERNAME = usernameToCheck;
        }

        return auth;
    }

    public void requestRegisterUI() {
        theLoginUI.setVisible(false);
        RegisterUI theRegisterUI = new RegisterUI(this);
        theRegisterUI.setVisible(true);
    }

    public boolean registerUser(String firstName, String lastName, String username, char[] password, String email) {
        if (theUserList.contains(username)) {
            return false;
        } else {
            theUserList.add(new User(firstName, lastName, username, password, email));
            return true;
        }
    }
}
