/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.controllers;

import javax.swing.table.TableModel;
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
    
}
