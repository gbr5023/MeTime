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
package metime;

import metime.controllers.LoginCntl;

/**
 *
 * @author Gisward
 */
public class MeTime {

    public static void main(String[] args) {
        LoginCntl theLoginCntl = new LoginCntl();
        theLoginCntl.requestLoginUI();
    }

}
