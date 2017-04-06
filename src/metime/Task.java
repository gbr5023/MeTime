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
    private String taskTitle;
    private int taskMonth;
    private int taskDay;
    private int taskYear;
    private int taskHour;
    private int taskMinute;
    private String taskDate;
    private String taskTime;
    private String taskDateTime;
    
    // all day tasks
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear)
    {
        this.taskTitle = newTaskTitle;
        this.taskMonth = Integer.valueOf(newMonth);
        this.taskDay = Integer.valueOf(newDay);
        this.taskYear = Integer.valueOf(newYear);
    }
    
    // tasks that are only right on the hour (4:00, 12:00, etc.)
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear, String newHour)
    {
        this.taskTitle = newTaskTitle;
        this.taskMonth = Integer.valueOf(newMonth);
        this.taskDay = Integer.valueOf(newDay);
        this.taskYear = Integer.valueOf(newYear);
        this.taskHour = Integer.valueOf(newHour);
    }
    
    // tasks that have a specific minute start (4:30, 12:43, etc.)
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
        setTaskDate();
        setTaskTime();
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
    public void setTaskMonth(String newTaskMonth) 
    {
        this.taskMonth = Integer.valueOf(newTaskMonth);
    }

    @Override
    public void setTaskDay(String newTaskDay) 
    {
        this.taskDay = Integer.valueOf(newTaskDay);
    }

    @Override
    public void setTaskYear(String newTaskYear) 
    {
        this.taskYear = Integer.valueOf(newTaskYear);
    }

    @Override
    public void setTaskHour(String newTaskHour) 
    {
        this.taskHour = Integer.valueOf(newTaskHour);
    }

    @Override
    public void setTaskMinute(String newTaskMinute) 
    {
        this.taskMinute = Integer.valueOf(newTaskMinute);
    }

    @Override
    public void setTaskDate()
    {
        this.taskDate = this.taskMonth + "-" + this.taskDay + "-" + this.taskYear;
    }

    @Override
    public void setTaskTime() 
    {
        if(this.taskMinute == 0)
        {
            this.taskTime = this.taskHour + ":00";
        }
        else
        {
            this.taskTime = this.taskHour + ":" + this.taskMinute;
        }
    }
    
    @Override
    public void setTaskDateTime()
    {
        this.taskDateTime = this.taskDate + " @" + this.taskTime;
    }
}
