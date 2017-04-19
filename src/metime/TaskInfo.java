/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

/**
 *
 * @author Gisward
 */
public interface TaskInfo 
{
    public abstract String getTitle();
    public abstract void setTitle(String newTask);
    
    public abstract int getMonth();
    public abstract void setMonth(String newTaskMonth);
    
    public abstract int getDay();
    public abstract void setDay(String newTaskDay);
    
    public abstract int getYear();
    public abstract void setYear(String newTaskYear);
    
    public abstract int getHour();
    public abstract void setHour(String newTaskHour);
    
    public abstract int getMinute();
    public abstract void setMinute(String newTaskMinute);
    
    public abstract String getDate();
    public abstract String getTime();
    public abstract String getDateTime();
}