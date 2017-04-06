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
public class EventCntl 
{
    private final EventList theEventList;
    private final ArrayList<Event> theListOfEvents;
    private int numOfInstantiations = 0;
    
    public EventCntl()
    {
        numOfInstantiations++;
        System.out.println("EventCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theEventList = new EventList();
        this.theListOfEvents = new ArrayList();
    }
    
    public void requestEventUI()
    {
        EventUI theEventUI = new EventUI();
        //this.theEventUI.pack();
        //this.theEventUI.setTitle("Create, Read, Update, & Delete Events");
        //this.theEventUI.setLocationRelativeTo(null);
        //this.theEventUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.theEventUI.setVisible(true);
    }
    
    public ArrayList<Event> getListOfEvents()
    {
        return this.theListOfEvents;
    }
    
    public void setListOfEvents(ArrayList<Event> updatedListOfEvents)
    {
        this.theEventList.setListOfEvents(updatedListOfEvents);
    }
}
