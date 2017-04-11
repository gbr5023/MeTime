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
public final class EventList
{
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "events.ser";

    private ArrayList<Event> theListOfEvents;
    
    public EventList() {
        theListOfEvents = SerializedDataCntl.getSerializedDataCntl().getList(STORAGE_FILE_PATH);
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
        theListOfEvents.add(new Event("IST 331 Meeting", "4", "5", "2017", "16", "HUB"));
        theListOfEvents.add(new Event("IST 311 Meeting", "4", "7", "2017", "15", "30", "210 IST"));
        theListOfEvents.add(new Event("TA Grading Work", "4", "10", "2017", "12", "45", "113 IST"));
        theListOfEvents.add(new Event("Proctor Math 110 Exam", "5", "3", "2017", "8", "100 Thomas"));
        theListOfEvents.add(new Event("Dad's Birthday", "5", "6", "2017", "Hawaii"));
        
        System.out.println();
        System.out.println("For testing purposes: ");
        for (int i = 0; i < this.theListOfEvents.size(); i++)
        {
            System.out.println(this.theListOfEvents.get(i).getTaskDateTime());
        }
        
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfEvents, STORAGE_FILE_PATH);
    }
    
    public String getLastEvent()
    {
        int i = this.theListOfEvents.size() - 1;
        String theNewEvent = "Added \"" + this.theListOfEvents.get(i).getTaskTitle() + "\": "+ this.theListOfEvents.get(i).getTaskDateTime();
        
        return theNewEvent;
    }
    
    public void add(Event theEventToAdd){
        theListOfEvents.add(theEventToAdd);
        SerializedDataCntl.getSerializedDataCntl().setList(theListOfEvents, STORAGE_FILE_PATH);
    }
}
