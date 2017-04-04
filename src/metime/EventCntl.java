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
    NavigationCntl parentNavigationCntl;
    EventList theEventList;
    EventUI theEventUI;
    ArrayList<Event> theListOfEvents;
    int numOfInstantiations = 0;
    
    public EventCntl()
    {
        numOfInstantiations++;
        System.out.println("EventCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theEventList = new EventList();
        this.theListOfEvents = new ArrayList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the EventCntl");
        this.parentNavigationCntl = newParentNavigationCntl;
        this.requestEventUI();
    }
    
    public void requestEventUI()
    {
        this.theEventUI = new EventUI();
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
