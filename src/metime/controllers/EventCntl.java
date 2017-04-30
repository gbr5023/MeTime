/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.controllers;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import metime.Priority;
import metime.models.Event;
import metime.models.EventList;
import metime.models.EventTable;
import metime.views.EventListUI;

/**
 *
 * @author jxr5398
 */
public class EventCntl {

    private final NavigationCntl parentNavigationCntl;
    private final EventListUI theEventListUI;
    private final EventList theEventList;

    EventCntl(NavigationCntl parentNavigationCntl) {
        this.parentNavigationCntl = parentNavigationCntl;
        this.theEventList = new EventList();
        this.theEventListUI = new EventListUI(this);
    }

    public TableModel getEventListTableModel() {
        return new EventTable(theEventList);
    }

    public void requestNavigationController() {
        theEventListUI.setVisible(false);
        parentNavigationCntl.requestMainMenuUI();
    }

    void requestEventListUI() {
        theEventListUI.setVisible(true);
    }

    public Event getEvent(int row) {
        return theEventList.get(row);
    }

    public void decreasePriority(int selectedRow) {
        Event theEvent = getEvent(selectedRow);

        switch (theEvent.getPriority()) {
            case HIGH:
                theEvent.setPriority(Priority.MEDIUM);
                break;
            case MEDIUM:
                theEvent.setPriority(Priority.LOW);
                break;
            default:
                theEvent.setPriority(Priority.NEUTRAL);
        }
        
        theEventList.save();
    }

    public void increasePriority(int selectedRow) {
        Event theEvent = getEvent(selectedRow);

        switch (theEvent.getPriority()) {
            case LOW:
                theEvent.setPriority(Priority.MEDIUM);
                break;
            case MEDIUM:
                theEvent.setPriority(Priority.HIGH);
                break;
            case HIGH:
                break;
            default:
                theEvent.setPriority(Priority.LOW);
        }
        
        theEventList.save();
    }

    public void setListOfEvents(ArrayList<Event> updatedListOfEvents) {
        this.theEventList.setListOfEvents(updatedListOfEvents);
    }

    public void addEvent(Event theEventToAdd) {
        theEventList.add(theEventToAdd);
    }

    public ArrayList<Event> getListOfEvents() {
        return this.theEventList.getListOfEvents();
    }

    public EventList getEventList() {
        return this.theEventList;
    }

    public NavigationCntl getParentNavigationCntl() {
        return this.parentNavigationCntl;
    }

    public void deleteEvent(Event theEvent) {
        this.theEventList.remove(theEvent);
    }

}
