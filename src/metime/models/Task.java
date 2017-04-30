/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime.models;

import java.io.Serializable;
import metime.TaskInfo;

/**
 *
 * @author Gisward
 */
public abstract class Task implements TaskInfo, Serializable {

    private String taskTitle;
    private int taskMonth;
    private int taskDay;
    private int taskYear;
    private int taskHour;
    private int taskMinute;

    // all day tasks
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear) {
        this.taskTitle = String.valueOf(newTaskTitle);
        this.taskMonth = Integer.valueOf(newMonth);
        this.taskDay = Integer.valueOf(newDay);
        this.taskYear = Integer.valueOf(newYear);
    }

    // tasks that are only right on the hour (4:00, 12:00, etc.)
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear,
            String newHour) {
        this.taskTitle = String.valueOf(newTaskTitle);
        this.taskMonth = Integer.valueOf(newMonth);
        this.taskDay = Integer.valueOf(newDay);
        this.taskYear = Integer.valueOf(newYear);
        this.taskHour = Integer.valueOf(newHour);
    }

    // tasks that have a specific minute start (4:30, 12:43, etc.)
    public Task(String newTaskTitle, String newMonth, String newDay, String newYear,
            String newHour, String newMinute) {
        this.taskTitle = String.valueOf(newTaskTitle);
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
    public String getTitle() {
        return this.taskTitle;
    }

    @Override
    public int getMonth() {
        return this.taskMonth;
    }

    @Override
    public int getDay() {
        return this.taskDay;
    }

    @Override
    public int getYear() {
        return this.taskYear;
    }

    @Override
    public int getHour() {
        return this.taskHour;
    }

    @Override
    public int getMinute() {
        return this.taskMinute;
    }

    @Override
    public String getDate() {
        return this.taskMonth + "-" + this.taskDay + "-" + this.taskYear;
    }

    @Override
    public String getTime() {
        return this.taskHour + ":" + (this.taskMinute == 0 ? "00" : this.taskMinute);
    }

    @Override
    public String getDateTime() {
        return this.getDate() + " @" + this.getTime();
    }

    /*
    Mutator methods
     */
    @Override
    public void setTitle(String newTask) {
        this.taskTitle = String.valueOf(newTask);
    }

    @Override
    public void setMonth(String newTaskMonth) {
        this.taskMonth = Integer.valueOf(newTaskMonth);
    }

    @Override
    public void setDay(String newTaskDay) {
        this.taskDay = Integer.valueOf(newTaskDay);
    }

    @Override
    public void setYear(String newTaskYear) {
        this.taskYear = Integer.valueOf(newTaskYear);
    }

    @Override
    public void setHour(String newTaskHour) {
        this.taskHour = Integer.valueOf(newTaskHour);
    }

    @Override
    public void setMinute(String newTaskMinute) {
        this.taskMinute = Integer.valueOf(newTaskMinute);
    }
}
