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
    public abstract void setTaskMonth(int newTaskMonth);
    
    public abstract int getTaskDay();
    public abstract void setTaskDay(int newTaskDay);
    
    public abstract int getTaskYear();
    public abstract void setTaskYear(int newTaskYear);
    
    public abstract int getTaskHour();
    public abstract void setTaskHour(int newTaskHour);
    
    public abstract int getTaskMinute();
    public abstract void setTaskMinute(int newTaskMinute);
    
    public abstract String getTaskDate();
    public abstract void setTaskDate(String newTaskDate);
    
    public abstract String getTaskTime();
    public abstract void setTaskTime(String newTaskTime);
    
    public abstract String getTaskDateTime();
    public abstract void setTaskDateTime ();
}