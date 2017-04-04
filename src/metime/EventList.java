/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class EventList 
{
    ArrayList<Event> theListOfEvents;
    
    public EventList() {
        // Do this if there are no real users
        if (this.theListOfEvents == null) {
            buildTestEventList();
        }
    }

    public ArrayList<Event> getListOfEvents() {
        if (this.theListOfEvents == null) {
            buildTestEventList();
        }
        return this.theListOfEvents;
    }

    public void buildTestEventList() {
        this.theListOfEvents = new ArrayList();
        
        /*
        this.theListOfEvents.add(new Event("Jane", "Doe", 1234567, "jdoe@email.com"));
        this.theListOfEvents.add(new Event("John", "Edwards", 9876543, "jedwards@email.com"));
        this.theListOfEvents.add(new Event("Justin", "Rosenthal", 2468024, "jrosenthal@email.com"));
        this.theListOfEvents.add(new Event("Dana", "Shalit", 1357913, "dshalit@email.com"));
        this.theListOfEvents.add(new Event("Giselle", "Redila", 1470147, "gredila@email.com"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfEvents.size(); i++) 
        {
            System.out.println(this.theListOfEvents.get(i).getFullName() + ", Phone: "
                    + this.theListOfEvents.get(i).getPhone() + ", Email: "
                    + this.theListOfEvents.get(i).getEmail());
        }
*/
    }
}
