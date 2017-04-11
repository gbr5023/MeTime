/*
 * Task Class (that Event is a subclass of) obtains the String literals from the UI class and converts them
    to integer values in that class

    This class (Event) sends all these values and conversions to its parent class to take care of
 */

package metime;

import java.io.Serializable;

/**
 *
 * @author Gisward
 */
public class Event extends Task implements Serializable
{    
    // events (tasks) that happen all day (birthdays, etc.)
    public Event(String newTaskTitle, String newMonth, String newDay, String newYear, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear, newLocation);
    }
    
    // events (tasks) with an exact date, but happens on the hour (4:00, 15:00, 11:00, etc.)
    public Event(String newTaskTitle, String newMonth, String newDay, String newYear, String newHour, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear, newHour, newLocation);
    }
    
    // events (tasks) with an exact date, hour, and minute
    public Event(String newTaskTitle, String newMonth, String newDay, String newYear, String newHour, String newMinute, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear, newHour, newMinute, newLocation);
    }
    
    /*
    
    ***** Accessor methods *****
    
    */
    @Override
    public String getTaskTitle()
    {
        return super.getTaskTitle();
    }
    
    @Override
    public int getTaskMonth()
    {
        return super.getTaskMonth();
    }
    
    @Override
    public int getTaskDay()
    {
        return super.getTaskDay();
    }
    
    @Override
    public int getTaskYear()
    {
        return super.getTaskYear();
    }
    
    @Override
    public int getTaskHour()
    {
        return super.getTaskHour();
    }
    
    @Override
    public int getTaskMinute()
    {
        return super.getTaskMinute();
    }
    
    @Override
    public String getTaskDate()
    {
        return super.getTaskDate();
    }
    
    @Override
    public String getTaskTime()
    {
        return super.getTaskTime();
    }
    
    @Override
    public String getTaskDateTime()
    {
        return super.getTaskDateTime();
    }
    
    /*
    
    ***** Mutator methods *****
    
    */
    @Override
    public void setTaskTitle(String newTask)
    {
        super.setTaskTitle(newTask);
    }
    
    @Override
    public void setTaskMonth(String newTaskMonth)
    {
        super.setTaskMonth(newTaskMonth);
    }
    
    @Override
    public void setTaskDay(String newTaskDay)
    {
        super.setTaskDay(newTaskDay);
    }
    
    @Override
    public void setTaskYear(String newTaskYear)
    {
        super.setTaskYear(newTaskYear);
    }
    
    @Override
    public void setTaskHour(String newTaskHour)
    {
        super.setTaskHour(newTaskHour);
    }
    
    @Override
    public void setTaskMinute(String newTaskMinute)
    {
        super.setTaskMinute(newTaskMinute);
    }
    
    @Override
    public void setTaskDate()
    {
        super.setTaskDate();
    }
    
    @Override
    public void setTaskTime()
    {
        super.setTaskTime();
    }

    @Override
    public void setTaskDateTime()
    {
        super.setTaskDateTime();
    }
}
