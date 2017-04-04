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
    
    public void setListOfEvents(ArrayList<Event> updatedListOfEvents)
    {
        this.theListOfEvents = updatedListOfEvents;
    }

    public void buildTestEventList() {
        this.theListOfEvents = new ArrayList();
        
        
        this.theListOfEvents.add(new Event("IST 331 Meeting", "4", "5", "2017", "16"));
        this.theListOfEvents.add(new Event("IST 311 Meeting", "4", "7", "2017", "15", "30"));
        this.theListOfEvents.add(new Event("TA Grading Work", "4", "10", "2017", "12", "45"));
        this.theListOfEvents.add(new Event("Proctor Math 110 Exam", "5", "3", "2017", "8"));
        this.theListOfEvents.add(new Event("Dad's Birthday", "5", "6", "2017"));

        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfEvents.size(); i++) 
        {
            System.out.println(this.theListOfEvents.get(i).getTaskDateTime());
        }
    }
}
