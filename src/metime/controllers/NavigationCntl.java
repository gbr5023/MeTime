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

import metime.models.Contact;
import metime.models.Event;
import metime.views.ContactUI;
import metime.views.EventUI;
import metime.views.MainMenuUI;

/**
 *
 * @author Gisward
 */
public class NavigationCntl {

    private final SearchCntl theSearchCntl;
    private final ContactCntl theContactCntl;
    private final EventCntl theEventCntl;
    private final MainMenuUI theMainMenuUI;

    public NavigationCntl() {
        System.out.println("Made it to NavigationCntl");
        this.theContactCntl = new ContactCntl(this);
        this.theSearchCntl = new SearchCntl(this);
        this.theEventCntl = new EventCntl(this);
        this.theMainMenuUI = new MainMenuUI(this);
    }

    public void requestMainMenuUI() {
        theMainMenuUI.setVisible(true);
    }

    public void requestSearchUI() {
        theSearchCntl.requestSearchUI();
    }

    public SearchCntl getParentSearchCntl() {
        return this.theSearchCntl;
    }

    public void requestContactUI() {
        ContactUI theContactUI = new ContactUI(theContactCntl);
        theContactUI.setVisible(true);
    }

    public void requestContactUI(int theContactID) {
        Contact theContactToEdit = theContactCntl.getContact(theContactID);
        ContactUI theContactUI = new ContactUI(theContactCntl, theContactToEdit);
        theContactUI.setVisible(true);
    }

    public void requestEventUI() {
        EventUI theEventUI = new EventUI(theEventCntl);
        theEventUI.setVisible(true);
    }

    public void requestEventUI(int theEventID) {
        Event theEventToEdit = theEventCntl.getEvent(theEventID);
        EventUI theEventUI = new EventUI(theEventCntl, theEventToEdit);
        theEventUI.setVisible(true);
    }

    public EventCntl requestEventCntl() {
        return theEventCntl;
    }

    public void requestEventListUI() {
        theEventCntl.requestEventListUI();
    }

}
