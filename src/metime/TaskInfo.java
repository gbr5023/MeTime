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
    public abstract String getTaskTitle();
    public abstract void setTaskTitle(String newTask);
    
    public abstract int getTaskMonth();
    public abstract void setTaskMonth(String newTaskMonth);
    
    public abstract int getTaskDay();
    public abstract void setTaskDay(String newTaskDay);
    
    public abstract int getTaskYear();
    public abstract void setTaskYear(String newTaskYear);
    
    public abstract int getTaskHour();
    public abstract void setTaskHour(String newTaskHour);
    
    public abstract int getTaskMinute();
    public abstract void setTaskMinute(String newTaskMinute);
    
    public abstract String getTaskDate();
    public abstract void setTaskDate();
    
    public abstract String getTaskTime();
    public abstract void setTaskTime();
    
    public abstract String getTaskDateTime();
    public abstract void setTaskDateTime ();
}