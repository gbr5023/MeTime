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
public abstract class Task implements TaskInfo
{
    String taskTitle;
    int taskMonth;
    int taskDay;
    int taskYear;
    int taskHour;
    int taskMinute;
    String taskDate;
    String taskTime;
    String taskDateTime;
    
    public Task()
    {
        
    }
    
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear, String newHour, String newMinute)
    {
        this.taskTitle = newTaskTitle;
        this.taskMonth = Integer.valueOf(newMonth);
        this.taskDay = Integer.valueOf(newDay);
        this.taskYear = Integer.valueOf(newYear);
        this.taskHour = Integer.valueOf(newHour);
        this.taskMinute = Integer.valueOf(newMinute);
    }
    /*
    Accessor methods
    */
    
    @Override
    public String getTaskTitle() 
    {
        return this.taskTitle;
    }

    @Override
    public int getTaskMonth() 
    {
        return this.taskMonth;
    }

    @Override
    public int getTaskDay() 
    {
        return this.taskDay;
    }

    @Override
    public int getTaskYear() 
    {
        return this.taskYear;
    }

    @Override
    public int getTaskHour() 
    {
        return this.taskHour;
    }

    @Override
    public int getTaskMinute() 
    {
        return this.taskMinute;
    }

    @Override
    public String getTaskDate() 
    {
        return this.taskDate;
    }
    
    @Override
    public String getTaskTime() 
    {
        return this.taskTime;
    }
    
    @Override
    public String getTaskDateTime()
    {
        setTaskDateTime();
        return this.taskDateTime;
    }

    /*
    Mutator methods
    */
    @Override
    public void setTaskTitle(String newTask) 
    {
        this.taskTitle = newTask;
    }

    @Override
    public void setTaskMonth(int newTaskMonth) 
    {
        this.taskMonth = newTaskMonth;
    }

    @Override
    public void setTaskDay(int newTaskDay) 
    {
        this.taskDay = newTaskDay;
    }

    @Override
    public void setTaskYear(int newTaskYear) 
    {
        this.taskYear = newTaskYear;
    }

    @Override
    public void setTaskHour(int newTaskHour) 
    {
        this.taskHour = newTaskHour;
    }

    @Override
    public void setTaskMinute(int newTaskMinute) 
    {
        this.taskMinute = newTaskMinute;
    }

    @Override
    public void setTaskDate(String newTaskDate)
    {
        this.taskDate = this.taskMonth + " " + this.taskDay + " " + this.taskYear;
    }

    @Override
    public void setTaskTime(String newTaskTime) 
    {
        this.taskTime = this.taskHour + " " + this.taskMinute;
    }
    
    @Override
    public void setTaskDateTime()
    {
        this.taskDateTime = this.taskDate + " " + this.taskTime;
    }
}
