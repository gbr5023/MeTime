/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jxr5398
 */
public class EventTable extends AbstractTableModel {

     private static final String[] COLUMNS = {"Title", "Date/Time", "Location"};
     private final ArrayList<Event> theEventListData;

    /**
     *
     * @param theEventList
     */
    public EventTable(EventList theEventList){
        theEventListData = theEventList.getListOfEvents();
    }
    
    @Override
    public int getRowCount() {
        return theEventListData.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Event theEvent = theEventListData.get(row);
        
        switch(col){
            case 0: return theEvent.getTitle();
            case 1: return theEvent.getDateTime();
            case 2: return theEvent.getLocation();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int index) {
        return COLUMNS[index];
    }    
}
