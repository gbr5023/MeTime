/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class EventCntl 
{
    private NavigationCntl parentNavigationCntl;
    private EventList theEventList;
    private EventUI theEventUI;
    private ArrayList<Event> theListOfEvents;
    private int numOfInstantiations = 0;
    
    public EventCntl()
    {
        numOfInstantiations++;
        System.out.println("EventCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theEventList = new EventList();
        this.theListOfEvents = new ArrayList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        this.parentNavigationCntl = newParentNavigationCntl;
    }
    
    public void requestEventUI()
    {
        this.theEventUI = new EventUI(this);
        this.theEventUI.pack();
        this.theEventUI.setTitle("Create, Read, Update, & Delete Events");
        this.theEventUI.setLocationRelativeTo(null);
        this.theEventUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theEventUI.setVisible(true);
    }
    
    public ArrayList<Event> getListOfEvents()
    {
        return this.theEventList.getListOfEvents();
    }
    
    public void setListOfEvents(ArrayList<Event> updatedListOfEvents)
    {
        this.theEventList.setListOfEvents(updatedListOfEvents);
    }
    
    public void addEvent(Event theEventToAdd){
        theEventList.add(theEventToAdd);
    }
    
    public NavigationCntl getParentNavigationCntl() 
    {
        return this.parentNavigationCntl;
    }
    
    public EventList getEventList()
    {
        return this.theEventList;
    }
}
