/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package metime.models;

import metime.controllers.SerializedDataCntl;
import java.util.ArrayList;
import metime.Priority;

/**
 *
 * @author Gisward
 */
public final class EventList
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "events.ser";

    private ArrayList<Event> theListOfEvents;
    
    public EventList() {
        theListOfEvents = SerializedDataCntl.getSerializedDataCntl().getEventList();
        if (this.theListOfEvents.isEmpty()) {
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
        
        // Not using add() method in order to save time saving
        Event event1 = new Event("IST 331 Meeting", "4", "5", "2017", "16", "HUB");
        event1.setPriority(Priority.HIGH);
        theListOfEvents.add(event1);
        
        Event event2 = new Event("IST 311 Meeting", "4", "7", "2017", "15", "30", "210 IST");
        event2.setPriority(Priority.LOW);
        theListOfEvents.add(event2);
        
        theListOfEvents.add(new Event("TA Grading Work", "4", "10", "2017", "12", "45", "113 IST"));
        theListOfEvents.add(new Event("Proctor Math 110 Exam", "5", "3", "2017", "8", "100 Thomas"));
        theListOfEvents.add(new Event("Dad's Birthday", "5", "6", "2017", "Hawaii"));
        
        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfEvents.size(); i++)
        {
            System.out.println(this.theListOfEvents.get(i).getDateTime());            
        }
        
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfEvents, STORAGE_FILE_PATH);
    }
    
    public void add(Event theEventToAdd){
        theListOfEvents.add(theEventToAdd);
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfEvents, STORAGE_FILE_PATH);
    }

    public Event get(int row) {
        return theListOfEvents.get(row);
    }
    
    public Event searchEventName(String nameToSearch)
    {
        for(int i = 0; i < this.theListOfEvents.size(); i++){
            Event eventToSearch = this.theListOfEvents.get(i);
            
            if(eventToSearch.getTitle().toLowerCase().contains(nameToSearch.toLowerCase()))
                return eventToSearch;
        }
        
        return null;
    }
    
    public Event searchEventLocation(String locationToSearch)
    {
        for(int i = 0; i < this.theListOfEvents.size(); i++){
            Event eventToSearch = this.theListOfEvents.get(i);
            
            if(eventToSearch.getLocation().toLowerCase().contains(locationToSearch.toLowerCase()))
            {
                return eventToSearch;
            }
        }
        
        return null;
    }

    public void remove(Event theEventID) {
       theListOfEvents.remove(theEventID);
       SerializedDataCntl.getSerializedDataCntl().setList(theListOfEvents, STORAGE_FILE_PATH);
    }
}
