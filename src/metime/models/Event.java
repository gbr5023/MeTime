/*
 * Task Class (that Event is a subclass of) obtains the String literals from the UI class and converts them
    to integer values in that class

    This class (Event) sends all these values and conversions to its parent class to take care of
 */

package metime.models;

/**
 *
 * @author Gisward
 */
public class Event extends Task
{    
    private String newLocation;
    
    // events (tasks) that happen all day (birthdays, etc.)
    public Event(String newTaskTitle, String newMonth, String newDay, 
            String newYear, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear);
        this.newLocation = newLocation;
    }
    
    // events (tasks) with an exact date, but happens on the hour (4:00, 15:00, 11:00, etc.)
    public Event(String newTaskTitle, String newMonth, String newDay, 
            String newYear, String newHour, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear, newHour);
        this.newLocation = newLocation;
    }
    
    // events (tasks) with an exact date, hour, and minute
    public Event(String newTaskTitle, String newMonth, String newDay, 
            String newYear, String newHour, String newMinute, String newLocation)
    {
        super(newTaskTitle, newMonth, newDay, newYear, newHour, newMinute);
        this.newLocation = newLocation;
    }
    
    /*
    
    ***** Accessor methods *****
    
    */
    @Override
    public String getTitle()
    {
        return super.getTitle();
    }
    
    @Override
    public int getMonth()
    {
        return super.getMonth();
    }
    
    @Override
    public int getDay()
    {
        return super.getDay();
    }
    
    @Override
    public int getYear()
    {
        return super.getYear();
    }
    
    @Override
    public int getHour()
    {
        return super.getHour();
    }
    
    @Override
    public int getMinute()
    {
        return super.getMinute();
    }
    
    @Override
    public String getDate()
    {
        return super.getDate();
    }
    
    @Override
    public String getTime()
    {
        return super.getTime();
    }
    
    @Override
    public String getDateTime()
    {
        return super.getDateTime();
    }
    
    public String getLocation(){
        return this.newLocation;
    }
    
    /*
    
    ***** Mutator methods *****
    
    */
    @Override
    public void setTitle(String newTask)
    {
        super.setTitle(newTask);
    }
    
    @Override
    public void setMonth(String newTaskMonth)
    {
        super.setMonth(newTaskMonth);
    }
    
    @Override
    public void setDay(String newTaskDay)
    {
        super.setDay(newTaskDay);
    }
    
    @Override
    public void setYear(String newTaskYear)
    {
        super.setYear(newTaskYear);
    }
    
    @Override
    public void setHour(String newTaskHour)
    {
        super.setHour(newTaskHour);
    }
    
    @Override
    public void setMinute(String newTaskMinute)
    {
        super.setMinute(newTaskMinute);
    }
    
    public void setLocation(String newLocation){
        this.newLocation = newLocation;
    }
}
